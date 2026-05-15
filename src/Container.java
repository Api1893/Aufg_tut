/*
    Vertrag für Medals Klassen
    Der Vertrag bestimmt, das Verhalten der Methoden

    ME für Medal Element
 */

public interface Container<ME> {
    int size();
    int add(ME element);
    int index(ME element);
    boolean contains(ME element);
    boolean remove(ME elements);
}
