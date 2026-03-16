#inicializamos la variable
suma = 0
#creamos el bucle para que se mueva de dos en dos
for i in range(2, 101, 2):
    suma += i
    if i < 100:
        print(i, end="+")
    else:
        print(i, end="=")
        
  
print(" La suma de los nuemeros del 1 al 100 es:", suma )

