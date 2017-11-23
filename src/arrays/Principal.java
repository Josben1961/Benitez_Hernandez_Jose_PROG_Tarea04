package arrays;

import utilidades.Entrada;

public class Principal {

	public static void main(String[] args) {
		//Variables
		int cantTriangulos;		
		int contPuntos = 0;
		int mayorQueMedia = 0;
		int menorQueMedia = 0;
		double periSuma = 0;
		double periMayor = 0;
		double periMenor = 0;
		double perimMedia;
		do {			
			System.out.println("Introduzca un n�mero de tri�ngulos");
			cantTriangulos = Entrada.entero();
		} while (cantTriangulos < 0);
		
		/*Creamos un array para calcular los puntos (multiplico la cantidad 
		 * de tri�ngulos introducidos por 3 puntos que tiene cada tri�ngulo)
		 */
		Punto[] arrayPuntos = new Punto[cantTriangulos * 3];
		
		//Relleno el array con puntos aleatorios con la funci�n Math.random().
		for (int i = 0; i < arrayPuntos.length; i++) {
			arrayPuntos[i] = new Punto((double) (Math.random() * 10), (double) (Math.random() * 10));
		}
		
		//Creo el array para la cantidad de tri�ngulos
		Triangulo[] arrayTriangulos = new Triangulo[cantTriangulos];
		
		// Definici�n de los puntos de mi tri�ngulo
		Punto A = new Punto(0, 5);

		Punto B = new Punto(10, 14);

		Punto C = new Punto(7, 15);

		Triangulo miTriangulo = new Triangulo(A, B, C);	
		
		// C�lculo de la suma de per�metros
				for (int i = 0; i < cantTriangulos; i++) {
					arrayTriangulos[i] = new Triangulo(arrayPuntos[contPuntos], 
					arrayPuntos[contPuntos + 1],arrayPuntos[contPuntos + 2]);
					contPuntos += 3;		
					
					periSuma = periSuma + arrayTriangulos[i].perimetro();
				}
				// Calculo la media de los per�metros
				perimMedia = periSuma / cantTriangulos;
			

	}

}
