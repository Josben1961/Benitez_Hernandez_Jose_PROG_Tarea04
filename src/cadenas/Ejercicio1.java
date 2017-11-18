package cadenas;

import utilidades.Entrada;

public class Ejercicio1 {

	public static void main(String[] args) {
		String palabra;

		System.out.println("Introduzca una palabra");
		palabra = Entrada.cadena();
		

		if (palabra.contains("a") && palabra.contains("e") && palabra.contains("i")
				&& palabra.contains("o")&& palabra.contains("u")) {
				
			System.out.println("La palabra es panvocálica");

		} else {
			System.out.println("La palabra NO es panvocálica");
		}
	}

}
