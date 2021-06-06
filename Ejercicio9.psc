Algoritmo Ejercicio9
	Definir T1, T2, conta, sumaT Como Entero
	Definir promedio Como Real
	Repetir
		Escribir "Ingrese la primera temperatura"
		leer T1
		Si T1 <> 0 Entonces
			Escribir "Ingrese la segunda temperatura"
			leer T2
			Si T1<=15 Y T1>=5 Entonces
				sumaT <- sumaT + T1
				conta <- conta + 1
			Fin Si
			Si T2<=15 Y T2>=5 Entonces
				sumaT <- sumaT + T2
				conta <- conta + 1
			Fin Si
		SiNo
			promedio <- sumaT / conta
			Escribir "Promedio de temperatura entre 5° y 15°: ",promedio
		Fin Si
	Hasta Que T1=0
FinAlgoritmo
