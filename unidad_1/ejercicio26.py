# Pedimos al usuario que introduzca un número entero

num1 = int(input("Introduce un número al que se le va ha sumar los números del 1 al 100:"))

# Inicializamos la variable 'total' con el valor introducido por el usuario
total = num1
for i in  range(1,101):

        total +=i
# Mostramos el resultado final en pantalla

print("el resultado de la suma de los números del 1 al 100 es :",total)

