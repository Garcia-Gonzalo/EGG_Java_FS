Algoritmo extra2_2_10
	definir clave, num Como Entero
	
	clave = aleatorio(1,10)
	
	Hacer
		// validacion del usuario
		Hacer
			escribir "Ingrese un nro del 1 al 10"
			leer num
		Mientras Que no(num>=1 Y num<=10) 
		
		si num < clave Entonces
			escribir "te quedaste corto..."
		SiNo
			si num > clave Entonces
				escribir "te pasaste..."
			FinSi
		FinSi
		
	Mientras Que clave <> num
	
	escribir "Adivinaste!"
	
	
FinAlgoritmo
