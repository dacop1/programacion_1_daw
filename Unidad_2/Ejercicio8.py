# --- Ejemplo dividir array (Slice) ---
a = [1,2,3,4,5,6,7,8]
print(a)

# SLICING: Se usa la sintaxis [inicio : parada : salto]
# 1. inicio: 0 (Coge el elemento en el índice 0 -> valor 1)
# 2. parada: 4 (Se detiene ANTES del índice 4)
# 3. salto: 2 (Avanza de 2 en 2)
#
# Cogerá:
# - Índice 0 (valor 1)
# - Índice 0+2 = 2 (valor 3)
# - Índice 2+2 = 4 (Aquí se detiene, porque la 'parada' es 4)
print(a[0:4:2]) 
# (Tu comentario era correcto, el resultado es [1, 3], pero es 
# porque coge los índices 0 y 2, no porque busque impares)

# --- Ejercicio 8 ---
nombre = ['D','a','n','i','e ',"l","", 'c','o','p','e','t',"e"]
print(nombre)

# Imprime un slice desde el índice 0 hasta ANTES del 6.
# (Forma la palabra 'Daniel')
print(nombre[0:6])

# Imprime un slice desde el índice 7 hasta el final de la lista
# (Forma la palabra 'copete')
print(nombre[7:len(nombre)])
