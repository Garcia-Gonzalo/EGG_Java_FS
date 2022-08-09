Algoritmo guia2_1_Extra8
	definir cantLlantas, precio Como Entero
	
	escribir "Ingrese la cantidad de llantas que compró"
	leer cantLlantas
	
	si cantLlantas < 5 Entonces
		precio = 3000
	SiNo
		si cantLlantas <= 10 Entonces
			precio = 2500
		SiNo
			precio = 2000
		FinSi
	FinSi
	
	escribir " Cada llanta tiene un costo de " precio
	escribir "su compra sera de " precio*cantLlantas
	
FinAlgoritmo
