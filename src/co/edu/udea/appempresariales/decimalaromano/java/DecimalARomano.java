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
		convertidos = new String[6];
		convertidos[1] = "I";
		convertidos[5] = "V";
		return convertidos;
	}

}
