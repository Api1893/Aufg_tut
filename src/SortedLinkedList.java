
public class SortedLinkedList  {
    private int size = 0;
    private Node head;

    private class Node {
        int number;
        Node next;

        Node(int number) {
            this.number = number;
        }
    }

    public boolean add(int number){
        Node newHead = new Node(number);
        if (head == null || number <= head.number) {
            newHead.next = head;
            head = newHead;
        }
        else {
            Node current = head;
            while (current.next != null && current.next.number < number) {
                current = current.next;
            }
            newHead.next = current.next;
            current.next = newHead;
        }
        size++;
        return true;
    }

    public boolean contains(int number) {
        for (Node node = head; node != null; node = node.next) {
            if (node.number == number) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size; // Gibt den aktuellen Wert des Attributs zurück
    }

    public void dump() {
        // Wir starten am Kopf der Liste
        Node current = head;

        // Wir laufen so lange weiter, bis wir hinter dem letzten Element (null) sind
        while (current != null) {
            // Die Zahl des aktuellen Knotens ausgeben
            System.out.println(current.number);

            // Zum nächsten Knoten springen
            current = current.next;
        }
    }
}
