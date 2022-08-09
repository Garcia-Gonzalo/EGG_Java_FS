Algoritmo guia2_1_Extra2
	definir mes Como Caracter
	definir monto Como Real
	
	Escribir  " Ingrese el mes"
	leer mes
	Escribir  " Ingrese el monto de la compra"
	leer monto
	
	si mes="septiembre" O mes="octubre" O mes ="noviembre" entonces
		monto = monto * 0.9
		escribir "Con dto 10% debe abonar " monto
	SiNo
		escribir " No aplica dto"
	FinSi
	
FinAlgoritmo
