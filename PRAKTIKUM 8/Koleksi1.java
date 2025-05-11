import java.util.ArrayList;

public class Koleksi<T> {
    private int nbElmt;
    private ArrayList<T> wadah;

    public Koleksi() {
        wadah = new ArrayList<>();
        nbElmt = 0;

    }

    public T getIsi(int index) {
        return wadah.get(index);

    }

    public void setIsi(int index, T elemen) {
        if (index < nbElmt) {
            wadah.set(index, elemen);
        } else {
            System.out.println("Index di luar batas koleksi.");
        }
    }

    public int getSize() {
        return nbElmt;

    }

    public void setSize(int sizeBaru) {
        nbElmt = sizeBaru;

    }

    public void add(T elemen) {
        wadah.add(elemen);
        nbElmt++;

    }

    public void delete(int index) {
        if (index < nbElmt) {
            wadah.remove(index);
            nbElmt--;
        } else {
            System.out.println("Index tidak valid untuk dihapus");
        }
    }

    public void showAll() {
        System.out.println("Isi Koleksi");
        for (int i = 0; i < nbElmt; i++) {
            System.out.println("[" + i + "] " + wadah.get(i));
        }
    }
}
