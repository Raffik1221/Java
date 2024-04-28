import java.util.*;
public class TreeSetExample {
    public static void main(String[] args) {
       /* SortedSet<Integer> set = new TreeSet<>();

        // Dodawanie elementów
        set.add(3);
        set.add(333);
        set.add(1);
        set.add(2);

        System.out.println(set);
        for (int number : set) {
            System.out.println(number);
        }*/

        SortedSet<Ksiazka> ksiazki = new TreeSet<>();

        Autor autor1 = new Autor("Jan", "Kowalski");
        Autor autor2 = new Autor("Adam", "Nowak");

        Ksiazka ksiazka1 = new Ksiazka("Książka A", autor1);
        Ksiazka ksiazka2 = new Ksiazka("Książka B", autor2);
        Ksiazka ksiazka3 = new Ksiazka("Książka C", autor1);

        /*List<String> test = new ArrayList<>();
        test.add("i");
        test.add("z");
        test.add("a");
        test.add("c");
        System.out.println(test);
        Collections.sort(test);
        System.out.println(test);
        Collections.reverse(test);
        System.out.println(test);*/

        ksiazki.add(ksiazka1);
        ksiazki.add(ksiazka2);
        ksiazki.add(ksiazka3);
        ksiazki.add(new Ksiazka("Książka Z" , autor1));
        ksiazki.add(new Ksiazka("Książka AA" , autor1));
        ksiazki.add(new Ksiazka("Książka AA" , autor2));

        System.out.println();
        System.out.println("ksiazki");
        for (Ksiazka ksiazka : ksiazki) {
            System.out.println(ksiazka);
        }
        /*System.out.println();
        System.out.println("ksiazkaTreeSet");
        TreeSet<Ksiazka> ksiazkaTreeSet = new TreeSet<>(ksiazki);
        for (Ksiazka ksiazka : ksiazkaTreeSet) {
            System.out.println(ksiazka);
        }
        System.out.println();
        System.out.println("ksiazkaTreeSetZmienionaNazwa2");
        TreeSet<Ksiazka> ksiazkaTreeSetZmienionaNazwa2 = new TreeSet<>(Comparator.comparing(k -> k.tytul));
        ksiazkaTreeSetZmienionaNazwa2.add(ksiazka1);
        ksiazkaTreeSetZmienionaNazwa2.add(ksiazka2);
        ksiazkaTreeSetZmienionaNazwa2.add(ksiazka3);
        ksiazkaTreeSetZmienionaNazwa2.add(new Ksiazka("Książka Z" , autor1));
        ksiazkaTreeSetZmienionaNazwa2.add(new Ksiazka("Książka AA" , autor1));
        ksiazkaTreeSetZmienionaNazwa2.add(new Ksiazka("Książka AA" , autor2));
        for (Ksiazka ksiazka : ksiazkaTreeSetZmienionaNazwa2) {
            System.out.println(ksiazka);
        }*/
    }
}


