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
			System.out.println("Introduzca un número de triángulos");
			cantTriangulos = Entrada.entero();
		} while (cantTriangulos < 0);
		
		/*Creamos un array para calcular los puntos (multiplico la cantidad 
		 * de triángulos introducidos por 3 puntos que tiene cada triángulo)
		 */
		Punto[] arrayPuntos = new Punto[cantTriangulos * 3];
		
		//Relleno el array con puntos aleatorios con la función Math.random().
		for (int i = 0; i < arrayPuntos.length; i++) {
			arrayPuntos[i] = new Punto((double) (Math.random() * 10), (double) (Math.random() * 10));
		}
		
		//Creo el array para la cantidad de triángulos
		Triangulo[] arrayTriangulos = new Triangulo[cantTriangulos];
		
		// Definición de los puntos de mi triángulo
		Punto A = new Punto(0, 5);

		Punto B = new Punto(10, 14);

		Punto C = new Punto(7, 15);

		Triangulo miTriangulo = new Triangulo(A, B, C);	
		
		// Objetos para triángulo mayor y triángulo menor
				Triangulo triMayor = new Triangulo(A, B, C);
				Triangulo triMenor = new Triangulo(A, B, C);
		
		// Cálculo de la suma de perímetros
				for (int i = 0; i < cantTriangulos; i++) {
					arrayTriangulos[i] = new Triangulo(arrayPuntos[contPuntos], 
					arrayPuntos[contPuntos + 1],arrayPuntos[contPuntos + 2]);
					contPuntos += 3;		
					
					periSuma = periSuma + arrayTriangulos[i].perimetro();
				}
				// Calculo la media de los perímetros
				perimMedia = periSuma / cantTriangulos;
			
				// Definimos el triángulo mayor y el menor
				for (int i = 0; i < cantTriangulos; i++) {

					if (arrayTriangulos[i].perimetro() > perimMedia) {
						mayorQueMedia++;
					}
					if (arrayTriangulos[i].perimetro() < perimMedia) {
						menorQueMedia++;
					}
					if (arrayTriangulos[i].perimetro() == periMayor) {
						triMayor = arrayTriangulos[i];
					}
					if (arrayTriangulos[i].perimetro() > periMayor) {
						triMenor = arrayTriangulos[i];
					}

				}

				System.out.println("La media es: " + perimMedia);
				
				System.out.println("Tenemos " + mayorQueMedia + " triangulos con un perímetro superior a la media");
				
				System.out.println("Tenemos " + menorQueMedia + " con un perímetro inferior a la media");

				System.out.println("El triangulo mayor tiene de vértices: " + triMayor.toString());

				System.out.println("El triangulo menor tiene de vértices: " + triMenor.toString());


	}

}
