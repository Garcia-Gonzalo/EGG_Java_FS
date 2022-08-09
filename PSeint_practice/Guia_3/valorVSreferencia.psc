//Funcion frase <- cooperar ( v1 Por Valor, v2 Por Valor )
//	definir frase Como Caracter
//	
//	frase = Concatenar(v1,v2)
//Fin Funcion
//
//Algoritmo guia3_cooperar
//	
//	 escribir cooperar("Cooperando"," trabajamos mejor")
//	
//FinAlgoritmo
//
// -------------------------------------------------------
//Funcion retorno <- Paridad ( num Por Valor)
//	definir retorno como logico
//	retorno = (num MOD 2) == 0
//	
//Fin Funcion
//
//
//Algoritmo guia3_errores1
//	escribir paridad(9)
//	escribir paridad(10)
//FinAlgoritmo
//----------------------------------------------------------


// Errores pag 16
//Funcion retorno <- Comparar(n1 Por Valor, n2 por valor)
//	definir retorno como  logico
//	retorno = n1 > n2
//FinFuncion
//
//Algoritmo Prueba
//		Definir num1, num2 Como Entero
//		Definir resultado Como Logico
//		num1 = 3
//		num2 = 6
//		resultado = Comparar(num1,num2)
//		Escribir "El num1 es mayor a num2, esta afirmación es: " resultado
//FinAlgoritmo
// -----------------------------


//Algoritmo valorVSreferencia
//	Definir num Como Entero
//	num = 2
//	Escribir num
//	Escribir "Ahora enviamos el número a la función por valor y el resultado es:" 
//	elevarAlCuadradoPorValor(num)
//	Escribir num
//	
//	Escribir "***********"
//	
//	Escribir "Ahora enviamos el número a la función por referencia y el resultado es:" 	
//	elevarAlCuadradoPorReferencia(num)
//	Escribir num
//	
//FinAlgoritmo
//
//SubProceso elevarAlCuadradoPorValor(num Por Valor)
//	num = num * num
//FinSubProceso
//
//SubProceso elevarAlCuadradoPorReferencia(num Por Referencia)
//	num = num * num
//FinSubProceso
