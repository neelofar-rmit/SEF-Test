package tutorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumbersTest {
Numbers numbers = new Numbers();
@Test
void sumNumberTest() {
	assertEquals(5, numbers.subtractNumbers(2,  3));
}

@Test
void divideNumberByZero() {
	assertThrows(ArithmeticException.class, () -> numbers.divideNumbers(5,  0));
}

}
