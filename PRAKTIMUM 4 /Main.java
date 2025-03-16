/* Nama File    : Main.java
* Deskripsi    : Implementasikan kelas BangunDatar, Persegi, dan Lingkaran ke dalam program Java dengan
mengimplementasikan hubungan pewarisan,
* Pembuat      : Fernanda Galih Saputra
* Tanggal      : 13 Maret 2025
*/

public class Main {
    public static void main(String[] args) {
        // Membuat objek Persegi
        Persegi persegi1 = new Persegi(5, "Merah", "Hitam");
        Persegi persegi2 = new Persegi(10, "Biru", "Putih");

        // Menampilkan informasi Persegi
        System.out.println("=== Informasi Persegi 1 ===");
        persegi1.printInfo();
        System.out.println();

        System.out.println("=== Informasi Persegi 2 ===");
        persegi2.printInfo();
        System.out.println();

        // Membuat objek Lingkaran
        Lingkaran lingkaran1 = new Lingkaran(7, "Hijau", "Kuning");
        Lingkaran lingkaran2 = new Lingkaran(14, "Ungu", "Coklat");

        // Menampilkan informasi Lingkaran
        System.out.println("=== Informasi Lingkaran 1 ===");
        lingkaran1.printInfo();
        System.out.println();

        System.out.println("=== Informasi Lingkaran 2 ===");
        lingkaran2.printInfo();
    }
}
