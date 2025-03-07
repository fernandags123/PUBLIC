/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Fernanda Galih Saputra
 * Tanggal      : 20 Februari 2025
 */
 
 public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    // a. Konstruktor tanpa parameter (default: (0,0) ke (1,1))
    public Garis() {
        this.titikAwal = new Titik(0, 0);
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    // b. Konstruktor dengan parameter (menggunakan titik awal dan titik akhir)
    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // c. Getter (Selektor)
    public Titik getTitikAwal() { return titikAwal; }
    public Titik getTitikAkhir() { return titikAkhir; }
    public static int getCounterGaris() { return counterGaris; }

    // c. Setter (Mutator)
    public void setTitikAwal(Titik titikAwal) { this.titikAwal = titikAwal; }
    public void setTitikAkhir(Titik titikAkhir) { this.titikAkhir = titikAkhir; }

    // d. Menghitung panjang garis
    public double hitungPanjang() {
        return Math.sqrt(Math.pow(titikAkhir.getAbsis() - titikAwal.getAbsis(), 2) +
                         Math.pow(titikAkhir.getOrdinat() - titikAwal.getOrdinat(), 2));
    }

    // e. Menghitung gradien garis
    public double hitungGradien() {
        if (titikAkhir.getAbsis() - titikAwal.getAbsis() == 0) {
            throw new ArithmeticException("Garis tegak lurus sumbu X, gradien tidak terdefinisi!");
        }
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) /
               (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    // f. Menghitung titik tengah garis
    public Titik hitungTitikTengah() {
        double xTengah = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double yTengah = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(xTengah, yTengah);
    }

    // g. Mengecek apakah dua garis sejajar
    public boolean sejajar(Garis garisLain) {
        return this.hitungGradien() == garisLain.hitungGradien();
    }

    // h. Mengecek apakah dua garis tegak lurus
    public boolean tegakLurus(Garis garisLain) {
        return this.hitungGradien() * garisLain.hitungGradien() == -1;
    }

    // i. Menampilkan titik awal dan titik akhir
    public void tampilkanTitik() {
        System.out.print("Titik Awal: ");
        titikAwal.printTitik();
        System.out.print("Titik Akhir: ");
        titikAkhir.printTitik();
    }

    // j. Menampilkan persamaan garis dalam bentuk y = mx + c
    public void tampilkanPersamaan() {
        double m = hitungGradien();
        double c = titikAwal.getOrdinat() - (m * titikAwal.getAbsis());
        System.out.println("Persamaan garis: y = " + m + "x + " + c);
    }
}

