package lesson_6;

public class HDD {

    String name;
    double volume;
    boolean type;

    public HDD(String name, double volume, boolean type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
        }
    @Override
    public String  toString() {
        String type = this.type ? "Внутренний" : "Внешний";

        return "{" +
                "Название ='" + name + '\'' +
                ", Объём =" + volume +
                ", Тип =" + type +
                '}';
    }
}
