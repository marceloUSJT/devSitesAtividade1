package testes;
import Figuras.Quadrado;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QuadradoTeste {
	Quadrado quadrado;
	
	@BeforeEach
	void instanciaQuadrado() {
		quadrado = new Quadrado(10, 10);
	}

	@SuppressWarnings("deprecation")
	@Test
	void calculaAreaTest() {
		assertEquals(100, quadrado.calculaArea(), "Não obteve o resultado esperado");
	}
	
	@Test
	void calculaDiagonalTest() {
		assertEquals(14.14213562373, quadrado.calculaDiagonal(), "Não obteve o resultado esperado");
	}
	
	@Test 
	void calculaPerimetroTest() {
		assertEquals(40, quadrado.calculaPerimetro(), "Não obteve o resultado esperado");
	}
}
