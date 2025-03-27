/* 
Nama        : Fernanda Galih Saputra
Nim         ; 24060121140176
TanggAL     : 27 MARET 2025
*/

public class Laboratorium extends Ruang{
    protected String namaLab;
    protected double hargaSewa;
    private static final double TARIF_BIAYA_KEBERSIHAN = 5000;

    public Laboratorium(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, double hargaSewa) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaLab = namaLab;
        this.hargaSewa = hargaSewa;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("Laboratorium: " + namaLab);
        System.out.println("Kode: " + kode);
        System.out.println("Dimensi: " + panjang + "x" + lebar + "x" + tinggi);
        System.out.println("Kapasitas: " + kapasitas);
        System.out.println("Harga Sewa: " + hargaSewa);
        System.out.println("Biaya Kebersihan: " + hitungBiayaKebersihan(TARIF_BIAYA_KEBERSIHAN));
    }
}
