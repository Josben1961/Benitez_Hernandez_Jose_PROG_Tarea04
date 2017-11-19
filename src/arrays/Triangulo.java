package arrays;

public class Triangulo {
	
	private Punto vertA;
	private Punto vertB;
	private Punto vertC;
	
	public Triangulo(Punto vertA, Punto vertB, Punto vertC) {
		this.vertA=vertA;
		this.vertB=vertB;
		this.vertC=vertC;
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
	

}
