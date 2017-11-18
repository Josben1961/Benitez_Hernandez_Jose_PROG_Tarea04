package cadenas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import utilidades.Entrada;

public class Ejercicio2 {

	public static void main(String[] args) {
		String matricula = "";
		String numMatricula = "";
		String letraMatricula = "";
		// Cuatro n�meros, espacio y tres letras may�sculas (excluyendo vocales)
		Pattern patron = Pattern.compile("([0-9]{4})+ ([BCDFGHJKLMNPQRSTVWXYZ]{3})");
		Matcher emparejador;
		do {
			System.out.println("Introduce la Matr�cula : ");
			matricula = Entrada.cadena();
			emparejador = patron.matcher(matricula);
			// Avisamos de que la matr�cula introducida es erronea
			if (!emparejador.matches()) {
				System.out.println("Matr�culs erronea");
			}
		} while (!emparejador.matches());

		numMatricula = matricula.substring(0, 4);
		letraMatricula = matricula.substring(4);

		System.out.println("La matricula es: " + matricula);
		System.out.println("El n�mero de Matr�cula es: " + emparejador.group(1));
		System.out.println("La letra de la Matr�cula es: " + emparejador.group(2));

	}

}
