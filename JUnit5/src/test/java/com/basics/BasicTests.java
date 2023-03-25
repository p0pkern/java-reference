package com.basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.company.Calculator;

/**
 * <h1> Basic Test Fixtures <h1>
 * 
 * This template includes the basic test fixtures for JUnit5 and simple
 * operations with them.
 * 
 * @author p0pkern
 *
 */

class BasicTests {
	private final Calculator calculator = new Calculator();
	
	/**
	 * A simple test fixture with a basic assertion.
	 * @param None
	 * @return Nothing
	 */
	@Test
	void addition() {
		assertEquals(2, calculator.add(1, 1));
	}

}
