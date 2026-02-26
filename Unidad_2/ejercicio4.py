#crear una lista con los sueldos iniciales
sueldos=[1800,1200,2000,1200,900]

#mostrar sueldos
print ("los sueldos son:",sueldos)


for i in range(len(sueldos)):
    sueldos[i] = sueldos[i] * 1.10  # Aumentar 10%

print("Sueldos actualizados:", sueldos)
