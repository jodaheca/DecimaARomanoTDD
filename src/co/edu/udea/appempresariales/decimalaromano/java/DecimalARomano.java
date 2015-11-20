package co.edu.udea.appempresariales.decimalaromano.java;

public class DecimalARomano {

	private String convertidos[];
	private final String unidades[] = { "", "I", "II", "III", "IV", "V", "VI",
			"VII", "VIII", "IX" };
	public final String decenas[] = { "", "X", "XX", "XXX", "XL", "L", "LX",
			"LXX", "LXXX", "XC" };
	char[] numToCaracter; // variable para guardar le número en un arreglo de
							// caracteres
	private String unidad = "", decena = "", centena = "", mil = "";
	String numeroFinal; // Variable para guardar el numero convertido en Romano
	private int limite = 99;

	public DecimalARomano() {

	}

	/**
	 * Metodo encargado de realizar la conversion de los numeros decimales a
	 * romano
	 * 
	 * @return String[] Con los numeros convertidos a romano
	 */
	public String[] convertirDecimalARomano() {

		convertidos = new String[100];
		convertidos[0] = "-";
		for (int i = 1; i <= limite; i++) {
			String valor = Integer.toString(i); // String con el número
			int longitud = valor.length(); // Número de caracteres

			switch (longitud) {
			case 1:
				convertidos[i] = unidades[i];
				System.out.println(i + " = " + convertidos[i]);
				break;

			case 2:

				numToCaracter = valor.toCharArray(); // convertimos el número a caracteres
				decena = Character.toString(numToCaracter[0]);
				unidad = Character.toString(numToCaracter[1]);
				decena = decenas[Integer.parseInt(decena)];
				unidad = unidades[Integer.parseInt(unidad)];
				numeroFinal = decena + unidad;
				convertidos[i] = numeroFinal;
				break;

			default:
			}
		}
		return convertidos;
	}
}
