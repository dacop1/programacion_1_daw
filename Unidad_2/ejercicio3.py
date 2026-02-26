a=[1,2,3,4] # Define la lista

# range(len(a)) genera una secuencia de números basada en la longitud de 'a'.
# len(a) es 4, por lo que range(4) genera: 0, 1, 2, 3
for i in range (len(a)):
    # En cada pasada del bucle, 'i' toma el siguiente valor del rango (0, 1, 2, 3).
    # a[i] se usa para acceder al elemento en ese índice específico.
    # a[0] -> 1
    # a[1] -> 2
    # a[2] -> 3
    # a[3] -> 4
    print(a[i])
