/* Nama File    : MKendaraan.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Fernanda Galih Saputra
 * Tanggal      : 23 Februari 2025
 */


public class MKendaraan {
    public static void main(String[] args) {
        // Membuat objek Kendaraan untuk Mobil
        Kendaraan mobil = new Kendaraan("B 1234 ABC", "Mobil");
        System.out.println("Informasi Kendaraan (Mobil):");
        mobil.printKendaraan();

        // Membuat objek Kendaraan untuk Motor
        Kendaraan motor = new Kendaraan("D 5678 XYZ", "Motor");
        System.out.println("\nInformasi Kendaraan (Motor):");
        motor.printKendaraan();

        // Mengubah nomor plat kendaraan
        mobil.setNoPlat("B 9999 DEF");
        motor.setNoPlat("D 8888 UVW");

        // Menampilkan kembali setelah perubahan
        System.out.println("\nSetelah Perubahan:");
        mobil.printKendaraan();
        motor.printKendaraan();
    }
}
