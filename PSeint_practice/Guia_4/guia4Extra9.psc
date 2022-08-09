//Realizar un programa que rellene de números aleatorios una matriz a través de un
//subprograma y generar otro subprograma que muestre por pantalla la matriz final.


subproceso completarMatrix(matric, m, n)
	definir i, j Como entero
	
	para i= 0 hasta m-1 Hacer
		para j=0 hasta n-1 Hacer
			matric(i,j) = aleatorio(0,9)
		FinPara
	FinPara
	
FinSubProceso

SubProceso mostrarMatrix(matric, m,n)
	definir i, j Como entero
	
	para i= 0 hasta m-1 Hacer
		para j=0 hasta n-1 Hacer
			escribir matric(i,j) Sin Saltar
		FinPara
		escribir ''
	FinPara
	
FinSubProceso

Algoritmo guia4Extra9
	definir m, n, matric Como Entero
	
	escribir "Ingrese las filas y columnas"
	leer m, n
	
	dimension matric(m,n)
	
	completarMatrix(matric, m,n)
	mostrarMatrix(matric, m,n)
FinAlgoritmo
