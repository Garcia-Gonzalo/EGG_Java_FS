//Crear un vector que contenga 100 notas de 100 supuestos estudiantes, con valores entre 0 y
//20 generadas aleatoriamente mediante el uso de la función azar() o aleatorio() de PseInt.
//Luego, de acuerdo a las notas contenidas, el programa debe indicar cuántos estudiantes son:
//	a)
//	b)
//	c)
//	d)
//	Deficientes 0-5
//	Regulares 6-10
//	Buenos 11-15
//	Excelentes 16-20


subproceso generarNotas(vect)
	definir i Como Entero
	para i=0 hasta 99 Hacer
		vect(i) = aleatorio(0,20)
	FinPara
FinSubProceso

subproceso clasificarNotas(alumnos, titleNotas, notasAgrupadas)
	definir i Como Entero
	
	titleNotas(0) = 'Deficientes'
	titleNotas(1) = 'Regulares'
	titleNotas(2) = 'Buenos'
	titleNotas(3) = 'Excelentes'
	
	para i=0 hasta 3 Hacer
		notasAgrupadas(i) = 0
	FinPara
	
	para i=0 hasta 99 Hacer
		si alumnos(i) <=5 Entonces
			notasAgrupadas(0) = notasAgrupadas(0) + 1
		FinSi
		si alumnos(i)<=10 Entonces
				notasAgrupadas(1) = notasAgrupadas(1) + 1
		finSi
		si alumnos(i) <= 15 Entonces
			notasAgrupadas(2) = notasAgrupadas(2) + 1
		sino
			notasAgrupadas(3) = notasAgrupadas(3) + 1
		FinSi
	FinPara
FinSubProceso

SubProceso mostrarNotas(titleNotas, notasAgrupadas)
	definir i Como Entero
	para i=0 hasta 3 Hacer
		escribir titleNotas(i) ': ' notasAgrupadas(i)
	FinPara
FinSubProceso

Algoritmo guia4Extra4
	definir titleNotas Como Caracter
	definir notasAgrupadas, alumnos Como Entero
	
	dimension titleNotas(4), notasAgrupadas(4), alumnos(100)
	
	generarNotas(alumnos)
	clasificarNotas(alumnos, titleNotas, notasAgrupadas)
	mostrarNotas(titleNotas,notasAgrupadas)
FinAlgoritmo
