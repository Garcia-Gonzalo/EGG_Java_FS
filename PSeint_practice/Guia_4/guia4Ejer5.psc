//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
//usuario. A continuación, se deberá crear una función que reciba el vector y devuelva el valor
//más grande del vector.


Funcion elementoMayor <- buscaMayor ( vectorOriginal por referencia, n )
	definir elementoMayor, i Como entero
	
	elementoMayor = vectorOriginal(0)
	
	para i=1 hasta n-1 Hacer
		si vectorOriginal(i) > elementoMayor Entonces
			elementoMayor = vectorOriginal(i)
		FinSi
		
	FinPara
Fin Funcion




Algoritmo guia4Ejer5
	definir dim, vector, i Como Entero
	
	escribir "Ingrese cuantos numeros desea comparar"
	leer dim
	dimension vector(dim)
	
	Escribir "Ingrese los " dim " números:"
	para i=0 hasta dim-1 Hacer
		leer vector(i)
	FinPara
	para i=0 hasta dim-1 Hacer
		escribir vector(i) ", " sin saltar
	FinPara
	escribir ""
	
	escribir "El elemento mayor es: " buscaMayor(vector, dim)
	
FinAlgoritmo
