#par o impar
def par_o_impar(numero):
    if numero % 2 == 0:
        return"el número es par"
    else:
        return"el número es impar"
              
numero = int(input("introduce un numero:"))
resultado = par_o_impar(numero)
print(resultado)
