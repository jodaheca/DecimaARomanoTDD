package co.edu.udea.appempresariales.decimalaromano.java;

public class DecimalARomano {
	
	String convertidos[] ;
	
	public DecimalARomano(){
		
	}
	
	/**
	 * 		
	 * @return String[] Con los numeros convertidos a romano
	 */
	public String[] convertirDecimalARomano(){
		
		convertidos = new String[10];
		String unidades[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		int limite = 9;
		for (int i = 1; i <= limite; i++) {
			convertidos[i] = unidades[i];
		}
		return convertidos;
	}

}
