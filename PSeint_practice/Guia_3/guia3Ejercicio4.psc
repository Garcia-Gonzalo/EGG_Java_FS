Funcion cant <- cuentaLetras ( letra, frase)
	definir cant , i  Como Entero
	cant = 0
	
	para i=0 hasta Longitud(frase)-1 con paso 1 Hacer
		si Subcadena(frase,i,i) == letra Entonces
			cant = cant + 1
		FinSi
	FinPara
	
Fin Funcion



Algoritmo guia3Ejercicio4
	definir letra, frase Como Caracter
	
	escribir "Ingrese la frase"
	leer frase
	Escribir  "Ingrese la letra" 
	leer letra
	
	
	escribir frase
	Escribir  "La letra " letra " aparece " cuentaLetras(letra,frase) " veces"
	
	
FinAlgoritmo
