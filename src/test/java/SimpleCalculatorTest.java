import by.it.academy.java.enterprise.SimpleCalculator;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest {
    private SimpleCalculator calculator = new SimpleCalculator();

    @Test
    public void testSubtractInt() {
        int actualResult = calculator.subtractInt(5,2);
        int expectedResult = 3;
        assertEquals(expectedResult, actualResult);
    }

}
