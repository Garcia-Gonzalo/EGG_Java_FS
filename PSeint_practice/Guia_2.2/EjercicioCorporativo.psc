Algoritmo EjercicioCorporativo
	
	Definir usuario, contrasenia, respuesta Como Caracter
	Definir login Como Logico
	Definir intentos, opciones, cantidadBotellas, peso, i, precio, acumuladorPrecio Como Entero
	
	login = Falso
	intentos = 0
	acumuladorPrecio = 0
	
	Mientras  intentos < 3 y no login Hacer
		Escribir "Ingrese el usuario: "
		Leer usuario
		si usuario = "Albus_D" Entonces
			Escribir "Ingrese la contraseña: "
			Leer contrasenia
			si contrasenia = "caramelosDeLimon" Entonces
				login = Verdadero
				Repetir
					Escribir "Ingrese una opcion: "
					Escribir "1. Ingresar botellas "
					Escribir "2. Consultar saldo "
					Escribir "3. Salir "
					leer opciones
					Segun opciones Hacer
						1:
							Escribir "Ingrese la cantidad de botellas: "
							Leer cantidadBotellas
							Para i=1 Hasta cantidadBotellas Hacer
								peso = Aleatorio(100,3000)
								si peso <= 500 Entonces
									precio = 50
								SiNo
									si peso <= 1500 Entonces
										precio = 125
									SiNo
										precio = 200
									FinSi
								FinSi
								Escribir "El precio es de: $" precio
								Escribir "Acepta el pago? (responda con si o con no):"
								Leer respuesta
								si respuesta = "si" Entonces
									acumuladorPrecio = acumuladorPrecio + precio
								SiNo
									Escribir "Devolviendo material..."
								FinSi
							Fin Para
						2:
							Escribir "Su saldo es de: " acumuladorPrecio
							
						3:
							Escribir "Esta saliendo de la aplicacion. "
						De Otro Modo:
							Escribir "La opcion ingresada no es valida."
					Fin Segun
				Mientras Que opciones <> 3
			FinSi
		FinSi
		intentos = intentos + 1
	Fin Mientras
FinAlgoritmo
