a = 5

if a == 2:
    print("Es primo")
else:
    es_primo = True
    i = 2
    
    while i < a:
        if a % i == 0:
            es_primo = False
            break
        i += 1
    
    if es_primo:
        print("Sí Primo")
    else:
        print("No Primo")
