# Definimos una función llamada 'par_o_impar' que recibe un número como argumento

def par_o_impar(numero):
    if numero % 2 == 0:
          print("el número es par")
    else:
       print("el número es impar")

numero = int(input("introduce un numero:"))

# Llamamos a la función pasándole el número introducido
(par_o_impar(numero))


