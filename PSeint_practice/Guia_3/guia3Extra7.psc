Funcion resultado <- fibonacci ( posicion )
	definir resultado Como Entero
	definir aux, n1, n2, i Como Entero
	
	segun posicion
		1:
			resultado = 0
		2:
			resultado = 1
		De Otro Modo:
			n1=0
			n2=1
			para i = 2 hasta posicion-1 Hacer
				aux = n2
				n2= n1 +n2
				n1 = aux
				resultado = n2	
			FinPara
	FinSegun
	
	
	
Fin Funcion




Algoritmo guia3Extra7
	definir pos Como Entero
	
	Escribir "Ingrese la posicion de fibonacci que quiere"
	leer pos
	
	escribir "El nro de fibo es: " fibonacci(pos)
	
FinAlgoritmo
