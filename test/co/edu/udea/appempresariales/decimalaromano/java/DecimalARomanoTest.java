package co.edu.udea.appempresariales.decimalaromano.java;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DecimalARomanoTest {

	@Test
	public void converOne() {
		DecimalARomano covertidor = new DecimalARomano();
		String convertido[] = convertidor.convertirDecimalARomano();
		assertEquals("I", convertido[1]);
	}

}
