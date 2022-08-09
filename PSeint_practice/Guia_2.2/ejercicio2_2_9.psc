Algoritmo ejercicio2_2_9
	definir lado, linea, i, j Como Entero
	
	escribir "Ingrese el lado"
	leer lado
	
		
	// Linea completa
	para i=1 hasta lado con paso 1 Hacer
		escribir "*" sin saltar
	FinPara
	escribir ""

	//linea incompleta
	para i=1 hasta lado-2 con paso 1 Hacer
		escribir "*" sin saltar
		para j=1 hasta lado-2 con paso 1 Hacer
			escribir " " sin saltar
		FinPara
		escribir "*" sin saltar
		escribir ""
	FinPara
	
	// Linea completa
	para i=1 hasta lado con paso 1 Hacer
		escribir "*" sin saltar
	FinPara
	escribir ""
	escribir ""
	
FinAlgoritmo
