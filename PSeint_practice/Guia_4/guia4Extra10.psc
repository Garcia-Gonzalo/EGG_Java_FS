//Crear una matriz de orden n * m (donde n y m son valores ingresados por el usuario), llenarla
//con números aleatorios entre 1 y 100 y mostrar su traspuesta


subproceso traspuesta(matric, transp, m, n)
	definir i, j Como Entero
	
	para i= 0 hasta m-1
		para j=0 hasta n-1
			transp(j, i) = matric(i, j)
		FinPara
	FinPara
	
FinSubProceso

Subproceso completarMatrix(matric, m, n)
definir i, j Como entero

	para i= 0 hasta m-1 Hacer
		para j=0 hasta n-1 Hacer
			matric(i,j) = aleatorio(0,100)
		FinPara
	FinPara

FinSubProceso


SubProceso mostrarMatrix(matric, m,n)
	definir i, j Como entero
	
	para i= 0 hasta m-1 Hacer
		para j=0 hasta n-1 Hacer
			escribir matric(i,j) ' ' Sin Saltar
		FinPara
		escribir ''
	FinPara
	
FinSubProceso


Algoritmo guia4Extra10
	definir m, n, matric, transp Como Entero
	
	escribir "Ingrese las filas y columnas"
	leer m, n
	
	dimension matric(m,n), transp(n,m)
	
	completarMatrix(matric, m,n)
	mostrarMatrix(matric, m,n)
	
	escribir''
	
	traspuesta(matric, transp, m, n)
	mostrarMatrix(transp, n,m)
	
FinAlgoritmo