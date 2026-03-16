num1 = int(input("Introduce un número: "))

def primo(num1):
    if num1 <= 1:  # Los números menores o iguales a 1 no son primos
        return "No es primo"
    
    # Comprobamos divisibilidad desde 2 hasta num1-1
    for i in range(2, num1):
        if num1 % i == 0:  # Si se encuentra un divisor, no es primo
            return "No es primo"
    
    return "Es primo"

print(primo(num1))




