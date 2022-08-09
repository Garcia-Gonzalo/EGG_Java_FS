SubProceso codificacion (frase)
	definir i Como Entero
	definir char, fraseNueva Como Caracter
	
	fraseNueva = ""
	
	para i=0 hasta Longitud(frase)
		Segun SubCadena(frase,i,i)
			"a": char = "@"
			"e": char = "#"
			"i": char = "$"
			"o": char = "%"
			"u" : char = "*"
			De Otro Modo:
				char = Subcadena(frase,i,i)
		FinSegun
		fraseNueva = concatenar(fraseNueva,char)
	finPara
	
	escribir frase
	Escribir  fraseNueva
	
FinSubProceso


Algoritmo guia3Ejercicio9
	
	definir letras, frase Como Caracter
	
	frase = ""
	
	escribir "Ingrese los caracteres, finzaliza con un punto"
	
	Hacer
		leer letras
		frase = Concatenar(frase,letras)
	Mientras Que no (letras = ".")
	
	codificacion(frase)
	
FinAlgoritmo
