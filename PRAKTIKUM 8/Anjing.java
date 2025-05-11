public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public String bunyi() {
        return "guk-guk";
    }

    @Override
    public String gerak() {
        return "melata";
    }
}
