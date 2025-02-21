/* Nama File    : MGaris.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Fernanda Galih Saputra
 * Tanggal      : 20 Februari 2025
 */

 public class MGaris {
    Titik titikAwal, titikAkhir;
    static int counterGaris = 0; // Menambahkan counter untuk menghitung jumlah objek MGaris

    // Konstruktor untuk membuat garis dengan dua titik
    MGaris(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++; // Setiap objek baru dibuat, counterGaris bertambah
    }

    // Menghitung panjang garis
    double hitungPanjang() {
        return Math.sqrt(Math.pow(titikAkhir.getAbsis() - titikAwal.getAbsis(), 2) +
                         Math.pow(titikAkhir.getOrdinat() - titikAwal.getOrdinat(), 2));                        
    }

    // Menghitung gradien
    double hitungGradien() {
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) /
               (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    // Mengecek apakah dua garis sejajar
    boolean sejajar(MGaris garisLain) {
        return this.hitungGradien() == garisLain.hitungGradien();
    }

    // Mengecek apakah dua garis tegak lurus
    boolean tegakLurus(MGaris garisLain) {
        return this.hitungGradien() * garisLain.hitungGradien() == -1;
    }

    // Menampilkan persamaan garis dalam bentuk y = mx + c
    void tampilkanPersamaan() {
        double m = hitungGradien();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        System.out.println("Persamaan garis: y = " + m + "x + " + c);
    }

    // Metode untuk mendapatkan jumlah objek MGaris yang sudah dibuat
    static int getCounterGaris() {
        return counterGaris;
    }

    // Menambahkan metode untuk menghitung titik tengah
    Titik hitungTitikTengah() {
        double xTengah = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double yTengah = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(xTengah, yTengah); // Mengembalikan objek Titik dengan koordinat titik tengah
    }

    // Menampilkan titik awal
    void tampilkanTitikAwal() {
        System.out.println("Titik Awal: (" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + ")");
    }

    // Menampilkan titik akhir
    void tampilkanTitikAkhir() {
        System.out.println("Titik Akhir: (" + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");
    }

    public static void main(String[] args) {
        // Membuat objek Titik
        Titik T1 = new Titik(0, 0); // Titik (0,0)
        Titik T2 = new Titik(4, 4); // Titik (4,4)

        // Membuat objek MGaris
        MGaris garis1 = new MGaris(T1, T2); // Membuat objek garis pertama

        // Menampilkan panjang garis
        System.out.println("Panjang garis: " + garis1.hitungPanjang());

        // Menampilkan gradien garis
        System.out.println("Gradien garis: " + garis1.hitungGradien());

        // Menampilkan persamaan garis
        garis1.tampilkanPersamaan();

        // Menampilkan titik tengah garis
        Titik titikTengah = garis1.hitungTitikTengah();
        System.out.println("Titik Tengah: (" + titikTengah.getAbsis() + ", " + titikTengah.getOrdinat() + ")");

        // Menampilkan titik awal dan titik akhir
        garis1.tampilkanTitikAwal();
        garis1.tampilkanTitikAkhir();

        // Membuat garis lain
        Titik T3 = new Titik(2, 2);
        Titik T4 = new Titik(6, 6);
        MGaris garis2 = new MGaris(T3, T4); // Membuat objek garis kedua

        // Mengecek apakah garis1 dan garis2 sejajar
        System.out.println("Garis 1 dan Garis 2 sejajar: " + garis1.sejajar(garis2));

        // Mengecek apakah garis1 dan garis2 tegak lurus
        System.out.println("Garis 1 dan Garis 2 tegak lurus: " + garis1.tegakLurus(garis2));

        // Menampilkan jumlah objek MGaris yang telah dibuat
        System.out.println("Jumlah objek MGaris yang telah dibuat: " + MGaris.getCounterGaris());
    }
}
