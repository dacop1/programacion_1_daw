tareas_dia = ["Revisar Email", "Llamar al cliente", "comprar café", "Actualizar reporte", "Planificar reunión"]
informe_ordenado= sorted(tareas_dia,key=str.lower)#crea una lista a partir de la original
print(tareas_dia)
print(informe_ordenado)
tareas_dia.sort(key=len)#modificando la lista original
print(tareas_dia)