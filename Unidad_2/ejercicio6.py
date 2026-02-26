# 1. Pide al usuario cuántos números va a querer introducir
cantidad=int(input("introduce la cantidad: "))

# 2. Crea una lista de 'cantidad' elementos, rellenándola con ceros.
#    (Ej: si cantidad=3, 'numeros' será [0, 0, 0])
numeros= [0] * cantidad

# 3. Inicializa un contador 'i' (índice) para el bucle
i=0

# --- Bucle para RELLENAR la lista ---
# 4. Se ejecuta mientras 'i' sea menor que la cantidad total
while i < cantidad:
    # 5. Pide un número y lo guarda en la posición [i] de la lista
    numeros[i]=int(input("introduce el numero: "))
    # 6. Incrementa el índice para pasar a la siguiente posición
    i +=1

print("Los numeros en orden inverso son :")

# --- Bucle para IMPRIMIR en orden inverso ---
# 7. Resetea 'i' al último índice válido (si cantidad=3, el último índice es 2)
i=cantidad-1

# 8. Se ejecuta mientras el índice 'i' sea 0 o mayor
while i >=0:
    # 9. Imprime el elemento en la posición actual 'i'
    print(numeros[i])
    # 10. Decrementa el índice para retroceder en la lista
    i-=1

# 11. Imprime la lista completa en su orden original
print("la lista es:",numeros)
