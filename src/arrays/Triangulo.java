package arrays;

public class Triangulo {

	private Punto vertA;
	private Punto vertB;
	private Punto vertC;

	public Triangulo(Punto vertA, Punto vertB, Punto vertC) {
		this.vertA = vertA;
		this.vertB = vertB;
		this.vertC = vertC;
	}

	public Punto getVertA() {
		return vertA;
	}

	public Punto getVertB() {
		return vertB;
	}

	public Punto getVertC() {
		return vertC;
	}

	@Override
	public String toString() {
		return "Triangulo [vertA=" + vertA.toString() + ", vertB=" + vertB.toString() + ", vertC=" + vertC.toString()
				+ "]";
	}

	// Método para calcular el perímetro
	public double perimetro() {
		double ladoAB = vertA.distancia(vertB);
		double ladoBC = vertB.distancia(vertC);
		double ladoCA = vertC.distancia(vertA);
		double perimetro = (ladoAB + ladoBC + ladoCA);
		return perimetro;
	}

}
