class Main {
    public static void main(String[] args) {

        // Array wird erzeugt mit 5 Plätzen
        /*
        Medals myMedals = new Medals(5);
        Medal searchMedal = new Medal("Pa", "b", 2021);

        Medal m1 = new Medal("Pa", "b", 2021);
        Medal m2 = new Medal("A", "b", 2020);
        Medal m3 = new Medal("c", "b", 2022);
        Medal m4 = new Medal("d", "b", 2023);
        Medal m5 = new Medal("f", "b", 2024);
        Medal m6 = new Medal("Aw", "b", 2025);

        myMedals.add(m1);
        myMedals.add(m2);
        myMedals.add(m3);

        boolean found = myMedals.contains(searchMedal);
        System.out.println(found);

         */

        // _______________Aufgabe 1 b)_____________________________________

        Medal goldMedal = new Medal("Donald", "Gold", 2026);
        Medal silverMedal = new Medal("Mickey", "Silver", 2026);
        Medal bronzeMedal = new Medal("Goofy", "Bronze", 1972);
        Medal moreGold = new Medal("Donald", "Bronze", 1972);

        Medal medals[] = {goldMedal, silverMedal, bronzeMedal, moreGold};
        Medals olympics2026 = new Medals(4);

        for (int i = 0; i < medals.length; i++) {
            System.out.println(olympics2026.add(medals[i]));
        }
        olympics2026.dump();
        System.out.println(olympics2026.size());

        for (int i = 0; i < medals.length; i++) {
            System.out.println(olympics2026.contains(medals[i]));
        }
        System.out.println(olympics2026.size());

        for (int i = 0; i < medals.length; i++) {
            System.out.println(olympics2026.remove(medals[i]));
        }
        System.out.println(olympics2026.size());

        // _________________Aufgabe_2_a)_________________________

    }
}