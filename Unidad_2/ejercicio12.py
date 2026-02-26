a = [1,2,3,4,5,6,7,8,9,10]

# Itera sobre cada elemento 'e' de la lista 'a'
for e in a:
    # Si el elemento es par...
    if e % 2 == 0:
        # ...elimínalo de la propia lista 'a'
        a.remove(e)

# Imprime la lista resultante
print(a)
