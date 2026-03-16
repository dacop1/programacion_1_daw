def promedio():
    suma = 0          # Acumula la suma de los números
    contador = 0      # Cuenta cuántos números se introducen

    while True:
        entrada = input("Introduce un número (o pulsa Enter para terminar): ")
        if entrada == "":   # Si se pulsa Enter sin escribir nada, se sale del bucle
            break
        numero = float(entrada)   # Convierte la entrada en número decimal
        suma = suma + numero      # Suma el número al total
        contador = contador + 1   # Incrementa el contador

    if contador > 0:
        promedio = suma / contador   # Calcula el promedio
        print("El promedio de los números introducidos es: " + str(promedio))
    else:
        print("No se introdujeron números")   # Mensaje si no se ingresó nada

# Llamada a la función
promedio()
