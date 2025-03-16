/* Nama File    : Persegi.java
* Deskripsi    : Implementasikan kelas BangunDatar, Persegi, dan Lingkaran ke dalam program Java dengan
mengimplementasikan hubungan pewarisan,
* Pembuat      : Fernanda Galih Saputra
* Tanggal      : 13 Maret 2025
*/

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi, String warna, String border) {
        this.jmlSisi = 4;
        this.warna = warna;
        this.border = border;
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal() {
        return Math.sqrt(2) * sisi;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
        System.out.println("Diagonal: " + getDiagonal()); // Panggil method getDiagonal()
    }
    
}
