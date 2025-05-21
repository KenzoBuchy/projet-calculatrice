import java.util.Arrays;

public class Tableau {

    public int[] sort(int[] tab, int[] res) {
        if (tab.length == 0) {
            return res;
        }

        int minIndex = 0;
        int minValue = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < minValue) {
                minValue = tab[i];
                minIndex = i;
            }
        }

        res = addElement(res, minValue);

        tab = removeElement(tab, minIndex);

        return sort(tab, res);
    }

    public int[] addElement(int[] a, int e) {
        a = Arrays.copyOf(a, a.length + 1);
        a[a.length - 1] = e;
        return a;
    }

    public int[] removeElement(int[] arr, int index) {
        int[] result = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                result[j++] = arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] tab = {5, 8, 10, 9, 44, 0, -3};
        int[] tabVide = {};
        Tableau tableau = new Tableau();

        int[] tabSort = tableau.sort(tab, tabVide);

        System.out.println("Résultat du tri : " + Arrays.toString(tabSort));
    }

}
