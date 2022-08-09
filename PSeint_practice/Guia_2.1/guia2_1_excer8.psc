Algoritmo guia2_1_excer8
	definir palabra, primera, ultima Como Caracter
	definir longi como entero
	
	escribir "escriba la palabra"
	leer palabra
	
	longi = longitud(palabra)
	primera = SubCadena(palabra,0,0)
	ultima = SubCadena(palabra,longi-1,longi)
	
	si primera = ultima Entonces
		escribir "correcto"
	SiNo
		escribir "correcto"
	FinSi
	
	
FinAlgoritmo
