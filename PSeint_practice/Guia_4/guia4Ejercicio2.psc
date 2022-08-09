//Realizar un programa que lea 10 números reales por teclado, los almacene en un arreglo y
//muestre por pantalla la suma, resta y multiplicación de todos los números ingresados al
//arreglo.

Algoritmo guia4Ejercicio2
	definir i como entero
	definir aux, vector Como Real
	Dimension vector(10)
	
	escribir "Ingrese los 10 numeros"
	para i=0 hasta 9 Hacer
		leer vector(i)
	FinPara
	
	
	aux=0
	para i=0 hasta 9 Hacer
		aux= aux + vector(i)
	FinPara
	escribir "La suma es: " aux
	
	aux=0
	para i=0 hasta 9 Hacer
		aux= aux - vector(i)
	FinPara
	escribir "La resta es: " aux
		
	aux=1
	para i=0 hasta 9 Hacer
		aux= aux * vector(i)
	FinPara
	escribir "La multiplicacion es: " aux
	
FinAlgoritmo
