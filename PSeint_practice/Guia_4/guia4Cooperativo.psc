subproceso inicializarMatriz(matriz, filas, columnas)
	definir i, j como entero
	para i=0 hasta filas-1 Hacer
		para j=0 hasta columnas-1 Hacer
			matriz(i,j) = '*'
		FinPara
	FinPara	
FinSubProceso


SubProceso imprimirMatriz(matric, m,n)
	definir i, j Como entero
	
	para i= 0 hasta m-1 Hacer
		para j=0 hasta n-1 Hacer
			escribir matric(i,j) ' ' Sin Saltar
		FinPara
		escribir ''
	FinPara
FinSubProceso


subproceso agregarPalabra(matriz, palabra, fila)
	definir i, long Como Entero
	
	long = longitud(palabra)-1
	palabra = Mayusculas(palabra)
	
	para i=0 hasta long Hacer
		matriz(fila, i) = subcadena(palabra,i,i)
	FinPara
FinSubProceso


funcion posicion <-buscarR(matriz, fila)
	definir posicion, i Como Entero
	definir encontrado como logico
	
	posicion = -1
	encontrado = Falso
	i=0
	
	mientras no encontrado Hacer
		si matriz(fila,i) = 'R' Entonces
			posicion = i
			encontrado = Verdadero
		FinSi
		i=i+1
	FinMientras
FinFuncion


// ---------------
SubProceso  acomodarPalabra(matriz)
	definir fila, diferencia, ubicacionR Como Entero
	
	para fila =0 hasta 8 Hacer   // recorre cada fila
		
		ubicacionR = buscarR(matriz, fila)  // ubicamos la ubicacion de la 1a letra R en cada fila
		
		si ubicacionR <> -1 entonces         // Valida que exista una R en la fila
			
			diferencia = abs(5 - ubicacionR)   // Obtenemos la diferencia entre la posicion de la R y 5
			
			si diferencia <> 0 entonces   // Si es 0 la R está en la posicion 5 y no se debe desplazar
				
				desplazarDer(matriz, fila, diferencia)  // Si no se debe desplazar a la derecha la diferencia
				
			FinSi
		FinSi
			
	FinPara
FinSubProceso


subproceso desplazarDer(matriz, fila, desplazar)
	definir i, ultimaLetra Como Entero
	definir hallado como logico
	
	// capturar en que posicion termina la palabra
	hallado = Falso
	i=0
	mientras no hallado Hacer
		si matriz(fila,i) = '*' Entonces
			ultimaLetra = i -1 
			hallado = Verdadero
		FinSi
		i = i + 1
	FinMientras
	
	// Desplaza cada caracter a la derecha
	si hallado Entonces
		para i = ultimaLetra hasta 0 con paso -1 Hacer
			matriz(fila, i+desplazar) = matriz(fila,i)   // desplaza cada caracter
		FinPara
	FinSi
	
	// completa con * los caracteres de la izquierda
	para i=0 hasta desplazar-1 Hacer
		matriz(fila,i) = '*'
	FinPara	
FinSubProceso


//--------------------------------------------------------------------------

Algoritmo guia4Cooperativo
	definir tablero Como caracter
	
	
	dimension tablero(9,13)
	
	inicializarMatriz(tablero,9,13)
	
	agregarPalabra(tablero, "vector", 0)
	agregarPalabra(tablero, "matrix", 1)
	agregarPalabra(tablero, "programa", 2)
	agregarPalabra(tablero, "subprograma", 3)
	agregarPalabra(tablero, "subproceso", 4)
	agregarPalabra(tablero, "variable", 5)
	agregarPalabra(tablero, "entero", 6)
	agregarPalabra(tablero, "para", 7)
	agregarPalabra(tablero, "mientras", 8)
	
	imprimirMatriz(tablero, 9,13)
	
	acomodarPalabra(tablero)
	
	escribir ''
	escribir ''
	
	imprimirMatriz(tablero, 9,13)
	
FinAlgoritmo
