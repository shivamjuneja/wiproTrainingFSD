package exp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorTest {
	Calculator calcy;

	@BeforeEach
	public void setup() {
		System.out.println("inside setup");
		calcy = new Calculator();
	}

	@AfterEach
	public void clean() {
		System.out.println("inside clean");
		calcy = null;
	}

	/**
	 * scenario : Adding two positive numbers inputs: 3 ,5 expectation: 8
	 */
	@Test
	void testAdd_1() {
		System.out.println("inside testAdd_1");
		int input1 = 3, input2 = 5;
		int expected = 8;
		int result = calcy.add(input1, input2);
		assertEquals(expected, result);
	}

	/**
	 * scenario : Adding two positive numbers inputs: -2 ,-7 expectation: -9
	 */
	@Test
	void testAdd_2() {
		System.out.println("inside testAdd_2");
		int input1 = -2, input2 = -7;
		int expected = -9;
		int result = calcy.add(input1, input2);
		assertEquals(expected, result);
	}

	/**
	 * scenario : number is even
	 *  input :{8, 120,1680} 
	 * expectation: true
	 */
	@ParameterizedTest
	@ValueSource(ints = { 8, 120, 1680 })
	public void testIsEven_1(int num) {
		System.out.println("inside testIsEven_1 number=" + num);
		boolean result = calcy.isEven(num);
		assertTrue(result);
	}

	/**
	 * scenario : number is odd 
	 * input :7 
	 * expectation: false
	 */
	@ParameterizedTest
	@ValueSource(ints = { 11, 121, 1681 })
	public void testIsEven_2(int num) {
		System.out.println("inside testIsEven_2 number=" + num);
		boolean result = calcy.isEven(num);
		assertFalse(result);
	}

}
