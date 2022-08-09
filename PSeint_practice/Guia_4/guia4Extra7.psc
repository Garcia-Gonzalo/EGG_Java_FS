
// Programe una función recursiva que calcule la suma de un arreglo de números enteros.

funcion suma <- sumaVector(vect, index,dim)
	definir suma como entero
	
	si index <= dim-1 Entonces	// mientras el indice sea menor a la dimension
		suma = vect(index)+ sumaVector(vect, index+1,dim)
	FinSi
FinFuncion

Algoritmo guia4Extra7
	definir vect, i como entero
	
	dimension vect(5)
	
	para i=0 hasta 4 Hacer
		vect(i) = aleatorio(0,9)
		si i <4 Entonces
			escribir vect(i) '+' sin saltar
		SiNo
			escribir vect(i) ' ' sin saltar
		FinSi
		
	FinPara
	
	escribir '=' sumaVector(vect, 0, 5)
	
FinAlgoritmo
