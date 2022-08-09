Algoritmo guia2_1_Extra9
	definir anio Como Entero
	
	escribir "Ingrese el año"
	leer anio
	
	si (anio%100 = 0) Y (anio%400=0) Entonces
		escribir "Es bisiesto"
	SiNo
		escribir "No es bisiesto"
		
	FinSi
	
FinAlgoritmo
