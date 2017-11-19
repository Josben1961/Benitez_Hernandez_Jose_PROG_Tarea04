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
		 double x1=x;
		 double y1=y;
		 double x2 = puntoParam.getX();
		 double y2 = puntoParam.getY();
		
		 double distancia = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		 return distancia;
	 }

}
