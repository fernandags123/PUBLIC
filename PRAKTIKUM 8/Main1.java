public class Main {
    public static void main(String[] args) {
        Koleksi<Character> karakterKoleksi = new Koleksi<>();
        char[] isiAwal = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        for (char c : isiAwal) {
            karakterKoleksi.add(c);
        }

        System.out.println("Koleksi awal (10 karakter):");
        karakterKoleksi.showAll();

        karakterKoleksi.setIsi(0, 'Z');
        System.out.println("\nSetelah update index 0 ke 'Z':");
        karakterKoleksi.showAll();

        karakterKoleksi.delete(5);
        System.out.println("\nSetelah hapus index 5:");
        karakterKoleksi.showAll();

        karakterKoleksi.add('K');
        System.out.println("\nSetelah menambahkan 'K' agar tetap 10 elemen:");
        karakterKoleksi.showAll();

        System.out.println("\nUkuran koleksi saat ini: " + karakterKoleksi.getSize());
    }
}
