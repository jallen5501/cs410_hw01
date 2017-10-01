package edu.umb.cs.cs410.hw01;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void multiply3by4() {
		Calculator cut = new Calculator();
		float expected = 12;
		float actual = cut.multiply(3, 4);
		assertThat(actual, is(expected));
	}

	@Test
	public void divide3by2() {
		Calculator cut = new Calculator();
		float expected = 1.5f;
		float actual = cut.divide(3, 2);
		assertThat(actual, is(expected));
	}

	@Test
	public void add11to67() {
		Calculator cut = new Calculator();
		float expected = 78;
		float actual = cut.add(11, 67);
		assertThat(actual, is(expected));
	}

	@Test
	public void subtract100by35() {
		Calculator cut = new Calculator();
		float expected = 65;
		float actual = cut.subtract(100, 35);
		assertThat(actual, is(expected));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void divide5by0() {
		Calculator cut = new Calculator();
		float expected = 12;
		float actual = cut.divide(5, 0);
	}

}