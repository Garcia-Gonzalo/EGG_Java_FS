Algoritmo guia2_1_Extra11
	definir n1,n2,n3, n4 como entero
	
	escribir "ingrese la nota 1"
	leer n1
	escribir "ingrese la nota 2"
	leer n2
	escribir "ingrese la nota 3"
	leer n3
	escribir "ingrese la nota 4"
	leer n4
	
	si n1<n2 Y n1<n3 Y n1<n4 Entonces
		escribir " la nota eliminada es la 1 " n1
		escribir "promedio" (n2+n3+n4)/3
	SiNo
		si n2<n1 Y n2<n3 Y n2<n4 Entonces
			escribir " la nota eliminada es la 2 " n2
			escribir "promedio" (n1+n3+n4)/3
		SiNo
			si n3<n1 Y n3<n2 Y n3<n4 Entonces
				escribir " la nota eliminada es la 3 " n3
				escribir "promedio" (n1+n2+n4)/3
			SiNo
				si n4<n1 Y n4<n2 Y n4<n3 Entonces
					escribir " la nota eliminada es la 4 " n4
					escribir "promedio" (n1+n2+n3)/3
				finsi
			finsi	
			
		FinSi
		
	FinSi
	
FinAlgoritmo
