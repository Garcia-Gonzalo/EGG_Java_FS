

Funcion resultado <- esPar ( n )
	definir resultado Como caracter
	
	si n%2 == 0 entonces
		resultado = "par"
	SiNo
		resultado = "impar"
	FinSi
Fin Funcion

Funcion similarParidad <- digitExtract ( n )
	definir similarParidad, primeraPasada Como Logico
	definir digit como entero
	definir paridad Como Caracter
	
	primeraPasada=Verdadero
	similarParidad=Verdadero
	
	mientras trunc(n/10) <> 0 Hacer
		
		digit = n % 10
		
		si primeraPasada entonces  //la pra vez define la paridad del primer digito
			paridad = esPar(digit)
			n = trunc(n/10)
			primeraPasada=Falso
		SiNo
			si paridad = esPar(digit) Entonces  //Luego compara la paridad con la de los demas digitos
				n = trunc(n/10)
			SiNo
				n=1
				similarParidad=Falso
			FinSi
		FinSi
		
		
		
	FinMientras
	
Fin Funcion


Algoritmo guia3Extra6
	definir num Como Entero
	
	escribir "Ingrese el numero"
	leer num
	
	escribir "Los digitos tienen similar paridad ? " digitExtract(num)
FinAlgoritmo
