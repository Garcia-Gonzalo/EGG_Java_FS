//Una distribuidora de Nescafé tiene 4 representantes que viajan por toda la Argentina
//ofreciendo sus productos. Para tareas administrativas el país está dividido en cinco zonas:
//		Norte, Sur, Este, Oeste y Centro. Mensualmente almacena sus datos y obtiene distintas
//		estadísticas sobre el comportamiento de sus representantes en cada zona. Se desea hacer un
//	programa que lea el monto de las ventas de los representantes en cada zona y calcule luego:
//		a) el total de ventas de una zona introducida por teclado
//		b) el total de ventas de un vendedor introducido por teclado en cada una de las zonas
//		c) el total de ventas de todos los representantes.

// -----------------------Carga de la matriz------------------------------------------------------------------------
subproceso completarCeros(ventas)
	// inicializa la matriz con 0
	definir i, j Como Entero
	para i=0 hasta 4 Hacer
		para j=0 hasta 3 Hacer
			ventas(i,j) = 0
		FinPara
	FinPara
FinSubProceso

funcion zona <- ingresarZona()
	// Valida la opcion de Zona
	definir zona Como Entero
	Hacer
		Escribir "Ingrese zona"
		Escribir " 1.Norte, 2.Sur, 3.Este, 4.Oeste, 5.Sur   0.Salir"
		leer zona
	Mientras Que zona <0 o zona > 5
	zona = zona -1
FinFuncion

funcion vendedor<- ingresarVendedor()
	// Valida la opcion de vendedor
	definir vendedor Como Entero
	Hacer
		Escribir "Ingrese Vendedor"
		Escribir " 1,2,3,4   0.Salir"
		leer vendedor
	Mientras Que vendedor <0 o vendedor > 4
	vendedor = vendedor - 1
FinFuncion

funcion venta<- ingreseVenta()
	// Ingresa el monto de la venta
	definir venta Como Entero
	escribir "Ingrese la Venta"
	leer venta
FinFuncion

funcion completo <- yaIngresado(ventas, zona, vendedor)
	// Evalúa si la posición ya está ocupada
	definir completo Como Logico
	si ventas(zona,vendedor) <>0 Entonces
		completo=Verdadero
	SiNo
		completo=Falso
	FinSi
FinFuncion

subproceso cargarMatriz(ventas)
	// Carga la matriz
	definir salir Como Logico
	definir vendedor, zona Como Entero
		
	salir =Falso
	
	mientras salir=Falso Hacer
		
		zona=ingresarZona()
		
		si zona <> -1 Entonces
			
			vendedor=ingresarVendedor()
			
			si vendedor <> -1 Entonces
				si yaIngresado(ventas, zona, vendedor) Entonces
					escribir "Esa posicion ya fue ingresada"
				SiNo
					ventas(zona,vendedor) = ingreseVenta()
				FinSi
				
			SiNo
				salir = Verdadero				
			FinSi
		SiNo
			salir=Verdadero
		FinSi
		
	FinMientras
	escribir "Datos cargados exitosamente"
	
FinSubProceso

// --------------------Estadisticas-----------------------------------------------------------------------------------------------

funcion total <- calcularTotal(ventas)
	// Calcula el total de las ventas
	definir total, j, i Como Entero
	total = 0
	para i=0 hasta 4 Hacer
		para j=0 hasta 3 Hacer
			total = total + ventas (i,j)
		FinPara
	FinPara
FinFuncion

funcion parcial <- totalesZona(ventas, zona)
	// Calcula las ventas de una zona
	definir parcial, i como entero
	parcial =0
	para i=0 hasta 3 Hacer
		parcial = parcial + ventas(zona, i)
	FinPara
FinFuncion

funcion parcial <- totalesVendedor(ventas, vend)
	// calcula las ventas de un vendedor
	definir parcial, i como entero
	parcial =0
	para i=0 hasta 4 Hacer
		parcial = parcial + ventas(i, vend)
	FinPara
FinFuncion

subproceso estadisticas(ventas)
	// Menu para calcular las estadisticas
	definir opciones, in Como Entero
	definir salir Como Logico
	
	salir=Falso
		
	mientras salir=falso Hacer
		Escribir  "Estadisticas:"
		escribir "1. Total de ventas de una zona "
		Escribir "2.Total de ventas de un vendedor"
		escribir "3. Total de ventas de todos los representantes"
		escribir "4.salir"
		leer opciones
		segun opciones
			4:
				salir=Verdadero
			1: 
				escribir "Ingrese la zona:"
				leer in
				si in >=1 y in<= 5 Entonces
					escribir "Ventas en la zona " in ": " totalesZona(ventas, in-1)
				SiNo
					escribir "Dato incorrecto"
				FinSi
			2:
				escribir "Ingrese un vendedor"
				leer in
				si in>=1 y in <=4 Entonces
					escribir "Ventas del vendedor " in ": " totalesVendedor(ventas, in-1)
				SiNo
					escribir "Dato incorrecto"
				FinSi
			3:
				escribir "El total de ventas es " calcularTotal(ventas)
		FinSegun
	FinMientras
FinSubProceso


//-----------------------------------------------------------------------------------------------------------------
SubProceso mostrarMatrix(matric, m,n)
	definir i, j Como entero
	
	para i= 0 hasta m-1 Hacer
		para j=0 hasta n-1 Hacer
			escribir matric(i,j) ' ' Sin Saltar
		FinPara
		escribir ''
	FinPara
	
FinSubProceso



//-----------------------------------------------------------------------------------------------------------------------
Algoritmo guia4Extra16
	definir ventas Como Entero
	
	dimension ventas(5,4)
	
	completarCeros(ventas)
	cargarMatriz(ventas)
	mostrarMatrix(ventas,5,4)
	estadisticas(ventas)
	
FinAlgoritmo
