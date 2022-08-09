//Programe una función que calcule el producto de un arreglo de números enteros. Para esto
//	imagine, por ejemplo, que para un vector V de tamaño 4, el producto de todos los valores es
//		igual a (V[1]*V[2]*V[3]*V[4])

funcion resultado <- productoVector(vect, dim)
	definir i, resultado como entero
	resultado=1
	para i = 0 hasta dim Hacer
		resultado = resultado * vect(i)
	FinPara
		
	
FinFuncion

Algoritmo guia4Extra8
	definir vect, i como entero
	
	dimension vect(5)
	
	para i=0 hasta 4 Hacer
		vect(i) = aleatorio(1,9)
		si i <4 Entonces
			escribir vect(i) '*' sin saltar
		SiNo
			escribir vect(i) ' ' sin saltar
		FinSi
		
	FinPara
	
	escribir '=' productoVector(vect, 4)
	
FinAlgoritmo
