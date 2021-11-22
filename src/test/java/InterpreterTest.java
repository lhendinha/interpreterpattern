import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InterpreterTest {
    InterpreterClient ic = null;

    @BeforeEach
    void setUp() {
        ic = new InterpreterClient(new InterpreterEngine());
    }

    @Test
    void testAdd() {
        System.out.println("Running: testAdd");

        assertEquals(ic.interpret("ADD 12 and 13"), 25);
    }

    @Test
    void testSubtract() {
        System.out.println("Running: testSubtract");

        assertEquals(ic.interpret("SUBTRACT 76 from 621"), 545);
    }
}
