package co.edu.udea.appempresariales.decimalaromano.java;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DecimalARomanoTest {

	DecimalARomano convertidor;
	String convertido[];
	private final String  ONETONINE ="--I-II-III-IV-V-VI-VII-VIII-IX";
	
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
		String oneToTenRomanos = String.join("-", convertido);
		assertEquals(ONETONINE, oneToTenRomanos);
	}

}
