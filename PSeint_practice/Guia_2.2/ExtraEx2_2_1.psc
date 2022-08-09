Algoritmo ExtraEx2_2_1
	
	definir num, i, j Como Entero
	definir primo Como Logico
	
		
	para i=2 hasta 100 con paso 1 Hacer
		
		primo = Verdadero
		
		para j=2 hasta i con paso 1 Hacer
			
			si i<>j Entonces
				
				si i%j = 0 Entonces
					primo = Falso
				FinSi
				
			FinSi
			
		FinPara
		
		si primo Entonces
			escribir i
		FinSi
			
	FinPara
	
FinAlgoritmo
