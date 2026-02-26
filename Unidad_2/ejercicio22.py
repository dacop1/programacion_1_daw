# Define la matriz (lista de listas)
matriz = [
    ["A", "B", "C"], # Fila 0
    ["D", "E", "F"], # Fila 1
    ["G", "H", "I"]  # Fila 2
]

# (Los bloques 'while' y 'for' comentados arriba 
# estaban diseñados para imprimir la matriz POR COLUMNAS (A, D, G...),
# por eso intercambiaban los índices [j][i])

# --- Este es el bloque de código que SÍ se está ejecutando ---

# Itera sobre la lista principal 'matriz'.
#
# ¡OJO! Aunque la variable se llama 'columna', en realidad
# está guardando cada FILA en cada pasada del bucle:
# 1ª pasada: 'columna' será ["A", "B", "C"]
# 2ª pasada: 'columna' será ["D", "E", "F"]
# 3ª pasada: 'columna' será ["G", "H", "I"]
for columna in matriz:
    
    # Itera sobre cada 'elemento' dentro de la fila actual
    for elemento in columna:
        
        # Imprime el elemento y añade un espacio al final (end=' ') 
        # en lugar de un salto de línea.
        print(elemento, end=' ')

# El resultado final imprimirá todos los elementos seguidos 
# en una sola línea: A B C D E F G H I


