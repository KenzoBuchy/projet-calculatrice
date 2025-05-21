import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatriceTest {

    @Test
    void addition() {
        Calculatrice calc = new Calculatrice();
        double result = calc.addition(3,5);
        assertEquals(8, result);

    }

    @Test
    void soustraction() {
        Calculatrice calc = new Calculatrice();
        double result = calc.soustraction(3,5);
        assertEquals(-2, result);
    }

    @Test
    void multiplication() {
        Calculatrice calc = new Calculatrice();
        double result = calc.multiplication(3,5);
        assertEquals(15, result);
    }

    @Test
    void division() {
        Calculatrice calc = new Calculatrice();
        double result = calc.division(10,5);
        assertEquals(2, result);
        assertThrows(ArithmeticException.class, () -> {
            calc.division(10, 0);
        });
    }
}

