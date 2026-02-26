# M: Es una matriz (una lista que contiene otras listas, las filas)
M = [[1,2,3],
     [4,5,6],
     [7,8,9]]

# Accede a la fila en el índice 1 (la segunda fila: [4,5,6])
# Luego accede al elemento en el índice 2 de ESA fila (el '6')
a = M[1][2]
print(a) # Imprime 6

# Accede a la fila en el índice 1 ([4,5,6])
# Luego accede al elemento en el índice 1 de ESA fila (el '5')
b = M[1][1]
print(b) # Imprime 5

# Recorre únicamente los elementos de la segunda fila (M[1])
for e in (M[1]): # 'e' tomará los valores 4, 5, y 6
    print(e)
    
# --- Recorrer la matriz completa ---

# El bucle 'for' exterior recorre la lista principal 'M'.
# 'fila' será [1,2,3], luego [4,5,6], etc.
for fila in M:
    # El bucle interior recorre cada 'elemento' dentro de la 'fila' actual
    for elemento in fila:
        # Imprime el elemento, pero usa 'end=" "' para poner un espacio 
        # en lugar de un salto de línea.
        print(elemento, end=" ") 
    
    # Cuando el bucle interior termina (se acabó la fila),
    # imprime un salto de línea vacío para pasar a la siguiente fila.
    print()
    



          
    
    

