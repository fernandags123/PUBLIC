/* 
Nama        : Fernanda Galih Saputra
Nim         ; 24060121140176
Nama File   : Responsi PBO E1
TanggAL     : 27 MARET 2025
*/

public class RuangDosen extends Ruang {
    private String namaDosen;
    private int jumlahMeja, jumlahKursi;
    private double tarifKebersihan;

    public RuangDosen(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaDosen, int jumlahMeja, int jumlahKursi, double tarifKebersihan) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaDosen = namaDosen;
        this.jumlahMeja = jumlahMeja;
        this.jumlahKursi = jumlahKursi;
        this.tarifKebersihan = tarifKebersihan;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("Ruang Dosen: " + namaDosen);
        System.out.println("Kode: " + kode);
        System.out.println("Dimensi: " + panjang + "x" + lebar + "x" + tinggi);
        System.out.println("Jumlah Meja: " + jumlahMeja);
        System.out.println("Jumlah Kursi: " + jumlahKursi);
        System.out.println("Biaya Kebersihan: " + hitungBiayaKebersihan(tarifKebersihan));
    }
}
