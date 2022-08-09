//Una empresa de venta de productos por correo desea realizar una estadística de las ventas
//realizadas de cada uno de sus productos a lo largo de una semana. Distribuya luego 5
//productos en los 5 días hábiles de la semana. Se desea conocer:
//	a) Total de ventas por cada día de la semana.
//	b) Total de ventas de cada producto a lo largo de la semana.
//	c) El producto más vendido en cada semana.
//	d) El nombre, el día de la semana y la cantidad del producto más vendido.

Subproceso completarMatrix(matric, m, n)
	definir i, j Como entero
	
	para i= 0 hasta m-1 Hacer
		para j=0 hasta n-1 Hacer
			matric(i,j) = aleatorio(0,100)
		FinPara
	FinPara
	
FinSubProceso

SubProceso totalPorDia(grilla)
	definir i, j Como Entero
	
	para j=0 hasta 4 Hacer   //recorro cada columna(dia de la semana)
		
		grilla(5,j) = 0
		
		para i=0 hasta 4 Hacer   //recorro cada fila(producto)
			
			grilla(5,j) = grilla(5,j) + grilla(i,j)
						
		FinPara
		
	FinPara
FinSubProceso

subproceso totalProducto(grilla)
	definir i, j Como Entero
	para i=0 hasta 4 Hacer   //recorro cada fila (producto)
		
		grilla(i,5) = 0
		
		para j=0 hasta 4 Hacer   //recorro columna (dia)
			
			grilla(i,5) = grilla(i,5) + grilla(i,j)
			
		FinPara
		
	FinPara
FinSubProceso



SubProceso mostrarMatrix(matric, m,n)
	definir i, j Como entero
	
	para i= 0 hasta m-1 Hacer
		escribirEtiquetas(i)
		para j=0 hasta n-1 Hacer
			escribir matric(i,j) ' ' Sin Saltar
		FinPara
		escribir ''
	FinPara
	
FinSubProceso

funcion producto<- elMasVendido(grilla)
	definir mayor, producto, i Como Entero
	producto = 0
	mayor = grilla(0,5)
	
	para i=1 hasta 4 Hacer
		si grilla(i,5) > mayor Entonces
			producto = i
			mayor = grilla(i,5)
		FinSi
	FinPara
FinFuncion


SubProceso diaMayorVenta(grilla)
	definir i, j, mayor, dia, producto Como Entero
	
	mayor = grilla(0,0)
	producto = 0
	dia = 0
	
	para i=0 hasta 4 Hacer   // i corresponde al id del producto
		
		para j=0 hasta 4 Hacer   // j corresponde al id del dia de la semana
			
			si grilla(i,j) > mayor Entonces
				mayor = grilla(i,j)
				dia = j
				producto = i
			FinSi
			
		FinPara
		
	FinPara
	
	Escribir 'El dia ' dia ' se vendió ' mayor ' del producto ' producto

FinSubProceso

funcion total<- totalVendido(grilla)
	definir i, j, total Como Entero
	
	total = 0
	
	para i=0 hasta 4 Hacer
		para j =0 hasta 4 Hacer
			total = total + grilla (i,j)
		FinPara
	FinPara
FinFuncion

subproceso escribirEtiquetas(id)
	segun id Hacer
		-1:
			escribir '               Lunes  Martes  Miercoles  Jueves  Viernes   Total producto'
		0:
			escribir 'Producto 1   ' Sin Saltar
		1:
			escribir 'Producto 2   ' Sin Saltar
		2:
			escribir 'Producto 3   ' Sin Saltar
		3:
			escribir 'Producto 4   ' Sin Saltar
		4:
			escribir 'Producto 5   ' Sin Saltar
		5:
			escribir 'Total        ' Sin Saltar
			
	FinSegun
	
FinSubProceso



Algoritmo guia4Ectra15
	definir grilla, i como entero
		
	dimension grilla(7,6)
	
	completarMatrix(grilla,5,5)
	
	totalPorDia(grilla)
	
	totalProducto(grilla)
	
	escribirEtiquetas(-1)
	
	mostrarMatrix(grilla, 5,5)
	escribir "El total vendido de la semana fue " totalVendido(grilla)
	escribir "El producto mas vendido fue el " elMasVendido(grilla)
	diaMayorVenta(grilla)
	
	
	
	
FinAlgoritmo
