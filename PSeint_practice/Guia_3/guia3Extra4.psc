Funcion jornal <- calculoJornal ( hs, turno, feriado )
	definir jornal, tarifa Como Real
	
	si turno ="d" Entonces
		si feriado = Verdadero Entonces
			tarifa = 90 * 1.10
		sino 
			tarifa = 90
		FinSi
		
	SiNo
		si turno = "n" entonces
			si feriado = Verdadero Entonces
				tarifa = 125 * 1.15
			SiNo
				tarifa = 125
			FinSi
		sino 
			tarifa = 0
		FinSi
	FinSi
	
	
	jornal = hs * tarifa
	
Fin Funcion


Algoritmo guia3Extra4
	definir hs Como Entero
	definir feriado Como Logico
	definir nombre, diaSemana, turno, askHoliday Como Caracter
	
	escribir "Ingrese el nombre del empleado"
	leer nombre
	Escribir "Ingrese el dia de la semana"
	leer diaSemana
	escribir "Fue feriado? s/n"
	leer askHoliday
	si askHoliday="s" Entonces
		feriado = Verdadero
	SiNo
		feriado = falso
	FinSi
	escribir "Ingrese turno (n=noche, d=dia)"
	leer turno
	escribir "Ingrese las hs trabajadas"
	leer hs
	
	Escribir  nombre " | ", diaSemana " | feriado: " askHoliday 
	escribir  "Turno: " turno " | hs trabajadas " hs
	Escribir "Jornal= " calculoJornal(hs,turno,feriado)
	
	
	
	
FinAlgoritmo
