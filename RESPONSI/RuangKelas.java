/* 
Nama        : Fernanda Galih Saputra
Nim         ; 24060121140176
Nama File   : Responsi PBO E1
TanggAL     : 27 MARET 2025
*/

public class RuangKelas extends Ruang {
    private int jumlahKursiTersedia;
    private int jumlahKursiRusak;
    private static final double TARIF_BIAYA_KEBERSIHAN = 5000;

    public RuangKelas(String kode, double panjang, double lebar, double tinggi, int kapasitas, int jumlahKursiTersedia, int jumlahKursiRusak) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.jumlahKursiTersedia = jumlahKursiTersedia;
        this.jumlahKursiRusak = jumlahKursiRusak;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("Ruang Kelas: " + kode);
        System.out.println("Dimensi: " + panjang + "x" + lebar + "x" + tinggi);
        System.out.println("Kapasitas: " + kapasitas);
        System.out.println("Kursi Tersedia: " + jumlahKursiTersedia);
        System.out.println("Kursi Rusak: " + jumlahKursiRusak);
        System.out.println("Biaya Kebersihan: " + hitungBiayaKebersihan(TARIF_BIAYA_KEBERSIHAN));
    }
}
