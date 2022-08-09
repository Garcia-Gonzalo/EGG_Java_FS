Algoritmo extra2_2_7
	definir num, total Como Entero
	definir final Como Caracter
	
	total = 0
	
	Hacer
		
		escribir "Ingrese un entero positivo"
		leer num
		total = total + num
				
		
		Hacer
			escribir "Desea ingresar otro nro? s/n"
			leer final
			final = Minusculas(final)
		Mientras Que NO (final = "n" O final = "s")
		
	Mientras Que final <> "n"
	
	escribir "Total " total
	
FinAlgoritmo
