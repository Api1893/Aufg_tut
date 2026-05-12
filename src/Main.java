class Main {
    public static void main(String[] args) {

        System.out.println("_______________Aufgabe_1_________________");
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
        System.out.println("______________Aufgabe_2_a)_____________");
        SortedLinkedList numbers = new SortedLinkedList();
        System.out.println(silverMedal.equals(silber)); // Aufgabe 2 a)

        System.out.println("_____________Aufgabe_2_b)_&_c)_____________");
        System.out.println("Sortiert und umgestellt");

        System.out.println("______________Aufgabe_2_d)_____________");
        System.out.println("noch ncht fertig");

        System.out.println("______________Aufgabe_2_e)_____________");
        System.out.println("noch ncht angefangen!");
    }
}