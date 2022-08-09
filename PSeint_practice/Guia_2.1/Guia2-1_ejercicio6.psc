Algoritmo ejercicio6
	definir n1,n2,n3 Como Real
	definir resultado Como Logico
	
	escribir " Ingrese la nota 1:"
	leer n1
	escribir " Ingrese la nota 2:"
	leer n2
	escribir " Ingrese la nota 3:"
	leer n3
	
	
	si ((n1>=1) Y (n1<=10)) Y ((n2>=1) Y (n2<=10)) Y ((n3>=1) Y (n3<=10)) Entonces
		resultado = Verdadero
	SiNo
		resultado = Falso
	FinSi
	
	escribir " las notas son", resultado
	
FinAlgoritmo
