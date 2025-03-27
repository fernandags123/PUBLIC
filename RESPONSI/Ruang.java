/* 
Nama        : Fernanda Galih Saputra
Nim         ; 24060121140176
TanggAL     : 27 MARET 2025
*/

abstract class Ruang {
    protected String kode;
    protected double panjang, lebar, tinggi;
    protected int kapasitas;
    
    public Ruang(String kode, double panjang, double lebar, double tinggi, int kapasitas) {
        this.kode = kode;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.kapasitas = kapasitas;
    }
    
    public double hitungBiayaKebersihan(double tarif) {
        return panjang * lebar * tarif;
    }
    
    public abstract void tampilkanInfo();
}
