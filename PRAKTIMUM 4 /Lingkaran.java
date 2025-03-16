/* Nama File    : Lingkaran.java
* Deskripsi    : Implementasikan kelas BangunDatar, Persegi, dan Lingkaran ke dalam program Java dengan
mengimplementasikan hubungan pewarisan,
* Pembuat      : Fernanda Galih Saputra
* Tanggal      : 13 Maret 2025
*/
public class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran() {
        this.jariJari = 0;
    }

    public Lingkaran(double diameter, String warna, String border) {
        this.jariJari = diameter / 2;
        setWarna(warna);
        setBorder(border);
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getLuas() {
        return Math.PI * jariJari * jariJari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jariJari;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jariJari);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}
