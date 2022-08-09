// Crear una función que devuelva la diferencia que hay entre el valor más chico de un arreglo y
// su valor más grande.

funcion value <- buscarValor(vector, dim, modalidad)
	definir value, i Como Entero
	value = vector(0)
	para i=1 hasta dim-1 hacer
		si modalidad='min' entonces			// SELECCIONA EL MAYOR
			si vector(i) < value Entonces
				value = vector(i)
			FinSi
		sino
			si vector(i) > value Entonces		// SELECCIONA EL MENOR
				value = vector(i)
			FinSi
		FinSi
		
	FinPara
FinFuncion


Algoritmo guia4Extra6
	definir vect, i Como Entero
	
	dimension vect(10)
	
	para i=0 hasta 9 Hacer
		vect(i) = Aleatorio(0,9)
		escribir vect(i) ', ' Sin Saltar
	FinPara
	escribir ''
	
	escribir 'La diferencia entre el mayor y el menor es: "  buscarValor(vect, 10, 'max') -  buscarValor(vect, 10, 'min')
FinAlgoritmo
