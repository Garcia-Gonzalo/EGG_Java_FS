Funcion dia <- ultimoDiaMes ( mes )
	definir dia Como Entero
	segun mes
		1,3,5,7,8,10,12:
			dia= 31
		4,6,9,11:
			dia = 30
		De Otro Modo:
			dia = 28			
	FinSegun
	
Fin Funcion



SubProceso diaAnterior(dia,mes,anio)
	dia = dia -1
	si dia =0 Entonces         //Cambio de mes
		mes = mes - 1
		si mes = 0 Entonces   //Cambia de año
			dia = 31
			mes = 12
			anio = anio -1
		SiNo
			dia = ultimoDiaMes(mes)
		FinSi
	SiNo
		
	FinSi
	
	escribir "La fecha es: " dia "/" mes "/" anio

	
FinSubProceso


Algoritmo guia3Extra13
	definir dia, mes, anio Como Entero
	
	escribir "Ingrese dia,mes, año"
	leer dia, mes, anio
	
	diaAnterior(dia, mes,anio)
	
FinAlgoritmo
