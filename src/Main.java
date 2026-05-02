class Main {
    public static void main(String[] args) {

        /*
        Medal goldMedal = new Medal("Donald", "Gold", 2026);
        Medal goldMedalCapital = new Medal("Donald", "GOLD", 2026);
        Medal silverMedal = new Medal("Mickey", "Silver",2026);
         */

        Medals myMedals = new Medals(5);
        Medal searchMedal = new Medal("Pa", "b", 2021);

        Medal m1 = new Medal("Pa", "b", 2021);
        Medal m2 = new Medal("A", "b", 2020);

        myMedals.add(m1);
        myMedals.add(m2);

        boolean found = myMedals.contains(searchMedal);
        System.out.println(found);

    }
}