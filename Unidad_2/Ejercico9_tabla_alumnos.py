# Definimos la lista inicial de alumnos
nombres = ["Paco","Fran","Juan","Pino"]

print("Alumnos ahora: ", nombres)

# Pedimos al usuario que añada un nuevo nombre
nuevo = input("Añade otro alumno: ")

# Usamos .append() para añadir el nuevo alumno AL FINAL de la lista
nombres.append(nuevo)


# Mostramos la lista final actualizada
print("Alumnos actualizados:", nombres)
