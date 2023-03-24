package Clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tests {

	@Test
	void test1() {
		
		int resultadoEsperado=4;
		assertEquals(resultadoEsperado, CuentasMatematicas.sumaNumerosEnteros(2,2));
		
	}

	@Test
	void test2() {
		
		int resultadoEsperado=0;
		assertEquals(resultadoEsperado, CuentasMatematicas.restaNumerosEnteros(2, 2));
		
	}
	
}
