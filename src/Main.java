class Main {
    public static void main(String[] args) {
        Fraction half = new Fraction (-12, -18);
        //Aufgabe 1
        System.out.println(half.getNumerator());
        System.out.println(half.getDenominator());

        Medal goldMedal = new Medal("Donald", "Gold", 2026);
        Medal goldMedalCapital = new Medal("Donald", "GOLD", 2026);
        Medal silverMedal = new Medal("Mickey", "Silver",2026);

        // Aufgabe  3

        System.out.println(goldMedal.isSame(goldMedalCapital));
        System.out.println(goldMedal.isSame(silverMedal));
        System.out.println(silverMedal.isSame(silverMedal));

        // Aufgabe 4
        Medal m1 = new Medal("A", "b", 2020);
        Medal m2 = new Medal("a", "b", 2020);
        System.out.println(m1.isLess(m2));

    }
}