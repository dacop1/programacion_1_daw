# Definir función
def cuentaA(texto):
    cuenta = texto.count("a") + texto.count("A")
    return cuenta

# Definir función para contar y reemplazar
def cuentaYReemplazaA(texto):
    cuenta = texto.count("a") + texto.count("A")
    nuevoTexto = texto.replace("a", "X").replace("A", "X")
    return nuevoTexto

# Función que cuente todas las vocales y las reemplaza
def cuentaYReemplaza(texto):
    # Contar las vocales
    cuenta = texto.count("a") + texto.count("e") + texto.count("i") + texto.count("o") + texto.count("u") + \
            texto.count("A") + texto.count("E") + texto.count("I") + texto.count("O") + texto.count("U")
    
    # Reemplazar todas las vocales por 'x' y convertir a mayúsculas
    texto = texto.upper().replace("A", "X").replace("E", "X").replace("I", "X").replace("O", "X").replace("U", "X")
    
    return texto, cuenta  # Retornar el texto modificado y la cantidad de vocales

# Invocar funciones
frase = "Hola y Adios"
print(cuentaA(frase))  # Llamada a la función cuentaA
print(cuentaYReemplazaA(frase))  # Llamada a la función cuentaYReemplazaA
texto_modificado, cantidad_vocales = cuentaYReemplaza(frase)  # Llamada a la función cuentaYReemplaza
print("Texto modificado:", texto_modificado)
print("Cantidad de vocales:", cantidad_vocales)

