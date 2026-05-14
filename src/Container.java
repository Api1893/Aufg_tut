/*
    Vertrag für Medals Klassen
 */

public interface Container<ME> {
    int size();
    int add(ME element);
    int index(ME element);

}
