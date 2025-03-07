/* Nama File    : Enkapsulasi.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Fernanda Galih Saputra
 * Tanggal      : 23 Februari 2025
 */



 public class Titik {
    /***************ATRIBUT***************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /***************METHOD***************/
    // Konstruktor untuk membuat dengan nilai absis dan ordinat tertentu
    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }
    //konstruktor untuk membuat titik (0,0)
    public Titik() {
        this(0,0);
    }


    private void printCounterTitik() {
        System.out.println(this.counterTitik);

    }
    //mengembalikan nilai counterTitik
    public static int getCounterTitik() {
        return counterTitik;
    }

    // Mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    // Mengeset absis titik dengan nilai baru x
    public void setAbsis(double x) {
        absis = x;
    }

    // Mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y) {
        ordinat = y;
    }

    // Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y; // Perbaikan: ordinat yang harus ditambah, bukan absis
    }

    // Mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}
