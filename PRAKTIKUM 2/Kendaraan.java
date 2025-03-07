/* Nama File    : Kendaraan.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Fernanda Galih Saputra
 * Tanggal      : 23 Februari 2025
 */


public class Kendaraan {
    private String noPlat;
    private String jenis; // Contoh: "Mobil" atau "Motor"

    // Konstruktor tanpa parameter
    public Kendaraan() {
        this.noPlat = "";
        this.jenis = "";
    }

    // Konstruktor dengan parameter
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    // Getter (Selektor)
    public String getNoPlat() {
        return noPlat;
    }

    public String getJenis() {
        return jenis;
    }

    // Setter (Mutator)
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    // Method untuk menampilkan informasi kendaraan
    public void printKendaraan() {
        System.out.println("Nomor Plat: " + noPlat);
        System.out.println("Jenis Kendaraan: " + jenis);
    }
}
