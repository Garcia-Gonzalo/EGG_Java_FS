Algoritmo ejercicio2_2_3
	definir num,suma, cont como entero
	
	num=0
	suma =0
	cont = 0
	
	mientras num <> -1 Hacer
		Escribir "Ingrese el numero"
		leer num
		si num <> -1 Entonces
			cont = cont +1
			suma = suma + num
		FinSi
	FinMientras
	
	si cont > 0 Entonces
		escribir "El promedio es " suma/cont
	SiNo
		escribir "No ha ingresadoun numero"
	FinSi
FinAlgoritmo
