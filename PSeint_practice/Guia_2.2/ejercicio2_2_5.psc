Algoritmo ejercicio2_2_5
	definir min, max, suma, cont, num Como Entero
	definir promedio como real
	definir primeraVez Como Logico
	suma=0
	cont=0
	primeraVez = Verdadero
	
	Hacer
		escribir "Ingrese un nro"
		leer num
		si num <> 0 Entonces
			suma = suma+num
			cont = cont+1
			
			si primeraVez=Verdadero Entonces
				primeraVez=Falso
				min=num
				max=num
			SiNo
				si num < min Entonces
					min = num
				FinSi
				
				si num > max Entonces
					max = num
				FinSi
			FinSi
						
		FinSi
		
	Mientras Que num<>0
	
	si cont <> 0 entonces
		escribir "El promedio es " suma/cont
		escribir " El maximo es " max
		escribir "El mininmo es " min
	sino
		escribir "No ha ingresado un nro"
	FinSi
	
FinAlgoritmo
