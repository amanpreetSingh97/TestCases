import static org.junit.Assert.*;
import org.junit.Test;

public class OperatorsTest {
	Operators op = new Operators();
	@Test
	public void testAdd() {
		assertEquals(5,op.add(2, 3));
	}

	@Test
	public void testMultiply() {
		assertEquals(6,op.multiply(2, 3));
	}

	@Test
	public void testSubtract() {
		assertEquals(-1,op.subtract(2, 3));
	}

	@Test
	public void testDivide() {
		assertEquals("infinity",op.divide(2, 0));
	}

}
