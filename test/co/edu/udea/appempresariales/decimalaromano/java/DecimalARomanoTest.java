package co.edu.udea.appempresariales.decimalaromano.java;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DecimalARomanoTest {

	DecimalARomano convertidor;
	String convertido[];
	
	@Test
	/**
	 * Prueba unitaria encargada de verificar que el metodo puedo convertir el numero 1 
	 * a Romano
	 */
	public void converOne() {
		convertidor = new DecimalARomano();
		convertido = convertidor.convertirDecimalARomano();
		assertEquals("I", convertido[1]);
	}

}
