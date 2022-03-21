package edu.umb.cs680.hw01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class PrimeGeneratorTest {

	@Test
	public void generatePrime1to10() throws Exception {
		PrimeGenerator newprime = new PrimeGenerator(1, 10);
		newprime.generatePrimes();
		Long[] expectedNum = { 2L, 3L, 5L, 7L,};
		assertArrayEquals(expectedNum, newprime.getPrimes().toArray());

	}

	@Test
	public void primeGenerator10To1() throws Exception {
		try {
			var newprime = new PrimeGenerator(10, 1);

		} catch (RuntimeException ex) {
			assertEquals("Wrong input values: from=10 to=1", ex.getMessage());
		}

	}

	@Test
	public void primeGenerator_negetiveTo1() throws Exception {
		try {
			PrimeGenerator newprime = new PrimeGenerator(-10, 1);

		} catch (RuntimeException ex) {
			assertEquals("Wrong input values: from=-10 to=1", ex.getMessage());
		}

	}

	@Test
	public void primeGenerator_negetiveTonegetive() throws Exception {
		try {
			PrimeGenerator newprime = new PrimeGenerator(-10, -1);

		} catch (RuntimeException ex) {
			assertEquals("Wrong input values: from=-10 to=-1", ex.getMessage());
		}

	}

	@Test
	public void primeGenerator_0To0() throws Exception {
		try {
			PrimeGenerator newprime = new PrimeGenerator(0, 0);

		} catch (RuntimeException ex) {
			assertEquals("Wrong input values: from=0 to=0", ex.getMessage());
		}

	}

}