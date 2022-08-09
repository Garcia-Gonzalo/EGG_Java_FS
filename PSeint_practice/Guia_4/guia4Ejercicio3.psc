
//Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el
//usuario. A continuaci�n, se debe buscar un elemento dentro del arreglo (el n�mero a buscar
//tambi�n debe ser ingresado por el usuario). El programa debe indicar la posici�n donde se
//encuentra el valor. En caso que el n�mero se encuentre repetido dentro del arreglo se deben
//imprimir todas las posiciones donde se encuentra ese valor.
//Finalmente, en caso que el n�mero a buscar no est� adentro del arreglo se debe mostrar un
//mensaje.

Algoritmo guia4Ejercicio3
	definir n, i, x como entero
	definir busqueda Como Logico
	
	escribir "Ingrese el tama�o del vector: " Sin Saltar
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
