Algoritmo extra2_2_15
	definir j, i, limite como entero
	definir total como real
	
	escribir "Ingrese la cantidad de nros"
	leer limite
	
	para j =1 hasta limite
		
		total =1 
	
		para i =1 hasta j Hacer
			total = total * i
		FinPara
	
		escribir "factorial de " j " = " total
		
	FinPara
	
FinAlgoritmo
