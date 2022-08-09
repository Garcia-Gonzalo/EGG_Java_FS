//Realizar un programa que cree una matriz de 5x15 y deberemos llenar la matriz de unos y
//ceros. Llenando el marco o la delimitación externa de la matriz de unos y la parte interna de
//ceros.
SubProceso mostrarMatrix(matric, m,n)
	definir i, j Como entero
	
	para i= 0 hasta m-1 Hacer
		para j=0 hasta n-1 Hacer
			escribir matric(i,j) ' ' Sin Saltar
		FinPara
		escribir ''
	FinPara
FinSubProceso

subproceso completarMatric(matric, m, n)
	definir i, j Como Entero
	
	para i= 0 hasta m-1 Hacer
		para j=0 hasta n-1 Hacer
			si i=0 o i=m-1 o j=0 o j=n-1 Entonces
				matric(i,j) = 1
			SiNo
				matric(i,j)=0
			FinSi
		FinPara
	FinPara
FinSubProceso


Algoritmo guia4Extra11
	definir matric Como Entero
	
	dimension matric(5,15)
	
	completarMatric(matric, 5, 15)
	mostrarMatrix(matric, 5, 15)
	
FinAlgoritmo
