public class Main {
    public static void main(String[] args) {
        Anabul[] anabulPeliharaan = {
            new Kucing("Ciko"),
            new Anjing("Kenzo"),
            new Burung("Joni")
        };

        for (Anabul anabul : anabulPeliharaan) {
            anabul.gerak();
            anabul.bersuara();
            System.out.println();
        }
    }
}
