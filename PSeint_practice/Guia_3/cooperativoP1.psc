Funcion volumen <- calcularVolumen ( )
	definir volumen, l1, l2, l3 como real
	
	escribir "Ingrese los lados del objeto"
	escribir "Lado 1: "
	leer l1
	escribir "Lado 2: "
	leer l2
	escribir "Lado 3: "
	leer l3
	
	volumen = l1 * l2 *l3
Fin Funcion

//subprograma calcularViga
//Nos debe pedir el largo de la viga. Por metro lineal de viga se necesitarán: 9 kg de cemento,
//	0.02 m3 de arena, 0.02 m2 de piedra, 4 m de hierro del 8 y 3 m de hierro del 4.
//	Debemos mostrar al usuario la cantidad de materiales necesaria.

SubProceso calcularViga()
	definir largoViga Como Real
	
	Escribir  "Ingrese el largo de la viga en mts:"
	leer largoViga
	
	escribir "Necesitará:"
	escribir "-Cemento: " 9*largoViga " Kg"
	escribir "-Arena: " 0.02*largoViga " m3" 
	Escribir  "-Piedra: " 0.02*largoViga " m2"
	Escribir  "-Hierro del 8: " 4*largoViga " m"
	escribir "-Hierro del 4: " 3*largoViga " m"
		
FinSubProceso





Algoritmo test
		
	escribir calcularVolumen()
	//calcularViga()
	
FinAlgoritmo
