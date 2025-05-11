public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public String bunyi() {
        return "cuit";
    }

    @Override
    public String gerak() {
        return "terbang";
    }
}
