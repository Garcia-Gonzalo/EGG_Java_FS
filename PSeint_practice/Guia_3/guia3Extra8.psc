Funcion capicua <- esCapicua ( numOriginal )
	definir capicua Como Logico
	definir nuevoNum, num Como Entero
	
	num = numOriginal
	nuevoNum=0
	
	mientras num <> 0 Hacer
		
		nuevoNum = nuevoNum*10 + (num%10)  //va acumulando la ultima cifra
		                                   //y aumentando su valor posicional
		num = trunc(num/10) // va reduciendo el numero
				
	FinMientras
	
	si nuevoNum=numOriginal Entonces
		capicua = Verdadero
	SiNo
		capicua=Falso
	FinSi
	
Fin Funcion



Algoritmo guia3Extra8
	definir n Como Entero
	
	Escribir "Ingrese el nro"
	leer n
	
	escribir n " es capicua? " esCapicua(n)
	
	
FinAlgoritmo
