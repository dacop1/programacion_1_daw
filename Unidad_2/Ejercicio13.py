# --- Función para comprobar si un número es primo ---
def esPrimo(numero):
    # El 0, 1 y los negativos no son primos
    if numero <= 1:
        return False
    # El 2 es el único primo par
    if numero == 2:
        return True
    
    i = 2
    # Comprueba si tiene algún divisor exacto (módulo 0)
    while i < numero:
        if numero % i == 0:
            return False # Si encuentra un divisor, no es primo
        i += 1
    
    return True # Si sale del bucle, es primo

# --- Programa principal ---

a = [1,2,3,4,5,6,7,8,9,10] # Lista de números original
b = [] # Lista vacía para guardar los primos
i = 0 # Índice que usaremos para recorrer la lista 'a'

# Usamos un bucle 'while' porque vamos a MODIFICAR la lista 'a' mientras la recorremos
while i < len(a):
    if esPrimo(a[i]):
        # Si es primo, lo saca de 'a' (pop) y lo añade a 'b'
        b.append(a.pop(i))
        
        # IMPORTANTE: NO incrementamos 'i' aquí.
        # Al hacer pop(), la lista 'a' se acorta y el siguiente elemento
        # pasa a ocupar la posición 'i' que acabamos de revisar.
        
    else:
        # Si NO es primo, simplemente avanzamos al siguiente índice
        i = i + 1

# Imprime la lista 'a' (ahora solo con los NO primos)
print(a)
# Imprime la lista 'b' (con los primos que sacamos)
print(b)
