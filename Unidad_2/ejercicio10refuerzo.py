# Define una función que compara si tres listas son idénticas, ignorando mayúsculas
def compara_arrays(lista1, lista2, lista3):
    # (Tu comentario original)
    # Primero, comparo las longitudes de las tres listas
    
    # ¡OJO! Esta línea tiene un error lógico.
    # "and len(lista3)" solo comprueba si lista3 NO está vacía.
    # La forma correcta de comparar las tres longitudes sería:
    # if not (len(lista1) == len(lista2) == len(lista3)):
    if len(lista1) != len(lista2) and len(lista3): # <-- Esta es la línea con el error
        return False # Si las longitudes son distintas, devuelve Falso
    
    # (Tu comentario original)
    # Recorro las tres listas
    # Itera usando los índices (asumiendo que miden lo mismo)
    for i in range(len(lista1)):
        # (Tu comentario original)
        # Comparo los elementos sin tener en cuenta las mayúsculas/minúsculas
        # Pasa los caracteres a minúscula antes de compararlos
        if lista1[i].lower() != lista2[i].lower() or lista2[i].lower() != lista3[i].lower():
            return False # Si en cualquier punto un elemento no coincide, devuelve Falso
    
   
    # Si el bucle 'for' termina, significa que todos los elementos coincidían
    return True

# --- Pruebas ---
a = ["h","o","l","a"]
b = ["H","o","l","a"]
c = ["H","O","L","A"]

# Llama a la función e imprime el resultado.
# (En este caso, dará True porque todas tienen longitud 4 y los elementos coinciden)
print(compara_arrays(a,b,c))
