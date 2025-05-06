package maven_oee;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SameMethodTest {

    @Test
    void test() {
        // Test if the method SameMethod() returns the correct string.
        String expected = "SameMethod";
        String actual = oee_class.SameMethod();
        
        // Assert that the actual value matches the expected value
        assertEquals(expected, actual);
    }
}
