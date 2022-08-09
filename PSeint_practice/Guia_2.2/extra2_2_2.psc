Algoritmo extra2_2_2
	definir min, max,num, contador como entero
	
	contador = 0
	
	escribir "defina el minimo y maximo"
	leer min, max
	
	//comprobacion de que min sea menor que maximo
	Si min < max entonces
		Hacer
			escribir "Ingrese un nro"
			leer num
			contador = contador +1
		Mientras Que num >= min Y num <= max
		
		escribir " Se ingresaron " contador-1 " numeros dentro del intervalo"
		
	SiNo
		escribir "No ha ingresado un intervalo válido"
	FinSi
	
FinAlgoritmo
