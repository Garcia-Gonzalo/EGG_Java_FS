//Disponemos de un vector unidimensional de 20 elementos de tipo carácter. Se pide
//desarrollar un programa que:
//	a) Pida una frase al usuario y luego ingrese la frase dentro del arreglo letra por letra.
//Ayuda: utilizar la función Subcadena de PSeInt.
//	b) Una vez completado lo anterior, pedirle al usuario un carácter cualquiera y una
//	posición dentro del arreglo, y el programa debe intentar ingresar el carácter en la
//	posición indicada, si es que hay lugar (es decir la posición está vacía o es un espacio
//	en blanco). De ser posible debe mostrar el vector con la frase y el carácter ingresado,
//	de lo contrario debe darle un mensaje al usuario de que esa posición estaba ocupada.

SubProceso  mostrarArray(fraseArray)
	definir i Como Entero
	para i=0 hasta 19 Hacer
		escribir fraseArray(i) ' ' Sin Saltar
	finPara
	escribir ''
FinSubProceso

SubProceso completarArray(frase por valor, fraseArray Por Referencia)
	definir i, tamanioFrase Como Entero
	
	tamanioFrase = Longitud( frase )
	
	si tamanioFrase >= 20 Entonces
		
		para i=0 hasta 19 Hacer
			// completar el array con la frase
			fraseArray(i) = subcadena(frase, i ,i)
		FinPara
	SiNo
		para i=0 hasta tamanioFrase-1
			// completar el array con la frase
			fraseArray(i) = subcadena(frase, i ,i)
		FinPara
		
		para i= tamanioFrase hasta 19 hacer
			// completar el array con espacio en blanco
			fraseArray(i) = ' '
		FinPara
	FinSi
	
	escribir "Array cargado"
FinSubProceso

SubProceso  insertarArray(char por valor, posicion por valor, fraseArray)
	Definir  i Como Entero
	definir datoResguardo, datoInsertar Como Caracter
	
	
	si (posicion >=0 y posicion <=19) y longitud(char)=1 Entonces  // Validacion
		datoInsertar = char
		para i=posicion hasta 19 Hacer     // itero desde la posicion hasta el final
			datoResguardo= fraseArray(i)  // guardo el valor de la posicion que voy a insertarArray
			fraseArray(i) = datoInsertar  // inserto el nuevo valor en esa posicion
			datoInsertar=datoResguardo    // actualizo el dato a insertar con el valor que tenia en resguardo
		FinPara
		
	SiNo
		escribir "No ha ingresado una posicion valida o ha ingresado mas de un caracter"
			
	FinSi
	
FinSubProceso


Algoritmo guia4Extra5
	definir frase, fraseArray, char Como Caracter
	definir posicion Como Entero
	
	dimension fraseArray(20)
	
	escribir "Ingrese una frase"
	leer frase
	
	completarArray(frase, fraseArray)
	
	mostrarArray(fraseArray)

	escribir "Ingrese una posicion 0 al 19"
	leer posicion
	Escribir  "Ingrese un caracter"
	leer char
	
	insertarArray(char, posicion, fraseArray)
	
	mostrarArray(fraseArray)
	
	
FinAlgoritmo
