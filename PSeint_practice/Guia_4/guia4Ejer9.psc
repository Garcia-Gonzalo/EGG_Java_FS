//Escribir un programa que realice la búsqueda lineal de un número entero ingresado por el
//usuario en una matriz de 5x5, llena de números aleatorios y devuelva por pantalla las
//coordenadas donde se encuentra el valor, es decir en que fila y columna se encuentra. En
//caso de no encontrar el valor dentro de la matriz se debe mostrar un mensaje.


SubProceso llenaMatriz (matri)
	definir i, j Como Entero
	
	para i=0 hasta 4 Hacer
		para j=0 hasta 4 Hacer
			matri(i,j) = Aleatorio(0,9)
		FinPara
	FinPara
FinSubProceso

SubProceso buscaMatri(matri, val)
	definir i , j Como Entero
	definir hallado Como Logico
	
	hallado = falso
	
	para i=0 hasta 4 Hacer
		para j=0 hasta 4 Hacer
			si val= matri(i,j) Entonces
				escribir "El valor se encontró en la posicion " i ", " j
				hallado = Verdadero
			FinSi
		FinPara
	FinPara
	
	si hallado = falso Entonces
		escribir "No se ha hallado el valor en la matriz"
	FinSi
	
FinSubProceso

Algoritmo guia4Ejer9
	definir m, val como entero
	
	dimension m(5,5)
	
	escribir "Creando la matriz"
	
	llenaMatriz(m)
	
	escribir "Ingrese el valor a buscar (0-9)"
	leer val
	
	buscaMatri(m, val)
	
FinAlgoritmo
