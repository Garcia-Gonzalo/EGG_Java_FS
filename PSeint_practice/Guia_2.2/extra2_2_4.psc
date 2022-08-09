Algoritmo extra2_2_4
	definir alumno Como Caracter
	definir nota, notaFinal Como Real
	definir i Como Entero
	definir error Como Logico
	
	
	escribir "ingrese el nombre del alumno"
	leer alumno	
		
	Mientras alumno <> "" Hacer
		notaFinal = 0
		error = Falso
		
		// lee notas
		para i =1 hasta 3 con paso 1 Hacer
			Segun i
				1: 
					escribir "Nota practico"
					leer nota
					si nota <0 O nota >10 Entonces
						error = Verdadero
					FinSi
					notaFinal = notaFinal + nota*0.1
				2:
					escribir "Nota problemas"
					leer nota
					si nota <0 O nota >10 Entonces
						error = Verdadero
					FinSi
					notaFinal = notaFinal + nota*0.5
				3:
					escribir "Nota teorico"
					leer nota
					si nota <0 O nota >10 Entonces
						error = Verdadero
					FinSi
					notaFinal = notaFinal + nota*0.4
			FinSegun
			
		FinPara
		
		si error=Falso entonces
			escribir "La nota final de " alumno " es " notaFinal
		SiNo
			escribir "Ha ingresado valor de nota inválido"
		FinSi
		
		escribir "ingrese el nombre del alumno"
		leer alumno
		
		
	FinMientras
	
	
	
FinAlgoritmo
