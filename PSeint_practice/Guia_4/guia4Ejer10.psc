//Dada una matriz de orden n * m (donde n y m son valores ingresados por el usuario) realizar
//un subprograma que llene la matriz de numeros aleatorios. Despues, crearemos otro
//subprograma que calcule y muestre la suma de los elementos de la matriz. Mostrar la matriz y
//los resultados por pantalla.

SubProceso completarMatrix(matri, m, n)
	definir i, j Como Entero
	
	para i=0 hasta m-1 Hacer
		para j=0 hasta n-1 Hacer
			matri(i,j) = aleatorio(0,9)
		FinPara
	FinPara
FinSubProceso

SubProceso sumaMatrix(matri, m, n)
	definir i, j, suma  Como Entero
	
	suma=0
	
	para i=0 hasta m-1 Hacer
		para j=0 hasta n-1 Hacer
			suma = suma + matri(i,j)
		FinPara
	FinPara
	
	para i=0 hasta m-1 Hacer
		para j=0 hasta n-1 Hacer
			escribir matri(i,j) ' ' sin saltar
		FinPara
		escribir ''
	FinPara
	
	escribir "La suma es: " suma
	
FinSubProceso

Algoritmo guia4Ejer10
	definir m, n, matri Como Entero
	
	escribir "Ingrese la cantidad de filas y columnas"
	leer m, n
	
	dimension matri(m,n)
	completarMatrix(matri, m, n)
	sumaMatrix(matri, m,n)
	
FinAlgoritmo
