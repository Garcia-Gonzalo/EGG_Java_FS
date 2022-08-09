SubProceso intercambiador(a Por Referencia,b Por Referencia)
	definir c Como Entero
	c = a
	a= b
	b = c	
FinSubProceso


Algoritmo guia3Ejercicio6
	definir a , b como entero
	
	escribir "Ingrese dos nros enteros"
	leer a, b
	
	escribir "a= " a
	Escribir  "b= " b
	
	intercambiador(a,b)
	escribir "Luego del intercambio"
	
	escribir "a= " a
	Escribir  "b= " b
	
	
FinAlgoritmo
