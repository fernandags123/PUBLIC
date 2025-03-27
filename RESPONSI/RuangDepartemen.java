/* 
Nama        : Fernanda Galih Saputra
Nim         ; 24060121140176
TanggAL     : 27 MARET 2025
*/

public class RuangDepartemen extends Ruang{
    private int jumlahMeja, jumlahKursi, jumlahLemari;
    private String namaDepartemen, ketuaDepartemen;
    private double tarifKebersihan;
    
    public RuangDepartemen(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaDepartemen, String ketuaDepartemen, int jumlahMeja, int jumlahKursi, int jumlahLemari, double tarifKebersihan) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaDepartemen = namaDepartemen;
        this.ketuaDepartemen = ketuaDepartemen;
        this.jumlahMeja = jumlahMeja;
        this.jumlahKursi = jumlahKursi;
        this.jumlahLemari = jumlahLemari;
        this.tarifKebersihan = tarifKebersihan;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("Ruang Departemen: " + namaDepartemen);
        System.out.println("Ketua Departemen: " + ketuaDepartemen);
        System.out.println("Jumlah Meja: " + jumlahMeja + ", Kursi: " + jumlahKursi + ", Lemari: " + jumlahLemari);
        System.out.println("Biaya Kebersihan: " + hitungBiayaKebersihan(tarifKebersihan));
    }
}
