Algoritmo ejercicio2_2_8
	definir alumnos,i, cantReprobados,cantTPalta, cantParcial Como Entero
	definir notaFinal,notasReprobados,notaTP,notaExposicion,notaParcial, maxExposicion Como Real
	
	cantReprobados =0
	notasReprobados =0
	cantTPalta=0
	maxExposicion = 0
	cantParcial = 0
	
	escribir "Ingrese la cantidad de alumnos"
	leer alumnos
	
	para i=1 hasta alumnos con paso 1 hacer
		escribir " Ingrese nota TP para el alumno" i
		leer notaTP
		escribir " Ingrese nota de Exposicion para el alumno" i
		leer notaExposicion
		escribir " Ingrese nota del Parcial para el alumno" i
		leer notaParcial
		
		notaFinal = (notaTP*0.35)+(notaExposicion*0.25)+(notaParcial*0.4)
		
		si  notaFinal<6.5 Entonces
			cantReprobados=cantReprobados+1
			notasReprobados = notasReprobados + notaFinal
		FinSi
		
		si notaTP >=7.5 Entonces
			cantTPalta = cantTPalta+1
		FinSi
		
		si notaExposicion>maxExposicion Entonces
			maxExposicion=notaExposicion
		FinSi
		
		si (notaParcial >=4) Y (notaParcial<=7.5) Entonces
			cantParcial = cantParcial +1
		FinSi
		
	FinPara
	
	si cantReprobados<>0 Entonces
		escribir "El promedio de reprobados " notasReprobados/cantReprobados
	FinSi
	
	si cantTPalta<>0 Entonces
		escribir "El porcentaje de alumnos con TP mayor a 7.5 es: " (cantTPalta/alumnos)*100
	FinSi
	
	si maxExposicion<>0 Entonces
		escribir "La mayor nota en las exposiciones fue " maxExposicion
	FinSi
	
	si cantParcial<>0 Entonces
		escribir "La cant. de alumnos con parciales entre 4-7.5 son: " cantParcial
	FinSi
	
FinAlgoritmo
