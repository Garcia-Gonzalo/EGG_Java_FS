Algoritmo extra2_2_9
	definir cantNros, i, suma , contador, nroActual Como Entero
	
	suma = 0
	contador = 1
	nroActual = 0
	
	escribir "Ingrese el limite"
	leer cantNros
	
	Hacer
		nroActual = nroActual + 2		
		suma = suma + nroActual
		contador = contador +1
	Mientras Que cantNros>=contador
	
	escribir "La suma total es " suma
	
	
	
FinAlgoritmo
