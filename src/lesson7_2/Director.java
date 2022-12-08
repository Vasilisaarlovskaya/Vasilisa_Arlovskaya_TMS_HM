package lesson7_2;

public class Director implements Printable {
    String name = "Директор";
    @Override
    public void print() {
        System.out.println(name);
    }
}
