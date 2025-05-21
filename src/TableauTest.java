import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableauTest {

    @Test
    void sort() {
        Tableau tableau = new Tableau();
        int[] tab = {4, 5, -2, 10, 0};
        int[] expected = {-2, 0, 4, 5, 10};
        int[] result = tableau.sort(tab, new int[0]);

        assertArrayEquals(expected, result);
    }

    @Test
    void addElement() {
        Tableau tableau = new Tableau();
        int[] tab = {4, 5, -2, 10, 0};
        int[] expected = {4, 5, -2, 10, 0, 44};
        int[] result = tableau.addElement(tab, 44);

        assertArrayEquals(expected, result);
    }

    @Test
    void removeElement() {
        Tableau tableau = new Tableau();
        int[] tab = {4, 5, -2, 10, 0};
        int[] expected = {4, 5, 10, 0};
        int[] result = tableau.removeElement(tab, 2);

        assertArrayEquals(expected, result);
    }
}