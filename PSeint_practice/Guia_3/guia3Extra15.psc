Funcion resultado <- sumaPares ( n )
	definir resultado Como Entero
	
	si n >= 2 Entonces
		resultado = n + sumaPares(n-2)
	FinSi
	
Fin Funcion



Algoritmo guia3Extra15
	definir n Como Entero
	
	Escribir "Ingrese el nro"
	leer n
	
	si n%2 = 0 Entonces
		escribir sumaPares(n)
	SiNo
		Escribir "Error, debe ingresar un nro par"
	FinSi
	
	
	
FinAlgoritmo
