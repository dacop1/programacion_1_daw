# Define la Búsqueda Binaria.
# IMPORTANTE: 'array' DEBE estar ordenado para que esto funcione.
def Busqueda_binaria(array, n):
    



    inicio = 0 # Límite inferior del espacio de búsqueda
    fin = len(array) - 1 # Límite superior del espacio de búsqueda

    # El bucle se ejecuta mientras el espacio de búsqueda sea válido
    # (es decir, el inicio no haya superado al final)
    while inicio <= fin:
        # Calcula el índice central (división entera)
        medio = (inicio + fin) // 2
        
        # Comparamos el valor en el centro con el número buscado 'n'
        if array[medio] == n:
            return medio # ¡Encontrado! Devuelve el índice
        
        elif array[medio] < n:
            # Si 'n' es mayor, debe estar en la mitad DERECHA.
            # Descartamos la mitad izquierda actualizando 'inicio'.
            inicio = medio + 1
        
        else: # (array[medio] > n)
            # Si 'n' es menor, debe estar en la mitad IZQUIERDA.
            # Descartamos la mitad derecha actualizando 'fin'.
            fin = medio - 1

    # Si el bucle 'while' termina, significa que 'inicio' superó a 'fin'
    # y el número no se encontró.
    return -1

# --- Ejemplo de uso (comentado) ---
# 
# array_utilizada = [0, 10, 20, 30, 40, 50, 60, 70, 80, 90] # Lista ordenada
# num_buscar = int(input("Introduce cualquier decena del 0-90: "))
# 
# # Llamada a la función
# indice = Busqueda_binaria(array_utilizada, num_buscar)
# 
# # Imprime el resultado
# if indice != -1:
#     print("El número", num_buscar, "se encuentra en el índice", indice)
# else:
#     print("El número", num_buscar, "no se encuentra en el array.")

        
