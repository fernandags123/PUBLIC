/* Nama File    : MataKuliah.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Fernanda Galih Saputra
 * Tanggal      : 23 Februari 2025
 */


public class MataKuliah {
    private String kode;
    private String nama;
    private int sks;

    // Konstruktor dengan parameter
    public MataKuliah(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    // Getter (Selektor)
    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    // Setter (Mutator)
    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSks(int sks) {  // Tipe data diubah dari String ke int
        this.sks = sks;
    }

    // Method untuk menampilkan informasi mata kuliah
    public void printMatKul() {
        System.out.println("Kode Mata Kuliah: " + kode);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("Jumlah SKS: " + sks);
    }
}
