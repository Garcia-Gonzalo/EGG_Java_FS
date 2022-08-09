Algoritmo guia2_1_Extra7
	definir num Como Entero
	definir num_txt Como Caracter
	escribir " Ingrese el numero"
	leer num
	
	num_txt = ConvertirATexto(num)
	si Longitud(ConvertirATexto(num)) = 3 Entonces
		escribir "tiene 3 cifras"
	SiNo
		escribir "No tiene 3 cifras"
	FinSi
	
	
	
FinAlgoritmo
