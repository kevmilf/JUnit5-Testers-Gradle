package calculator;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void addition() {
        assertEquals(2, calculator.add(1, 1));
    }

    @Test
    void otherAddition() {
        assertTrue(2 == calculator.add(1, 1));
    }

    @Test
    void fullTest() {
        assertAll("Should all addition and subtractions work",
            () -> assertEquals(2, calculator.add(1, 1)),
            () -> assertEquals(2, calculator.subtract(1, 0)),
            () -> assertEquals(5, calculator.add(3, 2))
        );
    }

    @Test
    void lol() {
        List<String> names = List.of("Bilbo", "Frodo", "Gandalf");
        assertThat(names)
                .hasSize(3)
                .contains("Frodo")
                .contains("Gandalf")
                .doesNotContain("Sauron");
    }

}
