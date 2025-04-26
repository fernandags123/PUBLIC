
public class MManusia {
    public static void main(String[] args) {
        PNS p1 = new PNS("Jarwo", "2006-04-01", "Jl. YosSudarto", 15000000, "198302032006041112");
        Pengusaha pe1 = new Pengusaha("Sopo", "2000-01-01", "Jl. Aang", 55000000, "000-556-773-212-000-5");
        Petani pt1 = new Petani("Denis Beban", "1977-01-09", "Jl. SH Terate Tembalang", 5000000, "Maduin");
        PNS p2 = new PNS("Adit CarryMan", "2010-04-01", "Jl. P Nusa Tembalang", 10000000, "198004212010041113");

        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());

        System.out.println();

        System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());

        System.out.println();

        System.out.println("Masa Kerja p1 = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja());

        System.out.println();

        p1.cetakInfo();
        pe1.cetakInfo();
        pt1.cetakInfo();
        p2.cetakInfo();
    }
}
