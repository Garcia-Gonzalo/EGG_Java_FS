Algoritmo extra2_2_13
	
	definir frase Como Caracter
	definir i, long Como Entero
	
	escribir "Ingrese la palabra"
	leer frase
	
	long = Longitud(frase)
	
	para i=1 hasta long con paso 1 Hacer
		escribir subcadena(frase,long-i,long-i) sin saltar
	FinPara
	
FinAlgoritmo
