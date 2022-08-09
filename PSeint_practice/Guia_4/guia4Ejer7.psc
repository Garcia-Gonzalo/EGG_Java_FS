//Crear un subproceso que rellene dos arreglos de tama�o n, con n�meros aleatorios. Despu�s,
//	hacer una funci�n que reciba los dos arreglos y diga si todos sus valores son iguales o no. La
//			funci�n debe devolver el resultado de est� validaci�n, para mostrar el mensaje en el algoritmo.
//				Nota: recordar el uso de las variables de tipo l�gico.


subproceso  completaArray(vector, dim, min, max)
	definir i como entero
	para i=0 hasta dim-1 Hacer
		vector(i) = Aleatorio(min,max)
	FinPara
FinSubProceso

funcion iguales <- comparaArrays(vector1, vector2, dim)
	definir iguales Como Logico
	definir i , j, comparaciones, total Como Entero
	
	dimension comparaciones(dim)
	
	para i=0 hasta dim-1 Hacer  // recorro cada elemento del vector1
		comparaciones(i) = 0
		para j=0 hasta dim-1 Hacer  // recorro cada elemento del vector2
			si vector1(i) = vector2(j) Entonces  // si el elemento en vector1 est� en el vector2 modifica comparaciones con un 1
				comparaciones(i) = 1
			FinSi
		FinPara
	FinPara
	
	total=0
	
	para i=0 hasta dim-1 Hacer
		total = total + comparaciones(i)
	FinPara
	
	si total = dim entonces 
		iguales=Verdadero
	SiNo
		iguales = falso
	FinSi
	
FinFuncion


Algoritmo guia4Ejer7
	definir dim, vector1, vector2, inf, sup Como Entero
	
	Escribir  "Ingrese la dimension"
	leer dim
	escribir "Ingrese el valor minimo y m�ximo para completarlo"
	leer inf, sup
	
	dimension vector1(dim), vector2(dim)
	
	completaArray(vector1,dim, inf, sup)
	completaArray(vector2,dim, inf, sup)
	
	escribir "Son iguales? ", comparaArrays(vector1,vector2,dim)
	
FinAlgoritmo
