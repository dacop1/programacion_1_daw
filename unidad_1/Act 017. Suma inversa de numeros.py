#inicializamos la variable suma
suma = 0
#creamos el bucle desde el 100 al 1
for i in range(100, 0, -1):
    suma += i
    if i > 1:
        print(i, end="+")
    else:
        print(i, end="=")      
  
print("La suma de los nuemeros del 1 al 100 es:", suma )
    

