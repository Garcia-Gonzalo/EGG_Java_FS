Algoritmo guia2_1_Extra4
	definir nafta, minutos, tarifa Como Real
	
	Escribir "Ingrese la cantidad de minutos de alquiler"
	leer minutos
	
	
	si (minutos/60) <= 2 Entonces
		escribir "Ha usado el auto menos de 2hs, tarifa $400 y nafta de cortesía"
	SiNo
		escribir "ingrese los litros de nafta utilizados"
		leer nafta
		tarifa = (minutos*5.2) + (nafta*40)
		Escribir  " La tarifa es de " tarifa
		
	FinSi
	
FinAlgoritmo
