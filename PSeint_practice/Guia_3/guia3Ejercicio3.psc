Funcion r <- esMultiplo ( n1,n2 )
	definir r Como Logico
	
	r = (n1%n2) == 0
		
Fin Funcion



Algoritmo guia3Ejercicio3
	Definir  n1, n2 Como Entero
	
	escribir "Ingrese dos numeros"
	leer n1, n2
	
	si esMultiplo(n1,n2) Entonces
		escribir "Es multiplo"
	SiNo
		escribir "No Es multiplo"
	FinSi
	
	
FinAlgoritmo
