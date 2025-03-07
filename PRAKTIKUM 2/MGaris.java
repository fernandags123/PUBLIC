/* Nama File    : MGaris.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Fernanda Galih Saputra
 * Tanggal      : 20 Februari 2025
 */
public class MGaris {
    public static void main(String[] args) {
        // Membuat objek Titik
        Titik T1 = new Titik(-2, 0);
        Titik T2 = new Titik(0, 4);

        // Membuat objek Garis
        Garis garis = new Garis(T1, T2);

        // Menampilkan titik awal dan titik akhir
        garis.tampilkanTitik(); // Menggunakan 'garis' bukan 'garis1'

        // Menampilkan panjang garis
        System.out.println("Panjang Garis: " + garis.hitungPanjang());

        // Menampilkan gradien garis
        System.out.println("Gradien Garis: " + garis.hitungGradien());

        // Menampilkan titik tengah garis
        Titik titikTengah = garis.hitungTitikTengah();
        System.out.print("Titik Tengah: ");
        titikTengah.printTitik();

        // Menampilkan persamaan garis
        garis.tampilkanPersamaan();

        // Membuat garis lain untuk diuji apakah sejajar atau tegak lurus
        Garis garis2 = new Garis(new Titik(1, 2), new Titik(3, 6));
        System.out.println("Garis 1 dan Garis 2 sejajar? " + garis.sejajar(garis2));
        System.out.println("Garis 1 dan Garis 2 tegak lurus? " + garis.tegakLurus(garis2));

        // Menampilkan jumlah objek Garis yang telah dibuat
        System.out.println("Jumlah objek Garis yang telah dibuat: " + Garis.getCounterGaris());
    }
}
