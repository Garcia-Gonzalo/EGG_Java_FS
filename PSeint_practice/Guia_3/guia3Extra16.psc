Funcion fraseNueva <- invierteCadena ( frase, index, max )
	definir fraseNueva, letra Como Caracter
	
	si index <= max Entonces
		letra = subcadena(frase,index,index)
		fraseNueva = invierteCadena(frase,index+1,max) + letra
	FinSi
	
Fin Funcion



Algoritmo guia3Extra16
	definir frase Como Caracter
	
	escribir "Ingrese su frase"
	leer frase
	
	escribir invierteCadena(frase,0,Longitud(frase)-1)
	
	
FinAlgoritmo
