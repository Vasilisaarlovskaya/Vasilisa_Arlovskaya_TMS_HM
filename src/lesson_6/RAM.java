package lesson_6;

public class RAM {

        String name;
        double volume;

    @Override
    public String toString() {
        return "{" +
                "Название ='" + name + '\'' +
                ", Объём =" + volume +
                '}';
    }

    public RAM (String n, double v) {
            name = n;
            volume = v;

        }
}
