//Una matriz m�gica es una matriz cuadrada (tiene igual n�mero de filas que de columnas) que
//tiene como propiedad especial que la suma de las filas, las columnas y las diagonales es igual.
//Considere el problema de construir un
//algoritmo que compruebe si una matriz de datos enteros es m�gica o no, y en caso de que
//		sea m�gica escribir la suma. Adem�s, el programa deber� comprobar que los n�meros
//		introducidos son correctos, es decir, est�n entre el 1 y el 9. El usuario ingresa el tama�o de la
//		matriz que no debe superar orden igual a 10


funcion resultado<- esMagica(matric)
	definir resultado Como Logico
	definir i,j, indexSuma,sumas, temporal Como Entero
	
	dimension sumas(8)
	
	indexSuma=0
	
	para i=0 hasta 2  hacer // suma cada fila
		temporal = 0
		para j=0 hasta 2 Hacer
			temporal = temporal + matric(i,j)
		FinPara
		sumas(indexSUma) = temporal
		indexSuma = indexSUma + 1
	FinPara
	
	para i=0 hasta 2  hacer // suma cada columns
		temporal = 0
		para j=0 hasta 2 Hacer
			temporal = temporal + matric(j, i)
		FinPara
		sumas(indexSUma) = temporal
		indexSuma = indexSUma + 1
	FinPara
	
	temporal = 0
	para i=0 hasta 2  hacer // suma 1diagonal
		para j=0 hasta 2 Hacer
			si i =j Entonces
				temporal = temporal + matric(i,j)

			FinSi
		FinPara
		
	FinPara
	sumas(indexSUma) = temporal
	indexSuma = indexSUma + 1
	
	temporal = 0
	para i=0 hasta 2  hacer // suma 1diagonal
		para j=0 hasta 2 Hacer
			si 2-i =2-j Entonces
				temporal = temporal + matric(i,j)
				
			FinSi
		FinPara
		
	FinPara
	sumas(indexSUma) = temporal
	
	//muestro la sumas
	para i=0 hasta 7 Hacer
		escribir sumas(i) ' ' Sin Saltar
	FinPara
	
	resultado=Verdadero
	para i=1 hasta 7 Hacer
		si sumas(i-1) <> sumas(i)
			resultado = falso
		FinSi
		
	FinPara
		
FinFuncion

funcion nro <- validarNumero()
	definir nro Como Entero
	Hacer
		escribir "Ingrese un numero entre 1 y 9"
		leer nro		
	Mientras Que  no(nro>=1 y nro <=9)
	
FinFuncion


Algoritmo guia4Ej13
	definir matric, i, j Como Entero
	
	Dimension  matric(3,3)
	
	para i=0 hasta 2 Hacer
		para j=0 hasta 2 Hacer
			matric(i,j)= validarNumero
		FinPara
	FinPara
	
	escribir esMagica(matric)
	
	
FinAlgoritmo
