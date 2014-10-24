package Mylla;

import static org.junit.Assert.*;
import org.junit.*;

public class CalculatorTest {

	@Test
	public void testGreet() {
		assertEquals("Halló heimur", Mylla.main());
	}

}
