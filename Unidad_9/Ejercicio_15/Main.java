package Ejercicio_15;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Main {

    public static void main(String[] args) {

        try {

            // 1. Crear la factoría y el constructor de documentos
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // 2. Parsear el archivo XML
            Document documento = builder.parse(new File("config.xml"));

            // Normalizar el árbol XML
            documento.getDocumentElement().normalize();

            // 3. Obtener el elemento raíz (<configuracion>)
            Element raiz = documento.getDocumentElement();

            System.out.println("Elemento raíz: " + raiz.getNodeName());

            // 4. Obtener los hijos de <base-datos>
            NodeList listaBaseDatos = raiz.getElementsByTagName("base-datos");

            // Tomamos el primero
            Node nodoBaseDatos = listaBaseDatos.item(0);

            // 5. Ver sus hijos directos
            NodeList hijos = nodoBaseDatos.getChildNodes();

            System.out.println("\nNúmero de hijos detectados: " + hijos.getLength());

            System.out.println("\n--- Listando hijos ---");

            for (int i = 0; i < hijos.getLength(); i++) {

                Node hijo = hijos.item(i);

                System.out.println("Hijo " + i +
                        " -> Tipo: " + hijo.getNodeType() +
                        " | Nombre: " + hijo.getNodeName());
            }

            // Filtrar solo elementos reales
            System.out.println("\n--- Elementos reales ---");

            for (int i = 0; i < hijos.getLength(); i++) {

                Node hijo = hijos.item(i);

                // Solo nodos de tipo ELEMENT_NODE
                if (hijo.getNodeType() == Node.ELEMENT_NODE) {

                    Element elemento = (Element) hijo;

                    System.out.println(
                            elemento.getTagName() + ": " + elemento.getTextContent());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
