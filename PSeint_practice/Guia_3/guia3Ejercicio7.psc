SubProceso calcularTa(diaNro)
	definir min, max Como Entero
	
	escribir "Ingrese ta min y max"
	leer min, max
	
	escribir "ta media del dia " diaNro " = " (min+max)/2
	
FinSubProceso

Algoritmo guia3Ejercicio7
	definir dias, i Como Entero
	
	escribir "Ingrese la cantidad de días que desea calcular"
	leer dias
	
	para i =1 hasta dias con paso 1 Hacer
		calcularTa(i)		
	FinPara
	
	
	
FinAlgoritmo
