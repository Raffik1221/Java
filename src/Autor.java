public class Autor implements Comparable<Autor> {
    private String imie;
    private String nazwisko;
    public Autor(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    @Override
    public String toString() {
        return imie + " " + nazwisko;
    }

    public int compareTo(Autor innyAutor) {
        // Porównujemy autorów na podstawie ich nazwiska, a jeśli są równe, to na podstawie imienia.
        int porownanieNazwisk = this.nazwisko.compareTo(innyAutor.nazwisko);
        if (porownanieNazwisk == 0) {
            return this.imie.compareTo(innyAutor.imie);
        }
        return porownanieNazwisk;
    }
}
