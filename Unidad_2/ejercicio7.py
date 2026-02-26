# Ejercicio 7

a=[1,2,3,4,5]

def maximo(t):
    #suponemos que el número más grande esta en la primera posición
    mayor = t[0]
#con este for each recorremos el array
    for numero in t:
        if numero>mayor:
            mayor=numero
    return mayor

print("el número más grande de la lista es: ",maximo(a))
    
