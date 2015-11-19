package co.edu.udea.appempresariales.decimalaromano.java;

public class DecimalARomano {
	
	private String convertidos[] ;
	private final String unidades[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
	private int limite = 9;
	public DecimalARomano(){
		
	}
	
	/**
	 * Metodo encargado de realizar la conversion de los numeros decimales a 
	 * romano		
	 * @return String[] Con los numeros convertidos a romano
	 */
	public String[] convertirDecimalARomano(){
		
		convertidos = new String[10];
		for (int i = 1; i <= limite; i++) {
			convertidos[i] = unidades[i];
		}
		return convertidos;
	}

}
