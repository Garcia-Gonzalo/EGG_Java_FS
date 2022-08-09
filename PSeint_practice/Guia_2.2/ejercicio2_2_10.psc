Algoritmo ejercicio2_2_10
	definir  vendedor Como Caracter
	definir cantVentas,i Como Entero
	definir sueldoBase, montoVentas, comision, venta Como Real
	
	montoVentas = 0
	
	
	Escribir "Ingrese el nombre del vendedor"
	leer vendedor
	
	Escribir  "Ingrese el sueldo base"
	leer sueldoBase
	
	Escribir  "Ingrese la cantidad de ventas de " vendedor
	leer cantVentas
	escribir "Vamos a pedir que ingrese el monto de cada venta"
	para i=1 hasta cantVentas con paso 1 Hacer
		escribir "venta " i
		leer venta
		montoVentas = montoVentas+venta
	FinPara
	
	comision = montoVentas*0.1
	
	escribir " Para el vendedor " vendedor
	Escribir  "Se debe abonar " comision " $ en concepto de comisiones"
	Escribir  "Se debe abonar " comision+sueldoBase " $ total"
	
	
FinAlgoritmo
