import java.util.Scanner;

public class Calculatrice {


    public double addition(double a, double b) {
        return a + b;
    }

    public double soustraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculatrice calc = new Calculatrice();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une opération (ex : 4 + 4, 5*6, 10 / 2) : ");
        String input = scanner.nextLine().replaceAll("\\s+", ""); // enlève les espaces

        double a, b;
        char operator = ' ';
        double resultat = 0;

        for (char c : input.toCharArray()) {
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                operator = c;
                break;
            }
        }

        if (operator == ' ') {
            System.out.println("Opérateur non reconnu !");
            return;
        }

        String[] parts = input.split("\\" + operator);
        if (parts.length != 2) {
            System.out.println("Format invalide !");
            return;
        }

            a = Double.parseDouble(parts[0]);
            b = Double.parseDouble(parts[1]);

            switch (operator) {
                case '+':
                    resultat = calc.addition(a, b);
                    break;
                case '-':
                    resultat = calc.soustraction(a, b);
                    break;
                case '*':
                    resultat = calc.multiplication(a, b);
                    break;
                case '/':
                    resultat = calc.division(a, b);
                    break;
            }

            System.out.println("Résultat : " + resultat);
            scanner.close();
    }
}
