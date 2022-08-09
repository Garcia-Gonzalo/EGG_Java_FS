Algoritmo guia2_1_Extra10
	definir precio, kilos, dto Como Real
	escribir "Ingrese el precio por Kg"
	leer precio
	Escribir "Ingrese los Kg de manzana que quiere comprar"
	leer kilos
	dto =1
	si kilos > 2 Entonces
		si kilos <= 5 Entonces
			dto = 0.9
		SiNo
			si kilos <= 10 Entonces
				dto = 0.85
			SiNo
				dto = 0.8
			FinSi
		FinSi
	FinSi
	
	Escribir  "El precio total es " precio*dto
	
FinAlgoritmo
