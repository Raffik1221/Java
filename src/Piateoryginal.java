import java.util.*;
public class Piateoryginal {
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();

        // Dodawanie elementów
        set.add(3);
        set.add(333);
        set.add(1);
        set.add(2);

        System.out.println(set);
        for (int number : set) {
            System.out.println(number);
        }

        SortedSet<Ksiazka> ksiazki = new TreeSet<>();

        Autor autor1 = new Autor("Jan", "Kowalski");
        Autor autor2 = new Autor("Adam", "Nowak");

        Ksiazka ksiazka1 = new Ksiazka("Książka A", autor1);
        Ksiazka ksiazka2 = new Ksiazka("Książka B", autor2);
        Ksiazka ksiazka3 = new Ksiazka("Książka C", autor1);

        ksiazki.add(ksiazka1);
        ksiazki.add(ksiazka2);
        ksiazki.add(ksiazka3);
        ksiazki.add(new Ksiazka("Książka Z" , autor1));
        ksiazki.add(new Ksiazka("Książka AA" , autor1));
        ksiazki.add(new Ksiazka("Książka AA" , autor2));

        for (Ksiazka ksiazka : ksiazki) {
            System.out.println(ksiazka);
        }
    }
}
