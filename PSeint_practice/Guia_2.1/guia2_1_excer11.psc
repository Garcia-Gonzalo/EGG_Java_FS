Algoritmo guia2_1_excer11
	definir defectuosos, ok Como Real
	definir grado Como Entero
	
	escribir " Ingrese la cantidad de tornillos defectuosos"
	leer defectuosos
	escribir " Ingrese la cantidad de tornillos No defectuosos"
	leer ok
	
	si  (defectuosos<200) Y (ok >10000) Entonces
		grado = 8
	SiNo
		si (defectuosos<200) O (ok >10000) Entonces
			Si (defectuosos<200) Entonces
				grado = 6
			SiNo
				grado = 7
			FinSi
		SiNo
			grado = 5
		FinSi
		
	FinSi
	
	escribir "El grado es " grado
	
	
FinAlgoritmo
