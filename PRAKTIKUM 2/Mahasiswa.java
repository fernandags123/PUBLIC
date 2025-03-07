/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Fernanda Galih Saputra
 * Tanggal      : 23 Februari 2025
 */


public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private MataKuliah[] listMatkul = new MataKuliah[50];
    private int jumlahMatkul = 0;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    //Konstruktor tanpa paramater
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.dosenWali = null;
        this.kendaraan = null;
    }

    //Konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.dosenWali = null;
        this.kendaraan = null;
    }


    //selektor(getter)
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public int getJumlahMatkul() {
        return jumlahMatkul;
    }


    //Mutator(setter)
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }


    //Method untuk menambahkan mata kuliah
    public void addMatkul(MataKuliah mk) {
        if (jumlahMatkul < 50) {
            listMatkul[jumlahMatkul] = mk;
            System.out.println("Mata Kuliah ditambahkan! " + mk.getNama() + " - " + mk.getSks() + " SKS");
            jumlahMatkul++;
        } else {
            System.out.println("Mata kuliah sudah mencapai batas maksimum!");
        }
    }
    

    //Method untuk menghitung jumlah SKS
    public int getJumlahSKS() {
        int totalSKS = 0;
        for (int i = 0; i < jumlahMatkul; i++) {
            if (listMatkul[i] != null) {
                System.out.println("MataKuliah: " + listMatkul[i].getNama() + ", SKS: " + listMatkul[i].getSks());
                totalSKS += listMatkul[i].getSks();
            } else {
                System.out.println("MataKuliah pada index " + i + " adalah null!");
            }
        }
        return totalSKS;
    }
    


    //Method untuk mencetak Informasi Mahasiswa
    public void printDetailMhs() {
        System.out.println("NIM:" + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Program Studi: " + prodi);
        System.out.println("Dosen Wali: " + (dosenWali != null ? dosenWali.getNama() : "Tidak Ada"));
        System.out.println("Kendaraan: " + (kendaraan != null ? kendaraan.getJenis() + " - " + kendaraan.getNoPlat() : "Tidak Ada"));
        System.out.println("Jumlah Mata Kuliah: " + jumlahMatkul);
        System.out.println("Total SKS: " + getJumlahSKS());
    }
}
