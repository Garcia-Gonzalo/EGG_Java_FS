//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
//usuario y muestre por pantalla el promedio de la suma de todos los valores ingresados.

funcion value <- promedio(vect, n)
	definir value Como Real
	definir i, suma Como Entero
	
	suma = 0
	
	para i = 0 hasta n-1 Hacer
		suma = suma + vect(i)
	FinPara
	
	value = suma / n
	
FinFuncion

SubProceso completarVector(vect, n)
	definir i Como Entero
	
	Escribir "Ingrese " n " numeros"
	
	para i=0 hasta n-1 Hacer
		leer vect(i)
	FinPara
FinSubProceso

Algoritmo guia4Extra2
	definir vect, n Como Entero
	
	escribir "Ingrese el tamaño del vector"
	leer n
	
	dimension vect(n)
	
	completarVector(vect, n)
	
	escribir "El promedio es " promedio(vect, n)
	
FinAlgoritmo
