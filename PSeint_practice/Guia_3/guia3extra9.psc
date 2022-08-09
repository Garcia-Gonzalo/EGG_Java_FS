Funcion resultado <- factorial ( n )
	definir i, resultado Como Entero
	
	resultado = 1
	
	para i=2 hasta n Hacer
		resultado= resultado * i
	FinPara
	
Fin Funcion



Algoritmo guia3extra9
	definir n, m Como Entero
	
	escribir "Ingrese m: cantidad de m elementos"
	leer m
	
	escribir "Ingrese n: tomados de a n"
	leer n
	
	si n > 0 y n  < m Entonces
		escribir factorial(m)/(factorial(n) * factorial(m-n))
		
	SiNo
		escribir " los nros n y m no se pueden procesar"
	FinSi
	
FinAlgoritmo
