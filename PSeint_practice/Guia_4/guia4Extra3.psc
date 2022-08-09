//Crear dos vectores que tengan el mismo tamaño (el tamaño se pedirá por teclado) y
//almacenar en uno de ellos nombres de personas como cadenas. En el segundo vector se
//debe almacenar la longitud de cada uno de los nombres (para ello puedes usar la función
//	Longitud() de PseInt). Mostrar por pantalla cada uno de los nombres junto con su longitud.

subproceso ingresarNombres(vect, n)
	definir i Como Entero
	Escribir "Ingrese los " n " nombres"
	para i=0 hasta n-1 Hacer
		leer vect(i)
	FinPara
FinSubProceso
	
	
subproceso calculaTamanio(nombres, tamanio, n)
	definir i Como Entero
	para i=0 hasta n-1 hacer
		tamanio(i) = longitud(nombres(i))
	FinPara
FinSubProceso

SubProceso mostrarDatos(nombres, tamanio, n)
	definir i Como Entero
	para i=0 hasta n-1 hacer
		escribir nombres(i) ': ' tamanio(i) 
	FinPara
FinSubProceso



Algoritmo guia4Extra3
	definir nombres Como Caracter
	definir tamanio, n Como Entero
	
	escribir "Ingrese el tamaño del vector"
	leer n
	
	dimension nombres(n), tamanio(n)
	
	ingresarNombres(nombres,n)
	calculaTamanio(nombres,tamanio,n)
	mostrarDatos(nombres,tamanio,n)
FinAlgoritmo
