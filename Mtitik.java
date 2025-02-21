/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Fernanda Galih Saputra
 * Tanggal      : 20 Februari 2025
 */
public class Mtitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); // Membuat objek titik T1 (0,0)
        T1.setAbsis(3); // Mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); // Mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); // Mencetak koordinat T1 ke layar
        T1.geser(3,4); // Menggeser T1 sejauh (3,4)
        T1.printTitik(); // Menampilkan koordinat T1 setelah digeser

        // Membuat salinan T1 ke T2
        Titik T2 = T1;
        T2.printTitik(); // Menampilkan koordinat T2
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik(); // Menampilkan koordinat T2 setelah T1 diubah
        
    

        System.out.println("Jumlah objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah objek Titik = " + T2.getCounterTitik());
    }
}
