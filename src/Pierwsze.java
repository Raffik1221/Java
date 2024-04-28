import java.util.*;

public class Pierwsze {
    public static void main(String[] args) {
        List<Integer> listaLiczb = new ArrayList<>();
        for (int i = 1; i <= 1000000; i++) {
            listaLiczb.add(i);
        }

        Set<Integer> zbiorLiczb = new HashSet<>(listaLiczb);
        //  lista liczb od 1 do 1 000 000 w zmiennej "listaLiczb"

        // Sumowanie elementów z listy
        long sumaListy = 0;
        for (int liczba : listaLiczb) {
            sumaListy += liczba;
        }

        // Sumowanie elementów ze zbioru
        long sumaZbioru = 0;
        for (int liczba : zbiorLiczb) {
            sumaZbioru += liczba;
        }

        // Pomiar czasu
        long start = System.nanoTime();
        long end = System.nanoTime();

        // Wyświetlenie wyników
        System.out.println("Suma elementów z listy: " + sumaListy);
        System.out.println("Suma elementów ze zbioru: " + sumaZbioru);
        System.out.println("Czas sumowania: " + (end - start) + " nanosekund"); //wynik czasu sumowania
    }
}
