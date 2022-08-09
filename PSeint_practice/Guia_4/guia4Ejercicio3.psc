
//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
//usuario. A continuación, se debe buscar un elemento dentro del arreglo (el número a buscar
//también debe ser ingresado por el usuario). El programa debe indicar la posición donde se
//encuentra el valor. En caso que el número se encuentre repetido dentro del arreglo se deben
//imprimir todas las posiciones donde se encuentra ese valor.
//Finalmente, en caso que el número a buscar no está adentro del arreglo se debe mostrar un
//mensaje.

Algoritmo guia4Ejercicio3
	definir n, i, x como entero
	definir busqueda Como Logico
	
	escribir "Ingrese el tamaño del vector: " Sin Saltar
	leer n
	
	Dimension vector(n)
	definir vector Como Entero
	
	Escribir  "Ingrese los valores al vector"
	para i=0 hasta n-1 Hacer
		leer vector(i)
	FinPara
	
	Escribir  "Ingrese el valor que desea buscar"
	leer x
	
	busqueda = Falso
	para i = 0 hasta n-1 Hacer
		si vector(i) = x entonces
			escribir "Posicion " i
			busqueda=Verdadero
		FinSi
	FinPara
	
	si no(busqueda) Entonces
		escribir "El valor no se encuentra en el vector"
	FinSi
	
FinAlgoritmo
