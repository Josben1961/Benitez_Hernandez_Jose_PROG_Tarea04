package arrays;

public class Punto {
	private double x, y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	public double distancia(Punto puntoParam) {
		double x1 = puntoParam.x;
		double y1 = puntoParam.y;

		double distancia = Math.sqrt(Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2));
		return distancia;
	 }

}
