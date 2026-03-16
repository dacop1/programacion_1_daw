# Pedimos al usuario que introduzca un número entero

num1 = int(input("Introduce un número: "))

# Inicializamos la variable 'factorial' con 1 (ya que multiplicar por 1 no cambia el resultado)

factorial = 1
for i in range(1, num1 + 1):
    factorial *= i

# Mostramos el resultado final

print("El factorial es:", factorial)

     

