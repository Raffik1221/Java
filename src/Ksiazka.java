public class Ksiazka implements Comparable<Ksiazka> {
    String tytul;
    Autor autor;
    public Ksiazka(String tytul, Autor autor) {
        this.tytul = tytul;
        this.autor = autor;
    }
    @Override
    public String toString() {
        return autor +", "+tytul;
    }

    public int compareTo(Ksiazka innaKsiazka) {
        // Porównujemy książki na podstawie autorów, a jeśli autorzy są ci sami, to na podstawie tytułu.
        int porownanieAutorow = this.autor.compareTo(innaKsiazka.autor);
        if (porownanieAutorow == 0) {
            return this.tytul.compareTo(innaKsiazka.tytul);
        }
        return porownanieAutorow;
    }
}
