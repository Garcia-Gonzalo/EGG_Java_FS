Algoritmo ejercicio2_2_7
	definir frase Como Caracter
	definir i Como Entero
	
	escribir "Ingrese la frase"
	leer frase
	
	para i=0 hasta Longitud(frase) con paso 1 Hacer
		escribir SubCadena(frase,i,i) " " Sin Saltar
		
	FinPara
	
FinAlgoritmo
