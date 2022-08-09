Funcion res <- esPrimo ( n )
	definir res Como Logico
	definir j Como Entero
		
	res = Verdadero
	
	si n <= 1 Entonces
		res = Falso
	sino				
		j = n - 1
		mientras res y j > 1  Hacer
			si n % j == 0 Entonces
				res = Falso
			FinSi
			j = j - 1
		FinMientras
	FinSi
			
Fin Funcion



Algoritmo guia3Ejercicio5
	definir num Como Entero
	
	escribir "Ingrese el numero"
	leer num
	
	si esPrimo(num) Entonces
		escribir "Es primo"
	SiNo
		Escribir  "No es primo"
	FinSi
	
FinAlgoritmo
