//Realizar un programa que rellene una matriz de 3x3 con 9 valores ingresados por el usuario y
//los muestre por pantalla.


Algoritmo guia4Ejer8
	definir matri, i, j Como Entero
	
	dimension matri(3,3)
	
	Escribir "ingrese los valores de la matriz"
	
	para i=0 hasta 2 Hacer
		para j=0 hasta 2 Hacer
			leer matri(i,j)
		FinPara
	FinPara
	
	para i=0 hasta 2 Hacer
		para j=0 hasta 2 Hacer
			escribir matri(i,j) Sin Saltar
		FinPara
		Escribir ''
	FinPara
	
FinAlgoritmo
