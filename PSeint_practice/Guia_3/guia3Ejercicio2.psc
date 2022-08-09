Funcion r <- paridad (n)
	definir r Como Logico
	r = (n%2) == 0	
Fin Funcion


Algoritmo guia3Ejercicio2
	definir resultado Como Logico
	definir num como numero
	
	escribir "Ingrese un nro"
	leer num
	
	si paridad(num) Entonces
		escribir "Es par"
	SiNo
		escribir "Es impar"
	FinSi
	
FinAlgoritmo
