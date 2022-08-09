Funcion fraseNueva <- eliminaVocal ( frase, vocal )
	// elimina la vocal de la frase y devuelve la frase actualizada
	definir fraseNueva, letra Como Caracter
	definir i como entero
	
	fraseNueva =""
	
	para i=0 hasta Longitud(frase)-1 con paso 1 Hacer
		
		letra = Subcadena(frase,i,i)
		
		si letra <> vocal Entonces
			fraseNueva = fraseNueva + letra
		FinSi
		
	FinPara
	
Fin Funcion


SubProceso vocalesRepetidas (frase)
	definir aa,ee,ii,oo,uu, j Como Entero
	
	aa=0
	ee=0
	ii=0
	oo=0
	uu=0
	
	// cuenta la cantidad de cada vocales
	para j=0 hasta longitud(frase)-1 con paso 1 Hacer
		segun subcadena(frase,j,j) Hacer
			"a":
				aa=aa+1
			"e":
				ee=ee+1
			"i":
				ii=ii+1
			"o":
				oo=oo+1
			"u":
				uu=uu+1
		FinSegun
	FinPara
	
	// Elimina las vocales repetidas
	si aa > 1 Entonces
		frase = eliminaVocal(frase, "a")
	FinSi
	si ee > 1 Entonces
		frase = eliminaVocal(frase, "e")
	FinSi
	si ii > 1 Entonces
		frase = eliminaVocal(frase, "i")
	FinSi
	si oo > 1 Entonces
		frase = eliminaVocal(frase, "o")
	FinSi
	si uu > 1 Entonces
		frase = eliminaVocal(frase, "u")
	FinSi
	
	escribir frase
	
FinSubProceso

Algoritmo guia3Extra14
	definir frase Como Caracter
	
	escribir "Ingrese su frase"
	leer frase
	
	vocalesRepetidas(frase)
	
FinAlgoritmo
