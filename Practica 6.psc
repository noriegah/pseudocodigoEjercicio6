Algoritmo edad_100personas
	menores25=0
	sumamenores=0;
	mayores25=0
	sumaMayores=0
	Para k<-1 Hasta 100 Con Paso 1 Hacer
		Escribir "Ingrese su edad,persona No." k
		Leer edad
		Si edad>=25 Entonces
			sumaMayores=sumaMayores+edad
			mayores25=mayores25+1
		SiNo
			sumamenores=sumamenores+edad
			menores25=menores25+1
		FinSi
	Fin Para
	promMayores=sumaMayores/mayores25
	promMenores=sumamenores/menores25
	Escribir "El promedio de personas mayores o iguales a 25 años es de " promMayores
	Escribir "El promedio de personas menores a 25 años es de " promMenores
FinAlgoritmo
