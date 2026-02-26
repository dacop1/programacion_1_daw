#escribir un programa que dado un numero decimal lo pase a positivo

num1 = float(input("introduce un numero:"))
numRedondeado = round(num1)
print(numRedondeado)

# Obtenemos el valor absoluto del número redondeado (si es negativo, lo convierte en positivo)

num1Abs = abs(numRedondeado)
print(num1Abs)



