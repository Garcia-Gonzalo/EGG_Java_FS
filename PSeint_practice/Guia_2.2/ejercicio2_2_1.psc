// Escriba un programa que valide si una nota est� entre 0 y 10, sino est� 
// entre 0 y 10 la nota se pedir� de nuevo hasta que la nota sea correcta.

Algoritmo ejercicio2_2_1
	definir nota Como Entero
	nota = -1
	
	mientras (nota<0) O (nota>10 ) hacer
		
		escribir "Ingrese la nota"
		leer nota
		
	FinMientras
	
	
	escribir "Ingreso de nota v�lido"
	
FinAlgoritmo
