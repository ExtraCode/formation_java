package jUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import repository.CalculatorRepository;

class CalculatorRepositoryTest {
	
	private CalculatorRepository calculatorRepository;

	@BeforeEach
	public void setUp() {
		calculatorRepository = new CalculatorRepository();
	}
	
	@Test
	public void testAdd() {
		assertEquals(33, calculatorRepository.add(30, 3));
	}
	
	@Test
	public void testDivide() {
		assertEquals(2, calculatorRepository.divide(6, 3));
	}
	
	@Test
	public void testDivisionByZero() {
		assertThrows(IllegalArgumentException.class, () -> calculatorRepository.divide(6, 0));
	}
}
