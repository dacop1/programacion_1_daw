# Definimos la lista inicial de alumnos
nombres = ["Pino", "Paco", "Juan", "Fran"]

print("Alumnos ahora: ", nombres)

# Pedimos al usuario que añada un nuevo nombre
nuevo = input("Añade otro alumno: ")

# Insertamos el nuevo alumno en el índice 2 (la tercera posición)
nombres.insert(2, nuevo)

# Mostramos la lista final actualizada
print("Alumnos actualizados:", nombres)
