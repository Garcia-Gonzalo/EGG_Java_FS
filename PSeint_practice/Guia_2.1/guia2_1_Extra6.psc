Algoritmo guia2_1_Extra6
	definir dia, mes, anio Como Entero
	definir mes_txt Como Caracter
	
	escribir " Ingrese dia, mes y año"
	leer dia
	leer mes
	leer anio
	
	si ((dia>0) Y (dia <= 31)) Y ((mes>0) Y (mes<=12)) Y ((anio>0) Y (anio<3000)) Entonces
		segun mes Hacer
			1: mes_txt = "Enero"
			2: mes_txt = "Febrero"
			3: mes_txt = "Marzo"
			4: mes_txt = "Abril"
			5: mes_txt = "Mayo"
			6: mes_txt = "Junio"
			7: mes_txt = "Julio"
			8: mes_txt = "Agosto"
			9: mes_txt = "Septiembre"
			10: mes_txt = "octubre"
			11: mes_txt = "Noviembre"
			12: mes_txt = "Diciembre"
		FinSegun
		escribir dia " de " mes_txt " de " anio
	SiNo
		escribir "la fecha esta mal ingresada"
	FinSi
	
	
FinAlgoritmo
