package cl.praxis.calculadoraDesafio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OperacionesTest {

	Operaciones operaciones = new Operaciones();
	
	Logger logger = Logger.getLogger("testing-unitario-desarrollo");
	
	@Test
	@DisplayName("SumarTest")
	public void sumarTest() {
		logger.info("Testing unitario operacion Sumar");
		int a= 5;
		int b= 4;
		int result = operaciones.sumar(a, b);
		
		assertEquals(9, result);	
		
	}
	
	@Test
	@DisplayName("RestarTest")
	public void restarTest() {
		logger.info("Testing unitario operacion Restar");
		int a= 5;
		int b= 4;
		int result = operaciones.restar(a, b);
		assertEquals(1, result);
	}
	
	@Test
	@DisplayName("MultiplicarTest")
	public void multiplicarTest() {
		logger.info("Testing unitario operacion multiplicar");
		int a= 5;
		int b= 4;
		
		int result = operaciones.multiplicar(a, b);
		assertEquals(20, result);
	}
	
	@Test
	@DisplayName("DividirTest")
	public void dividirTest() {
		logger.info("Testing unitario operacion dividir");
		int a= 5;
		int b= 4;
		
		double result = operaciones.dividir(a, b);
		assertEquals((a/b), result);
	}
	

}
