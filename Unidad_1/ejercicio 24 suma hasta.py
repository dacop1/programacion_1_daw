suma = 0
# Iniciamos el bucle donde seguimos pidiendo números hasta que el usuario ingrese 0
while True:
    numero = int(input("Ingresa un número (0 para terminar): "))
    if numero == 0:
        break
    suma += numero

print("La suma total es:", suma)




