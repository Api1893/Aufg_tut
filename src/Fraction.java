public class Fraction {
    private int numerator, denominator;

    public Fraction(int numerator, int denominator) {
        int gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;   // Zähler
        this.denominator = denominator / gcd;   // Nenner
        // Aufgabe 2
        if(this.denominator < 0) {
            this.numerator = this.numerator * -1;
            this.denominator = this.denominator * -1;
        } // Weil im Konstruktor -> mit this. arbeitet
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    private int checkNegative(int a, int b) {
        if(a < 0 || b < 0) {
            return a;
        }
        return b;
    }

    private int gcd(int a, int b) {
        // Aufgabe 1: Es muss größer als -1 sein
        if(a < 0) {
            a = a * -1;
        }
        if(b < 0) {
            b = b * -1;
        }

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
