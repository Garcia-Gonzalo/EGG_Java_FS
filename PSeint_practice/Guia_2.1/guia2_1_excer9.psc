Algoritmo guia2_1_excer9
	definir operacion Como Caracter
	definir n1, n2, resultado Como Real
	
	escribir " Ingrese la opracion:"
	escribir "S para suma, R para resta, M para multiplicacion y D para división"
	leer operacion
	escribir " Ingrese el primer numero"
	leer n1
	escribir " Ingrese el segundo numero"
	leer n2
	
	segun operacion hacer
		"S","s":
			resultado = n1+n2
		"R","r":
			resultado = n1-n2
		"M","m":
			resultado =n1*n2
		"D","d":
			resultado = n1 /n2
	FinSegun
	
	escribir " El resultado es = ", resultado
FinAlgoritmo
