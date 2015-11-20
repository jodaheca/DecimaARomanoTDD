package co.edu.udea.appempresariales.decimalaromano.java;

public class DecimalARomano {

	private String convertidos[];
	private final String unidades[] = { "", "I", "II", "III", "IV", "V", "VI",
			"VII", "VIII", "IX" };
	public final String decenas[] = { "", "X", "XX", "XXX", "XL", "L", "LX",
			"LXX", "LXXX", "XC" };
	public final String centenas[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	char[] numToCaracter; // variable para guardar le n�mero en un arreglo de
							// caracteres
	private String unidad = "", decena = "", centena = "", mil = "";
	String numeroFinal; // Variable para guardar el numero convertido en Romano
	private int limite = 999;

	public DecimalARomano() {

	}

	/**
	 * Metodo encargado de realizar la conversion de los numeros decimales a
	 * romano
	 * 
	 * @return String[] Con los numeros convertidos a romano
	 */
	public String[] convertirDecimalARomano() {

		convertidos = new String[1000];
		convertidos[0] = "-";
		for (int i = 1; i <= limite; i++) {
			String valor = Integer.toString(i); // String con el n�mero
			int longitud = valor.length(); // N�mero de caracteres

			switch (longitud) {
			case 1:
				convertidos[i] = unidades[i];
				System.out.println(i + " = " + convertidos[i]);
				break;

			case 2:

				numToCaracter = valor.toCharArray(); // convierto el n�mero a caracteres
				decena = Character.toString(numToCaracter[0]);
				unidad = Character.toString(numToCaracter[1]);
				decena = decenas[Integer.parseInt(decena)];
				unidad = unidades[Integer.parseInt(unidad)];
				numeroFinal = decena + unidad;
				convertidos[i] = numeroFinal;
				break;
				
			 case 3:
                 numToCaracter = valor.toCharArray(); // convierto el n�mero a caracteres
                 centena = Character.toString(numToCaracter[0]);
                 decena = Character.toString(numToCaracter[1]);
                 unidad = Character.toString(numToCaracter[2]);
                 centena = centenas[Integer.parseInt(centena)];
                 decena = decenas[Integer.parseInt(decena)];
                 unidad = unidades[Integer.parseInt(unidad)];
                 numeroFinal = centena + decena + unidad;
                 convertidos[i] = numeroFinal;
                 break;	

			default:
			}
		}
		return convertidos;
	}
}
