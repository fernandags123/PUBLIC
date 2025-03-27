/* 
Nama        : Fernanda Galih Saputra
Nim         ; 24060121140176
TanggAL     : 27 MARET 2025
*/

class LaboratoriumKomputer extends Laboratorium {
    private int jumlahKomputer;

    public LaboratoriumKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, double hargaSewa, int jumlahKomputer) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLab, hargaSewa);
        this.jumlahKomputer = jumlahKomputer;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Komputer: " + jumlahKomputer);
    }
}
