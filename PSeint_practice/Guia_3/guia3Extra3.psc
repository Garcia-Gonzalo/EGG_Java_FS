Funcion acceso <- login ( id, pass, intentos Por Referencia)
	definir acceso Como Logico
		
	si id = "gon" Y pass ="123" Y intentos < 4 Entonces
		acceso = Verdadero
	SiNo
		intentos = intentos +1
		acceso = falso
		
	FinSi
	
Fin Funcion



Algoritmo guia3Extra3
	definir id, pass Como Caracter
	definir  intentos Como Entero
	definir resultado Como Logico
	
	intentos = 1
	resultado = falso
	mientras intentos < 4  y resultado=falso Hacer
		escribir "Ingrese id y pass"
		leer id, pass 
		resultado = login(id, pass, intentos) 
	FinMientras
		
	si resultado entonces
		escribir "bienvenido"
	SiNo
		Escribir"id o pass incorrecta; se le acabaron los 3 intentos"
	FinSi
	
	
	
	
FinAlgoritmo
