Funcion num <- sumaRecursiva ( n )
	definir num Como entero
	
	si n > 0 Entonces
		num = n + sumaRecursiva(n-1)	
	FinSi
	
Fin Funcion


Algoritmo guia3Ejercicio10
	
	definir nro Como Entero
	
	escribir " Ingrese el nro"
	leer nro
	escribir " La suma de los n nros naturares es " sumaRecursiva(nro)
	
FinAlgoritmo
