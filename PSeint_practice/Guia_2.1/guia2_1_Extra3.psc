Algoritmo guia2_1_Extra3
	Definir  n1,n2, r1, r2 Como Real
	
	escribir " Ingrese el primer Nro "
	leer n1
	escribir " Ingrese el segundo Nro "
	leer n2
	
	r1 = n1 % 2
	r2 = n2 % 2
	
	si r1=0 Y r2=0 Entonces
		escribir " ambos nros son pares"
	SiNo
		escribir "Los números no son pares, o uno de ellos no es par"
		
	FinSi
	
	
FinAlgoritmo
