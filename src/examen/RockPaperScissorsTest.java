package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RockPaperScissorsTest {
	RockPaperScissors r1 = new RockPaperScissors();

	@Test
	void test() {
		String resultadoEsperado = r1.checkGame("Rock", "Rock") ;
		String resultadoObtenido = ("It's a tie!");
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	void test1() {
		String resultadoEsperado = r1.checkGame("Paper", "Rock") ;
		String resultadoObtenido = ("It's a tie!");
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	void test2() {
		String resultadoEsperado = r1.checkGame("Scissors", "Rock") ;
		String resultadoObtenido = ("It's a tie!");
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	void tes3t() {
		String resultadoEsperado = r1.checkGame("paper", "Scissors") ;
		String resultadoObtenido = ("It's a tie!");
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

}
