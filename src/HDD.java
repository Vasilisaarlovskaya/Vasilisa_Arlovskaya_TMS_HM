public class HDD {
    String name;
    double volume;
    boolean type;



    public HDD(String n, double v, boolean t) {
        name = n;
        volume = v;
        type = t;
    }

    @Override
    public String  toString() {
        String type = this.type ? "Внутренний" : "Внешний";
        return type;
    }
}

