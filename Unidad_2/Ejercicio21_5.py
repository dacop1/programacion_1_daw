# m: La matriz (lista de listas) original con datos
m = [[1, 2, 3],
     [4, 5, 6],
     [7, 8, 9]]

# m2: La matriz de destino, del mismo tamaño que 'm' pero llena de ceros
m2 = [[0, 0, 0],
      [0, 0, 0],
      [0, 0, 0]]

# Recorremos los índices de las filas (0, 1, 2)
for fila in range(len(m)):
    # Para cada fila, recorremos los índices de las columnas (0, 1, 2)
    for columna in range(len(m[fila])):
        
        # (Este es el comentario original, ¡que está perfecto!)
        # Si el elemento es multiplo de 2 lo muevo a m2
        if m[fila][columna] % 2 == 0:
            
            # Copia el número par a la misma posición [fila][columna] en m2
            m2[fila][columna] = m[fila][columna]
            
            # Reemplaza el número original en 'm' con un 0
            m[fila][columna] = 0

# [Image showing the operation of moving even numbers from matrix m to matrix m2]

# Imprime la matriz 'm' resultante (solo impares y ceros)
print("M:")
for fila in m:
    print(fila) # Imprime cada fila en una nueva línea para que se vea como una matriz

# Imprime la matriz 'm2' resultante (solo pares y ceros)
print("\nM2:")
for fila in m2:
    print(fila) # Imprime cada fila en una nueva línea
