Algoritmo extra2_2_5
	definir digitos Como Entero
	definir num como real
	
	digitos = 0
	
	escribir "Ingrese el numero"
	leer num
	
	mientras trunc(num) <> 0 Hacer
		num = num / 10
		digitos = digitos + 1
	FinMientras
	
	escribir "El numero tiene " digitos " digitos"
	
	
FinAlgoritmo
