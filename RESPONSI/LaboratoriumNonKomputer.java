/* 
Nama        : Fernanda Galih Saputra
Nim         ; 24060121140176
TanggAL     : 27 MARET 2025
*/

public class LaboratoriumNonKomputer extends Laboratorium {
    private String[] mataKuliah;

    public LaboratoriumNonKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, double hargaSewa, String[] mataKuliah) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLab, hargaSewa);
        this.mataKuliah = mataKuliah;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Mata Kuliah yang Dihandle: " + String.join(", ", mataKuliah));
    }
}
