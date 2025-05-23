/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Fernanda Galih Saputra
 * Tanggal      : 23 Februari 2025
 */


public class Dosen {
    private String nip;
    private String nama;
    private String prodi;


    //Konstruktor tanpa parameter
    public Dosen() {
        this.nip = "";
        this.nama = "";
        this.prodi= "";
    }


    //Konstruktor dengan parameter 
    public Dosen(String nip, String nama, String Prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }


    //Selektor (getter)
    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }


    //Mutator (setter)
    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }


    //Method untuk menampilkan informasi dosen
    public void printDosen() {
        System.out.println("NIP: " + nip);
        System.out.println("Nama Dosen:" + nama);;
        System.out.println("Program Studi: " + prodi)
    }
}
