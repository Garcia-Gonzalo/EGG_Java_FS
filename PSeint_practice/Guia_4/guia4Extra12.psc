//Realizar un programa que calcule la multiplicación de dos matrices de enteros de 3x3.
//Inicialice las matrices para evitar el ingreso de datos por teclado.


subproceso multiplicaMatric(A, B, C)
	definir i, j, r como entero
	
	para i=0 hasta 2 Hacer							//recorre las filas de la matriz A
		
		para j=0 hasta 2 Hacer						// recorre las filas de la matriz C elemento a elemento
			C(i,j) = 0
			
			para r=0 hasta 2 Hacer					//recorre las columnas de la matriz B
				C(i,j) = C(i,j)	+ A(i,r) * B(r,j)	//va sumando el producto en la posicion
			FinPara
			
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


Subproceso completarMatrix(matric, m, n)
	definir i, j Como entero
	
	para i= 0 hasta m-1 Hacer
		para j=0 hasta n-1 Hacer
			matric(i,j) = aleatorio(1,9)
		FinPara
	FinPara
	
FinSubProceso


Algoritmo guia4Extra12
	definir A, B, C Como Entero
	
	dimension A(3,3), B(3,3), C(3,3)
	
	completarMatrix(A, 3, 3)
	mostrarMatrix(A, 3, 3)
	escribir ''
	completarMatrix(B, 3, 3)
	mostrarMatrix(B, 3, 3)
	escribir ''
	
	multiplicaMatric(A, B, C)
	mostrarMatrix(C,3,3)
	
FinAlgoritmo
