package lesson7_2;

public class Worker  implements Printable {

    String name = "Рабочий";

    @Override
    public void print() {
        System.out.println(name);
    }
}
