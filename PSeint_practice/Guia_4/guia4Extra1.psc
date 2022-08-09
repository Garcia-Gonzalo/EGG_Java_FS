//Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios y los
//muestre por pantalla.
subproceso mostrarVector(vect)
	definir i Como Entero
	para i=0 hasta 4 Hacer
		escribir vect(i) ' ' Sin Saltar
	FinPara
	escribir ''
FinSubProceso


Algoritmo guia4Extra1
	definir vect1, vect2, i Como Entero
	
	dimension vect1(5), vect2(5)
	
	para i = 0 hasta 4 Hacer
		vect1(i)= Aleatorio(0,9)
		vect2(i)= Aleatorio(0,9)
	FinPara
	
	mostrarVector(vect1)
	mostrarVector(vect2)
	
FinAlgoritmo
