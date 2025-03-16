/* Nama File    : BangunDatar.java
* Deskripsi    : Implementasikan kelas BangunDatar, Persegi, dan Lingkaran ke dalam program Java dengan
mengimplementasikan hubungan pewarisan,
* Pembuat      : Fernanda Galih Saputra
* Tanggal      : 13 Maret 2025
*/

public class BangunDatar {
   protected int jmlSisi;
   protected String warna;
   protected String border;
   protected static int counterBangunDatar = 0;

   public BangunDatar() {
    counterBangunDatar++;
   }

   public BangunDatar(int jmlSisi, String warna, String border) {
    this.jmlSisi = jmlSisi;
    this.warna = warna;
    this.border = border;
    counterBangunDatar++;
   }

   public static void printCounterBangunDatar() {
    System.out.println("Jumlah objek Bangun Datar: " + counterBangunDatar);
   }

   public int getJmlSisi() {
       return jmlSisi;
   }

   public void setjmlSisi(int jmlSisi) {
       this.jmlSisi = jmlSisi;
   }

   public String getWarna() {
       return warna;
   }

   public void setWarna(String warna) {
       this.warna = warna;
   }

   public String getBorder() {
       return border;
   }

   public void setBorder(String border) {
       this.border = border;
   }

   public void printInfo() {
       System.out.println("Jumlah sisi: " + jmlSisi);
       System.out.println("Warna: " + warna);
       System.out.println("Border : " + border);
   }
}
