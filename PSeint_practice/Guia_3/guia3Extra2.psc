Funcion num <- convierteAnumero ( char )
	definir num Como Entero
		
	si Longitud(char) <4 Entonces
		num = ConvertirANumero(char)
		
	SiNo
		num = -1
	FinSi
	
Fin Funcion


Algoritmo guia3Extra2
	definir input Como Caracter
	definir resultado Como Entero
	
	Escribir  "Ingrese el nro de 3 digitos"
	leer input
	
	resultado = convierteAnumero(input)
	
	si resultado > 0 Entonces
		escribir resultado
	SiNo
		 Escribir  "ingreso mas de 3 digitos"
	FinSi
	
FinAlgoritmo
