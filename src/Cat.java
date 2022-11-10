import java.util.Arrays;

public class Cat {

    String name;
    String poroda;
    int age;
    int weight;
    boolean balls;

    public Cat(String name, String poroda) {
        this.name = name;
        this.poroda = poroda;
    }

    public Cat(String name, String poroda, int age, int weight) {
        this.name = name;
        this.poroda = poroda;
        this.age = age;
        this.weight = weight;
        System.out.println("Кот создан!");


    }

    public Cat(String name, String poroda, int weight) {
        this.name = name;
        this.poroda = poroda;
        this.weight = weight;
    }

    public static void voice() {                   // void без разницы возврат в конце
        System.out.println("MEOW");
    }

    public static int eat() {
        int food = 2;
        voice();           // Можно без this
        System.out.println("HAVAT");
        return food;
    }

    public static void method(Cat... cats) {

        System.out.println(Arrays.toString(cats));
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", poroda='" + poroda + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public String toString(String word) {
        return word;

    }

    public boolean castrasia(boolean balls) {
        if (balls) {                            // true = условие
            balls = false;
        }
        return balls;
    }
}
