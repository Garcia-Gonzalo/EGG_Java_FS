

//Realizar un programa con el siguiente menú y le pregunte al usuario que quiere hacer hasta
//que ingrese la opción Salir:
//	A. Llenar Vector A. Este vector es de tamaño N y se debe llenar de manera aleatoria
//	usando la función Aleatorio(valorMin, valorMax) de PseInt.
//	B. Llenar Vector B. Este vector también es de tamaño N y se llena de manera aleatoria.
//	C. Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar elemento
//a elemento. Ejemplo: C = A + B
//	D. Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar elemento a
//elemento. Ejemplo: C = B - A
//E. Mostrar. Esta opción debe permitir al usuario decidir qué vector quiere mostrar: Vector
//	A, B, o C.
//	F. Salir.
//NOTA: El rango de los números aleatorios para los Vectores será de [-100 a 100]. La longitud
//		para todos los vectores debe ser la misma, por lo tanto, esa información sólo se solicitará una
//vez.


SubProceso llenarVector(vect, n)
	definir i Como Entero
	para i=0 hasta n-1 Hacer
		vect(i) = Aleatorio(-100,100)
	FinPara
FinSubProceso

SubProceso llenarC(vect,vectA, vectB, n, operacion)
	definir i Como Entero
	segun operacion Hacer
		"s":
			Escribir "Sumando A y B..."
		"r":
			Escribir "Restando A y B..."
	FinSegun
	
	para i = 0 hasta n-1 Hacer
		si operacion="s" Entonces
			vect(i) = vectA(i) + vectB(i)
		SiNo
			si operacion = "r" Entonces
				vect(i) = vectA(i) - vectB(i)
			FinSi
		FinSi
	FinPara
	
FinSubProceso

SubProceso menuMostrar(n,vectorA, vectorB, vectorC)
	definir option Como Caracter
	
	escribir "Ingrese el vector que desea visualizar A, B o C"
	Hacer
		leer option
	Mientras Que no (option='A' o option='B' o option='C')
	
	segun option hacer
		'A': 
			mostrarVector(vectorA, n)
		'B':
			mostrarVector(vectorB, n)
		'C':
			mostrarVector(vectorC, n)
	FinSegun
FinSubProceso

SubProceso mostrarVector(vect, n)
	definir i Como Entero
	para i=0 hasta n-1 Hacer
		escribir vect(i) ", " sin saltar
	FinPara
	escribir ""
	
FinSubProceso

Algoritmo guia4Ejercicio4
	definir n Como Entero
	definir option Como Caracter
	
	escribir "Ingrese el tamaño del vector"
	leer n
	
	dimension vectorA(n), vectorB(n), vectorC(n)
	definir vectorA, vectorB, vectorC como entero
	
	option ='z'
	Escribir "A. Llenar Vector A"
	Escribir "B. Llenar Vector B"
	Escribir "C. Llenar Vector C con la suma de los vectores A y B"
	Escribir "D. Llenar Vector C con la resta de los vectores B y A"
	Escribir  "E. Mostrar"
	escribir "F. Salir"
	
	mientras  option <> "F" Hacer
		leer option
		
		segun option Hacer
			"A":
				llenarVector(vectorA, n)
				Escribir "Se completó el vector A con numeros aleatorios entre -100 y 100"
			"B":
				llenarVector(vectorB, n)
				Escribir "Se completó el vector B con numeros aleatorios entre -100 y 100"
			"C":
				llenarC(vectorC, vectorA, vectorB, n, "s")
			"D":
				llenarC(vectorC, vectorA, vectorB, n, "r")
			"E":
				menuMostrar(n,vectorA, vectorB, vectorC)
			FinSegun
	FinMientras
	
FinAlgoritmo
