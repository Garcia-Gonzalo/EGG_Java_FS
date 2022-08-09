Algoritmo extra2_2_8
	definir i, pares,sumaPares, impares, sumaImpares, num  Como Entero
	
	sumaPares = 0
	sumaImpares = 0
	pares = 0
	impares = 0
	
	para i =1 hasta 10 con paso 1 Hacer
		escribir "Ingrese un numero"
		leer num
		
		si num%2 =0 Entonces
			pares = pares + 1
			sumaPares = sumaPares+num
		SiNo
			impares = impares +1
			sumaImpares = sumaImpares+num
		FinSi
	FinPara
	
	si pares <> 0 Entonces
		escribir " El promedio de los pares es " sumaPares/pares
	SiNo
		escribir " No ha ingresado nros pares"
	FinSi
	
	si impares <> 0 Entonces
		escribir " El promedio de los impares es " sumaImpares/impares
	SiNo
		escribir " No ha ingresado nros impares"
	FinSi
	
FinAlgoritmo
