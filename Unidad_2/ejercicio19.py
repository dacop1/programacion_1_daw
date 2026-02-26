# Importa los archivos (módulos) que contienen las funciones de búsqueda
# (Asumimos que ejercicio15.py tiene 'busquedaLineal')
import ejercicio15 
# (Asumimos que ejercicio16.py tiene 'Busqueda_binaria')
import ejercicio16 


# --- ESCENARIO 1: PRUEBA CON LISTA DESORDENADA ---
numeros = [55,10,20,00,4,500,60,70,80,30]
print(f"Dado el array desordenado: {numeros}")
eleccion = 60 # El número que queremos encontrar

print("\nBúsqueda Lineal")
# La búsqueda lineal SIEMPRE funciona, esté ordenada o no,
# porque revisa cada elemento uno por uno.
resultado=ejercicio15.busquedaLineal(numeros, eleccion)
if resultado != -1:
    print("El numero",eleccion,"se encuentra en la posicion",(resultado))
else:
    print("Ese numero no se encuentra.")
    
print("\nBúsqueda Binaria")
# La búsqueda binaria FALLARÁ (o dará un resultado incorrecto)
# porque asume que la lista está ordenada para poder descartar mitades.
resultado=ejercicio16.Busqueda_binaria(numeros, eleccion)
if resultado != -1:
    print("El numero",eleccion,"se encuentra en la posicion",(resultado))
else:
    print("Ese numero no se encuentra.") # <-- Lo más probable es que muestre esto

# Imprime un separador
print("\n" + "="*30 + "\n")

# --- ESCENARIO 2: PRUEBA CON LISTA ORDENADA ---
numeros = [0,10,20,30,40,50,60,70,80,90]
print(f"Mientras que dado un array sí ordenado: {numeros}")

print("\nBúsqueda Lineal")
# La búsqueda lineal sigue funcionando sin problemas.
resultado=ejercicio15.busquedaLineal(numeros, eleccion)
if resultado != -1:
    print("El numero",eleccion,"se encuentra en la posicion",(resultado))
else:
    print("Ese numero no se encuentra.")
    
print("\nBúsqueda Binaria")
# Ahora que la lista ESTÁ ORDENADA, la búsqueda binaria
# funcionará de forma correcta y muy eficiente.
resultado=ejercicio16.Busqueda_binaria(numeros, eleccion)
if resultado != -1:
    print("El numero",eleccion,"se encuentra en la posicion",(resultado))
else:
    print("Ese numero no se encuentra.")
