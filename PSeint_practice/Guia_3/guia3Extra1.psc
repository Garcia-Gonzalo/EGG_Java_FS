Funcion suma <- sumaDivisores ( n )
	definir suma como entero
	definir i Como Entero
	
	suma = 0
	
	para i=1 hasta n con paso 1  Hacer
		si n%i == 0 Entonces
			suma = suma + i
			escribir i " ," sin saltar
		FinSi
	FinPara

Fin Funcion


Algoritmo guia3Extra1
	definir nro como entero
	
	Escribir "Ingrese el nro"
	leer nro
	
	escribir "la suma de los divisores es " sumaDivisores(nro)
	
FinAlgoritmo
