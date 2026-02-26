import math  # Importamos el módulo 'math' para usar funciones matemáticas

# Solicitar un número al usuario
n1 = int(input("Escribe un número: "))

# Calculamos la raíz cuadrada del número usando math.sqrt()

raiz_cuadrada = math.sqrt(n1)


potencia = math.pow(n1, 2)

# Mostramos los resultados en pantalla convirtiendo los valores numéricos a texto con str()

print("La raíz cuadrada de " + str(n1) + " es: " + str(raiz_cuadrada))
print(str(n1) + " elevado al cuadrado es: " + str(potencia))

           


