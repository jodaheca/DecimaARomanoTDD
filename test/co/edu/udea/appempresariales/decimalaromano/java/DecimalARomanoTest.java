package co.edu.udea.appempresariales.decimalaromano.java;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DecimalARomanoTest {

	DecimalARomano convertidor;
	String convertido[];
	private final String  ONETONINE ="--I-II-III-IV-V-VI-VII-VIII-IX";
	private final String ONETONINETYNINE = "--I-II-III-IV-V-VI-VII-VIII-IX-X-XI-"
			+ "XII-XIII-XIV-XV-XVI-XVII-XVIII-XIX-XX-XXI-XXII-XXIII-XXIV-XXV-"
			+ "XXVI-XXVII-XXVIII-XXIX-XXX-XXXI-XXXII-XXXIII-XXXIV-XXXV-XXXVI-"
			+ "XXXVII-XXXVIII-XXXIX-XL-XLI-XLII-XLIII-XLIV-XLV-XLVI-XLVII-"
			+ "XLVIII-XLIX-L-LI-LII-LIII-LIV-LV-LVI-LVII-LVIII-LIX-LX-LXI-LXII-"
			+ "LXIII-LXIV-LXV-LXVI-LXVII-LXVIII-LXIX-LXX-LXXI-LXXII-LXXIII-"
			+ "LXXIV-LXXV-LXXVI-LXXVII-LXXVIII-LXXIX-LXXX-LXXXI-LXXXII-LXXXIII-"
			+ "LXXXIV-LXXXV-LXXXVI-LXXXVII-LXXXVIII-LXXXIX-XC-XCI-XCII-XCIII-"
			+ "XCIV-XCV-XCVI-XCVII-XCVIII-XCIX" ;
	
	/**
	 * Prueba unitaria encargada de verificar que el metodo puedo convertir el numero 1 
	 * a Romano
	 */
	@Test
	public void converOne() {
		convertidor = new DecimalARomano();
		convertido = convertidor.convertirDecimalARomano();
		assertEquals("I", convertido[1]);
	}
	
	/**
	 * Prueba unitaria encargada de verificar que el metodo puedo convertir el numero 5 
	 * a Romano
	 */
	@Test
	public void converFive() {
		convertidor = new DecimalARomano();
		convertido = convertidor.convertirDecimalARomano();
		assertEquals("V", convertido[5]);
	}
	
	/**
	 * Prueba unitaria encargada de verificar que el metodo puedo convertir los numeros 
	 * del 1 al 10 decimales a romanos
	 */
	@Test
	public void converOneToNine() {
		convertidor = new DecimalARomano();
		convertido = convertidor.convertirDecimalARomano();
		String oneToNineRomanos = String.join("-", convertido);
		oneToNineRomanos = oneToNineRomanos.substring(0,30);
		assertEquals(ONETONINE, oneToNineRomanos);
	}
	
	/**
	 * Prueba unitaria encargada de verificar que el metodo puedo convertir los numeros 
	 * del 1 al 99 decimales a romanos
	 */
	@Test
	public void converOneToNinetyNine() {
		convertidor = new DecimalARomano();
		convertido = convertidor.convertirDecimalARomano();
		String oneToNinetyNineRomanos = String.join("-", convertido);
		assertEquals(ONETONINETYNINE, oneToNinetyNineRomanos);
	}

}
