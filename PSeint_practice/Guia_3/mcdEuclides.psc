Funcion resultado <- mcd ( a, b )
	definir resultado, r Como Entero
	
	si a > b Entonces
		resultado = a
		
		mientras b <> 0 Hacer
			r = a % b
			a = b
			b = r
			
		FinMientras
		resultado = a
	SiNo
		resultado = -1
	FinSi
	
	
	
Fin Funcion



Algoritmo mcdEuclides
	definir n1,n2, mcdRes Como Entero
	
	escribir "Ingrese a y b"
	leer n1, n2
	
	mcdRes = mcd (n1, n2)
	
	si mcdRes > 0 Entonces
		Escribir  "mcd = " mcdRes
	SiNo
		escribir "a no es mayor a 0"
	FinSi
FinAlgoritmo
