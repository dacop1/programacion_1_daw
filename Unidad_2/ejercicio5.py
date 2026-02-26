# El bucle se ejecutará 5 veces (para i = 0, 1, 2, 3, 4)
for i in range(5):
    # Pide al usuario un número (lo convierte a float, o sea, con decimales)
    n=float(input("Introduzca el número: "))
    
    # IMPORTANTE: Esta línea REESCRIBE la lista 'a' en CADA iteración.
    # Crea una lista 'a' que contiene 5 copias del número 'n' recién introducido.
    a=[n]*5    
    
# Cuando el bucle termina, imprime la ÚLTIMA versión de la lista 'a'.
print(a)

