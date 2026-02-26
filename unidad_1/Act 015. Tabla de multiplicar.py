#le pedimos al usuario que ingrese un número
n = int(input("Ingresa un numero y te muestro su tabla"))
#creamos el bucle cerrado
for i in range(11):

    resultado = n * i
    
    print(n, "x", i, "=",  resultado)
        

