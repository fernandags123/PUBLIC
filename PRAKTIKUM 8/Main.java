import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Koleksi<Anabul> KoleksiAnabul = new Koleksi<>();
        Random rand = new Random();

        String[] namaHewan = {
            "Supri", "Joko", "Tingky Winky", "Dipsy", "Laa-Laa",
            "Asep", "Yanto", "Gilga", "Sahid", "Ciko"
        };

        for (int i = 0; i < 10; i++) {
            int jenis = rand.nextInt(3); // 0: Kucing, 1: Anjing, 2: Burung
            String nama = namaHewan[i];

            if (jenis == 0) {
                KoleksiAnabul.add(new Kucing(nama));
            } else if (jenis == 1) {
                KoleksiAnabul.add(new Anjing(nama));
            } else {
                KoleksiAnabul.add(new Burung(nama));
            }
        }

        System.out.println("== Koleksi Anabul ==");
        KoleksiAnabul.showAll();
    }
}
