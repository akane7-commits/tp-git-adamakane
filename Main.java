// Petite calculatrice en Java
public class Main {

    // Addition
    static int addition(int a, int b) {
        return a + b;
    }

    // Soustraction
    static int soustraction(int a, int b) {
        return a - b;
    }

    // Multiplication
    static int multiplication(int a, int b) {
        return a * b;
    }

    // Division
    static double division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division par zéro impossible.");
        }
        return a / b;
    }

    // Puissance
    static int puissance(int base, int exposant) {
        if (exposant < 0) {
            throw new IllegalArgumentException("Exposant invalide.");
        }

        int resultat = 1;

        for (int i = 0; i < exposant; i++) {
            resultat *= base;
        }

        return resultat;
    }

    // Modulo
    static int modulo(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Modulo par zéro impossible.");
        }

        return a % b;
    }

    public static void main(String[] args) {
        System.out.println("2 + 3 = " + addition(2, 3));
        System.out.println("8 - 3 = " + soustraction(8, 3));
        System.out.println("4 * 3 = " + multiplication(4, 3));
        System.out.println("8 / 2 = " + division(8, 2));
        System.out.println("2 puissance 3 = " + puissance(2, 3));
        System.out.println("10 modulo 3 = " + modulo(10, 3));
    }
}
// Cette methode permet d'additionner deux nombres