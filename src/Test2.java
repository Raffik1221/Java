import java.util.*;
public class Test2 { public static void main(String[] args) { List<Integer> list = new ArrayList<>();

    /* Dodawanie elementów
    list.add(3);
    list.add(333);
    list.add(1);
    list.add(2);

    Collections.sort(list, Collections.reverseOrder());
    System.out.println(list);
    for (int number : list) {
        System.out.println(number);
    }*/

    List<Ksiazka> ksiazki = new ArrayList<>(); //użycie list zamiast set

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

    //Collections.sort(ksiazki, Collections.reverseOrder());
    Collections.sort(ksiazki);
    for (Ksiazka ksiazka : ksiazki) {
        System.out.println(ksiazka);
    }
    System.out.println();
    System.out.println("Odwrotnie:");
    System.out.println();
        Collections.reverse(ksiazki);
    for (Ksiazka ksiazka : ksiazki) {
        System.out.println(ksiazka);
    }

}
}