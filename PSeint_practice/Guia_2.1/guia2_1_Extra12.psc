Algoritmo guia2_1_Extra12
	definir option, ventas, horasTrabajadas, horasExtra como entero
	Definir  bruto, valorHora como real
	
	escribir " Elija la modalidad de sueldo:"
	Escribir  "1. A comisión"
	Escribir  "2. Salario + comisión"
	Escribir  "3. Salario"
	leer option
	
	segun option hacer
		1:
			escribir " Ingrese el monto de las ventas de la semana en pesos: "
			leer ventas
			bruto = ventas*0.4
		2:
			Escribir "Ingrese el valor por hora en pesos:"
			leer valorHora
			escribir "Ingrese la cantidad de hs trabajadas"
			leer horasTrabajadas
			escribir  " Ingrese el monto de las ventas de la semana en pesos: "
			leer ventas
			
			si horasTrabajadas>40 Entonces
				horasTrabajadas = 40
			FinSi
			
			bruto = (valorHora*horasTrabajadas) + (ventas*0.25)
						
		3:
			Escribir "Ingrese el valor por hora en pesos:"
			leer valorHora
			escribir "Ingrese la cantidad de hs trabajadas"
			leer horasTrabajadas
			
			si horasTrabajadas>40 Entonces
				horasExtra = horasTrabajadas-40
				horasTrabajadas = 40
			SiNo
				horasExtra=0
			FinSi
			
			bruto = (valorHora*horasTrabajadas) + ((valorHora*0.5)*horasExtra)
		De Otro Modo:
			escribir " No ha ingresado una opcíon válida"
	FinSegun
	
	escribir " El sueldo a percibir es de " bruto " $"
FinAlgoritmo
