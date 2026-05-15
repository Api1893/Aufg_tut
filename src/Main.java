class Main {
    public static void main(String[] args) {
        System.out.println("_______________Aufgabe_1_________________");
        System.out.println("Im SortedLinkedList und Medals");
        Medals myMedals = new Medals(5);
        Medal searchMedal = new Medal("Pa", "b", 2021);

        Medal goldMedal = new Medal("Donald", "Gold", 2026);
        Medal silverMedal = new Medal("Mickey", "Silver", 2026);
        Medal bronzeMedal = new Medal("Goofy", "Bronze", 1972);
        Medal moreGold = new Medal("Donald", "Bronze", 1972);
        Medal moneyGold = new Medal("Apisit", "Silver", 2000);
        Medal silber = new Medal("Mickey", "Silver", 2026);
        myMedals.add(goldMedal);
        myMedals.add(silverMedal);
        myMedals.add(bronzeMedal);
        myMedals.add(moneyGold);
        myMedals.toString();    // Aufgabe 1 Test

        Medal medals[] = {goldMedal, silverMedal, bronzeMedal, moreGold};
        Medals olympics2026 = new Medals(6);

        System.out.println();
        System.out.println("______________Aufgabe_2_a)_____________");
        SortedLinkedList numbers = new SortedLinkedList();
        System.out.println(silverMedal.equals(silber)); // Aufgabe 2 a)

        System.out.println("_____________Aufgabe_2_b)_&_c)_____________");
        System.out.println("Sortiert und umgestellt");
        System.out.println();

        // Aufruf 2 e)
        testMedalContainer(myMedals);

        // Aufgabe 3 a)
        System.out.println("______________Aufgabe_3_a)_____________");

    }

    private static void testMedalContainer(Container<Medal> medals) {
        Medal goldMedal = new Medal("Donald", "Gold", 2026);
        Medal silverMedal = new Medal("Mickey", "Silver", 2026);
        Medal bronzeMedal = new Medal("Goofy", "Bronze", 1972);
        Medal moreGold = new Medal("Donald", "Bronze", 1972);
        Medal olympics2026[] = {goldMedal, silverMedal, bronzeMedal, moreGold};
        System.out.println("_______________Aufgabe_2_e)_________________");
        for (int i = 0; i < olympics2026.length; i++) {
            System.out.println(medals.add(olympics2026[i]));
        }
        System.out.println(medals);
        System.out.println(medals.size());
        for (int i = 0; i < olympics2026.length; i++) {
            System.out.println(medals.contains(olympics2026[i]));
        }
        System.out.println(medals.size());
        for (int i = 0; i < olympics2026.length; i++) {
            System.out.println(medals.remove(olympics2026[i]));
        }
        System.out.println(medals.size());
        /*
            Bei der Testaufruf musste ich zuerst im Container,
            das contains und remove hinzufügen.
            Hinzu kommt das der Parameterübergabe mit ME geändert werden musste.
         */
    }
}