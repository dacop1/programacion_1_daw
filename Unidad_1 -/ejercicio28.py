# Pedimos al usuario que introduzca un número entero

num1 = int(input("Introduce el numero al que se le  va a sumar solo números pares del 0 al 100:"))

# Inicializamos la variable 'total' con el valor introducido por el usuario

total = num1
for i in range(0,100,2):
        total +=i

# Mostramos el resultado final

print("el resultado es:",total)

