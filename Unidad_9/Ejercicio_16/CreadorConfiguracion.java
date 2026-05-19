package Ejercicio_16;



import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class CreadorConfiguracion {
    public static void main(String[] args) {
        try {
            // === FASE 1: Inicializar el documento vacío ===
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document documento = builder.newDocument(); // Documento en blanco

            
            
            
            
			/*
			 * ¿Por qué? El DocumentBuilder es como una fábrica de documentos. Su método
			 * newDocument() te devuelve una hoja en blanco en memoria, donde luego
			 * construirás el árbol de nodos. Sin esto, no tienes dónde poner nada.
			 */ 
            
            
            
            // === FASE 2: Construir el árbol de Nodos/Elementos ===
            Element raiz = documento.createElement("videojuego");
            documento.appendChild(raiz);
            
            // TODO: Crear el elemento raíz <videojuego>
            Element pantalla = documento.createElement("pantalla");
            pantalla.setAttribute("resolucion", "1920*1080");
            pantalla.setTextContent("true");
            
            
            
            
//            ¿Por qué dos pasos?
//
//            		createElement("videojuego") crea el nodo, pero está flotando en memoria, no pertenece a nadie todavía.
//            		appendChild(raiz) lo ancla al documento como elemento raíz. Un documento XML solo puede tener UN elemento raíz.
            
            // TODO: Añadirlo al documento

            // TODO: Crear el elemento <pantalla>
 
            // TODO: asignarle atributo 

            // TODO: asignarle el texto interno
                     
            // ¡Crucial! Si no lo añades a la raíz, el nodo queda flotando en memoria
            raiz.appendChild(pantalla);

            // TODO: Crear el elemento <audio>, asignarle atributo y texto interno
            Element audio = documento.createElement("audio");
            audio.setAttribute("volumen", "80");
            audio.setTextContent("false");
            
            // TODO: Añadirlo al árbol en el lugar correcto

            // === FASE 3: El "Transformer" (Exportar memoria a archivo físico) ===
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            
            
            // Truco: Activar la indentación para que el XML no salga en una sola línea
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

            // Definir el origen (nuestro árbol DOM) y el destino (el archivo de texto)
            DOMSource origen = new DOMSource(documento);
            StreamResult destino = new StreamResult(new File("juego_config.xml"));
            transformer.transform(origen, destino);
            
            // TODO: Serializar utilizando el método transform del transformer

            System.out.println("¡Archivo XML generado con éxito de manera estructurada!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
