SubProceso menu() 
	Definir op Como Entero
	
	Escribir  "1 - Calcular muro de ladrillo"
	Escribir  "2 - Calcular viga de hormigón"
	Escribir  "3 - Calcular columnas de hormigón"
	Escribir  "4 - Calcular contrapisos"
	Escribir  "5 - Calcular techo"
	Escribir  "6 - Calcular pisos"
	Escribir  "7 - Calcular pintura"
	Escribir  "8 - Calcular iluminación"
	Escribir  "9 - Salir"
	
	Escribir  "Ingrese Una opcion : "
	leer op 
	Mientras  op <> 9 Hacer
		Segun op Hacer
			1:
				calcularMuro() 
				
			2:
				calcularViga()
			3:
				CalcularColumna()
			4: 
				calcularContrapisos()
			5:
				calcularTecho()
			6: 
				calcularPisos()
			7:
				calcularPintura( )
			8:
				calcularIluminacion()
			9:
				
			De Otro Modo:
				Escribir  "Ingrese Una opcion correcto : "
		Fin Segun
		menu()
	FinMientras
	
	
FinSubProceso

SubProceso calcularMuro()
	
	Definir grosor,largo,alto Como Entero
	Definir cemento,cemento2,arena,arena2,ladrillos,ladrillos2,super Como Real
	
	cemento=15.2;arena=0.115;ladrillos=120
	cemento2=10.9;arena2=0.09;ladrillos2=90
	Escribir "Indique el grosor del muro, si este mide 30 o 20 cm"
	
	Hacer
		Leer grosor
	Mientras Que grosor<>20 y grosor<>30
	
	super = calcularSuperficie()
	
	si grosor==30
		Escribir "Se necesitara " super*cemento " kg de cemento, " super*arena " m3 de arena y " super* ladrillos " de ladrillos "
	SiNo
		Escribir "Se necesitara " super*cemento2 " kg de cemento, " super*arena2 " m3 de arena y " super* ladrillos2 " de ladrillos "
	FinSi
FinSubProceso


Funcion superficie <- calcularSuperficie()
	Definir superficie, largo, ancho Como real
	Escribir "Ingresar largo: "
	leer largo
	Escribir "Ingresar ancho/alto:"
	leer ancho
	superficie = largo * ancho
Fin Funcion

funcion m3 <- calcularVolumen()
	Definir largo, ancho, profundidad, m3 Como Real
	Escribir "Calculador de volumen en metros cubicos (m3)"
	Escribir "Ingrese largo en metros"
	leer largo
	Escribir "Ingrese ancho en metros"
	leer ancho
	Escribir "Ingrese prfundidad en metros"
	leer profundidad
	m3 = (largo * ancho * profundidad )
FinFuncion




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

  SubProceso  CalcularColumna ()
	definir a, cem, are, pie, hie1, hie2 Como Real
	Escribir "Ingrese el largo de la columna"
	Leer a
	cem = a * 7.5
	are = a * 0.016 
	pie = a * 0.016
	hie1 = a * 6
	hie2 = a * 3
	
	Escribir "Para " a, " metros de columna se necesitaran: "
	escribir cem "kg de cemento."
	escribir are " m3 de arena."
	escribir pie " m2 de piedra."
	escribir hie1 "m de hierro del 10."
	escribir hie2 "m del hierro del 4."
	
Fin SubProceso


SubProceso calcularContrapisos()
	Definir volumen , cemento ,arena ,piedra Como real 
	
	volumen = calcularVolumen() 
	Escribir  "El volumen de este contra piso es  de : ",volumen , "  m3"
	cemento = volumen * 81
	Escribir  "La cantidad de cemento necesario es de : ",cemento , "  Kg"
	arena = volumen * 0.45
	Escribir  "La cantidad de arena necesario es de : ",arena ,"  m3"
	piedra = volumen * 0.9
	Escribir  "La cantidad de piedra necesario es de : ",piedra ,"  m3"
FinSubProceso


SubProceso  calcularTecho ()
	definir metroCuadrado, cemento, hierro8, hierro6 Como Entero
	definir M3arena, M3Piedra Como Real
	
	
	
	cemento=33
	M3arena=0.072
	M3Piedra=0.072
	hierro8=7
	hierro6=4
	metroCuadrado=calcularSuperficie()
	
	escribir "se necesitan ", cemento*metroCuadrado, " kg de cemento, ", M3arena*metroCuadrado, " m3 de arena, ", M3piedra*metroCuadrado, " m3 de piedra, ", hierro8*metroCuadrado, " m de hierro del 8 y " hierro6*metroCuadrado, " m de hierro del 6."
	
	
FinSubProceso



 SubProceso  calcularPisos ()
	Definir superficie Como Real
	superficie = (calcularSuperficie()*2)*0.1
	
	
	Escribir "La superficie del piso es: " superficie " m2"
	
	
FinSubProceso



SubProceso calcularPintura ( )
	definir resultadoSuperficie, litrosPintura Como Real
	resultadoSuperficie=calcularSuperficie() 
	litrosPintura=resultadoSuperficie/6
	escribir "Necesita ", litrosPintura " litros de pintura"
	
	
	
Fin SubProceso


SubProceso calcularIluminacion()
	Definir resultado Como Real
	resultado = calcularSuperficie() * 0.2
	Escribir "La superficie mínima de aberturas de vidrio debe ser de " , resultado , "m2"
FinSubProceso





Algoritmo menuOpciones
	menu()
FinAlgoritmo

