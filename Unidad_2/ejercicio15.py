# Define una función de "búsqueda lineal"
# Recibe una 'lista' y un elemento 'n' que queremos encontrar
def busquedaLineal (lista, n):
    i = 0 # Inicializa un contador 'i' para usarlo como índice
    respuesta = -1 # Variable para guardar el resultado. -1 es el valor por defecto (no encontrado)

    

[Image of linear search algorithm]

    
    # Bucle 'while' que se ejecuta bajo dos condiciones:
    # 1. Que el índice 'i' no se haya salido de la lista
    # 2. Que AÚN no hayamos encontrado la respuesta (respuesta sigue valiendo -1)
    while i < len(lista) and respuesta == -1:
        # Comprueba si el elemento en la posición actual 'i' es el que buscamos
        if lista[i] == n:
            respuesta = i # Si lo es, guardamos el índice 'i' como respuesta
        
        i = i + 1 # Pasamos al siguiente índice para seguir buscando
    
    # Devuelve el resultado. Será el índice (si lo encontró) o -1 (si no lo encontró)
    return(respuesta)


# --- Bloques de código de ejemplo (comentados) ---

# import random
# 
# num = []
# for i in range(5):
#     numero = random.randint(0, 10)  # Generar un número entre 0 y 10
#     num.append(numero)
# 
# n = int(input("Introduzca el número que quiere buscar (entre 0 y 10): "))
# print(busquedaLineal(num,n))

# numeros=[1,2,3,4,5]
# numero_a_buscar=int(input("introduce un numero del 1-5: "))
# buscar_numero(numero_a_buscar,numeros) # (Esta llamada parece tener un nombre de función incorrecto)


