public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public String bunyi() {
        return "meong";
    }

    @Override
    public String gerak() {
        return "melata";
    }
}
