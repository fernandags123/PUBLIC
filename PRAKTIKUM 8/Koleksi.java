import java.util.ArrayList;

public class Koleksi<T> {
    private int nbElmt;
    private ArrayList<T> wadah;

    public Koleksi() {
        wadah = new ArrayList<>();
        nbElmt = 0;
    }

    public void add(T elemen) {
        wadah.add(elemen);
        nbElmt++;
    }

    public void showAll() {
        for (int i = 0; i < nbElmt; i++) {
            T elemen = wadah.get(i);
            if (elemen instanceof Anabul) {
                Anabul a = (Anabul) elemen;
                System.out.println("Nama: " + a.getNama() +
                                   ", Bunyi: " + a.bunyi() +
                                   ", Gerak: " + a.gerak());
            } else {
                System.out.println(elemen);
            }
        }
    }
}
