# P es una matriz (lista de listas).
# Cada sub-lista parece ser [cantidad, precio]
P = [[5,10.5],[8.2,15],[1.5,3]]

# Inicializa un acumulador para la suma
suma = 0

# Recorre los índices de las FILAS (i tomará los valores 0, 1, 2)
for i in range(len(P)):
    # Recorre los índices de las COLUMNAS (j tomará los valores 0, 1)
    for j in range (len(P[0])):
        
        # Si el índice de la columna es 1 (es decir, el segundo elemento)...
        # (Esto seleccionará 10.5, 15 y 3)
        if j == 1:
            # ...añade el elemento P[i][j] a la suma total
            suma += P[i][j]
    
# Imprime el resultado final (10.5 + 15 + 3 = 28.5)
print("la suma es : ",suma)
