package Clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Tests {

	CuentasMatematicas cuenta1;
	
	@BeforeEach
	void CrearConstructor() {
		
		cuenta1 = new CuentasMatematicas(2,2);
		
	}
	
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
	
	@Test
	void test3() {
		
		assertEquals(4, cuenta1.multiplicacionNumerosEnteros());
		
	}
	
}
