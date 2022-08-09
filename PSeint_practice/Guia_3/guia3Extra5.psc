Funcion suma <- sumarDigitos ( num )
	definir suma Como Entero
	
	suma = 0
	
	mientras num <> 0 Hacer
		suma = suma + num%10
		num = trunc(num/10)
	FinMientras
	
Fin Funcion




Algoritmo guia3Extra5
	definir nume Como Entero
	
	escribir "Ingrese el nro"
	leer nume
	
	nume = sumarDigitos(nume)
	
	escribir " = " nume
	
	
FinAlgoritmo
