SubProceso divResta(dividendo, divisor)
	definir contador Como Entero
	
	escribir "La division de " dividendo " / " divisor Sin Saltar
	
	si dividendo >= divisor Entonces
		contador=0
		Mientras dividendo >= divisor Hacer
			dividendo = dividendo - divisor
			contador = contador + 1
		FinMientras
		escribir " da " contador " con resto " dividendo
		
	SiNo
		Escribir " No se puede realizar"
		
	FinSi
	
FinSubProceso

Algoritmo guia3Ejercicio8
	definir n1, n2 Como Entero
	
	escribir " Ingrese dividendo y divisor"
	leer n1, n2
	
	divResta(n1,n2)
	
	
FinAlgoritmo
