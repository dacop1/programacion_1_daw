# Definimos el array
numeros = [25, 12, 30, 10, 8]

# --- Usando un bucle for ---
suma_for = 0
for n in numeros:
    suma_for += n

print("Suma usando for:", suma_for)

# --- Usando un bucle while ---
suma_while = 0
i = 0
while i < len(numeros):
    suma_while += numeros[i]
    i += 1

print("Suma usando while:", suma_while)
