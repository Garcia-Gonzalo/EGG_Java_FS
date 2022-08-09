//Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario,
//encontrando la manera de que la frase se muestre de manera continua en la matriz.

subproceso completarMatrix(matric, frase)
	definir i, j, indexWord Como Entero
	indexWord =0
	para i = 0 hasta 2 Hacer
		para j=0 hasta 2 Hacer
			
				matric(i,j) = Subcadena(frase, indexWord, indexWord)
				indexWord = indexWord + 1
		FinPara
	FinPara
FinSubProceso

	
	
subproceso mostrarMatrix(matric)
	definir i, j Como Entero
		
	para i=0 hasta 2 Hacer
		para j=0 hasta 2 Hacer
			escribir matric(i,j) ' ' Sin Saltar
		FinPara
		escribir ''
	FinPara
FinSubProceso


funcion fraseValidada <- validacion(frase)
	definir fraseValidada Como Caracter
	definir longFrase, i Como Entero
	
	longFrase =  longitud(frase)
	
	si  longFrase >=9 Entonces
		fraseValidada = subcadena(frase,0,8)
	SiNo
		// completa con espacios en blanco
		fraseValidada = frase
		para i=longFrase hasta 8 Hacer
			fraseValidada = fraseValidada + '-'
		FinPara
		
	FinSi
	
FinFuncion

	


Algoritmo guia4Ejer12
	definir matric, frase Como Caracter
	
	dimension matric(3,3)
	
	escribir "Ingrese la frase(no debe tener mas de 9 caracteres"
	leer frase
	
	frase = validacion(frase)
	
	completarMatrix(matric, frase)
	
	mostrarMatrix(matric)
FinAlgoritmo
	