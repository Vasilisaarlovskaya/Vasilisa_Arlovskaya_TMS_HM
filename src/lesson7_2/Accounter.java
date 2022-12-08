package lesson7_2;

public class Accounter implements Printable {
    String name = "Бухгалтер";
    @Override
    public void print() {
        System.out.println(name);
    }
}
