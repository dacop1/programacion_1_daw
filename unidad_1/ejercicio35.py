# Pedimos al usuario que introduzca su nombre

nombre = input("introduce un nombre:")

# Pedimos al usuario que introduzca una contraseña

clave = input("Introduzca una clave:")
longitud = len(clave)

# Mientras la contraseña tenga menos de 8 caracteres, seguimos pidiendo una nueva

while (len(clave) < 8):
    print("la contraseña debe tener al menos 8 caracteres")
    clave = input("introduce una clave de al menos 8 caracteres:")

print("contraseña correcta,","bienvenido", nombre,"!")
    

