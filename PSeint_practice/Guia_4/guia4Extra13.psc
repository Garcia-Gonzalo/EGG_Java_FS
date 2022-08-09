//Crear una matriz que contenga 3 columnas y la cantidad filas que decida el usuario. Las dos
//primeras columnas contendrán valores enteros ingresados por el usuario y en la 3 columna se
//deberá almacenar el resultado de sumar el número de la primera y segunda columna. Mostrar
//la matriz de la siguiente forma:


SubProceso cargarColumnas(matric, filas)
	definir i, j Como Entero
	escribir "Ingresar los valores"
	para i=0 hasta filas-1 Hacer
		
		para j=0 hasta 1 hacer
			leer matric(i,j)
		FinPara
		
	FinPara
	escribir "Valores ingresados"
FinSubProceso

subproceso sumarMatrix(matric, filas)
	definir i, j Como Entero
	
	para i=0 hasta filas -1 Hacer
		matric(i,2) = 0					// inicializa en 0
		para j=0  hasta 1 Hacer
			matric(i,2) = matric(i,2) + matric(i,j)
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

Algoritmo guia4Extra13
	
	definir matric, filas Como Entero
	
	escribir "Ingrese las filas"
	leer filas
	
	dimension matric(filas, 3)
	
	cargarColumnas(matric, filas)
	
	sumarMatrix(matric, filas)
	
	mostrarMatrix(matric, filas, 3)
	
FinAlgoritmo
