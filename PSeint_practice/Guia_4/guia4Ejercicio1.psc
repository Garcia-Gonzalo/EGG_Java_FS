//Realizar un programa que rellene un vector con 5 valores ingresados por el usuario y los
//muestre por pantalla

Algoritmo guia4Ejercicio1
	definir i, vector como entero
	Dimension  vector(5)
	
	Escribir "Ingrese sus 5 numeros"
	
	para i=0 Hasta 4 Hacer
		leer vector(i)
	FinPara
	
	para i=0 Hasta 4 Hacer
		Escribir  vector(i) ", " sin saltar
	FinPara
FinAlgoritmo
