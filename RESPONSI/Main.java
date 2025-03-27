/* 
Nama        : Fernanda Galih Saputra
Nim         ; 24060121140176
TanggAL     : 27 MARET 2025
*/

public class Main {
    public static void main(String[] args) {
        RuangKelas rk = new RuangKelas("E101", 10, 8, 4, 40, 35, 5);
        LaboratoriumKomputer lk = new LaboratoriumKomputer("LAB E201", 12, 10, 4, 30, "Lab Komputer E", 150000, 25);
        LaboratoriumNonKomputer lnkBio = new LaboratoriumNonKomputer("LAB K201", 12, 10, 4, 25, "Lab Biologi", 120000, new String[]{"Biologi Dasar", "Genetika"});
        LaboratoriumNonKomputer lnkFisika = new LaboratoriumNonKomputer("LAB G202", 12, 10, 4, 25, "Lab Fisika", 130000, new String[]{"Fisika Dasar", "Mekanika"});
        LaboratoriumNonKomputer lnkKimia = new LaboratoriumNonKomputer("LAB A303", 12, 10, 4, 25, "Lab Kimia", 140000, new String[]{"Kimia Organik", "Kimia Anorganik"});
        RuangDosen dosen = new RuangDosen("D01", 6, 5, 3, 1, "Dr. Xavier", 1, 2, 5000);
        RuangDepartemen rd = new RuangDepartemen("AVGRS 30012", 15, 12, 4, 10, "Departemen Informatika", "Prof. Bruce Banner", 5, 10, 3, 7000);

        System.out.println("--- Informasi Ruangan ---");
        rk.tampilkanInfo();
        System.out.println();
        lk.tampilkanInfo();
        System.out.println();
        lnkBio.tampilkanInfo();
        System.out.println();
        lnkFisika.tampilkanInfo();
        System.out.println();
        lnkKimia.tampilkanInfo();
        System.out.println();
        dosen.tampilkanInfo();
        System.out.println();
        rd.tampilkanInfo();
    }
}
