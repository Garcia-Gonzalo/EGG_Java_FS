Algoritmo ejercicio2_2_4
	definir pass Como Caracter
	definir cont Como Entero
	cont = 0
	Hacer
		escribir "Escriba su password:"
		leer pass
		cont = cont +1
	Mientras Que pass <> "eureka" Y cont <=3
	
	si pass = "eureka" Entonces
		escribir "Clave correcta"
	SiNo
		escribir "clave incorrecta. Ha agotado sus intentos"
	FinSi
	
FinAlgoritmo
