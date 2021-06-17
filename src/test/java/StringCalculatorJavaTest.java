import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorJavaTest {

    @Test
    public void exampleTest() {
        assertEquals(new StringCalculatorJava().add("test input"), 9001);
    }
}