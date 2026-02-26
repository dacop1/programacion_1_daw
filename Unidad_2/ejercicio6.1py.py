# 1. Crea una lista vacía llamada 'a'
a=[]

# 2. Inicia un bucle 'for' usando range(inicio, parada, salto):
#    - Inicia en 2
#    - Se detiene ANTES del 11
#    - Avanza de 2 en 2
#    (Por lo tanto, 'i' tomará los valores: 2, 4, 6, 8, 10)
for i in range (2,11,2):
    
    # 3. Añade el valor actual de 'i' al final de la lista 'a'
    a.append(i)

# 4. Imprime la lista 'a' resultante [2, 4, 6, 8, 10]
print(a)

