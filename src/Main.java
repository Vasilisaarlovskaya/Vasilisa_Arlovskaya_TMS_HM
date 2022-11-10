import java.util.Arrays;

public class Main {
    public static  void main(String [] args) {
        Cat barsik = new Cat("barsik", "wit", 3, 4);
        Cat murzik = new Cat( "murzik", "Wit");
        Cat mraz = new Cat ("mraz", "Wit",1,  Cat.eat());
        System.out.println(barsik.name);

        barsik.age = 2;
        System.out.println(barsik.age);


        /* barsik.voice(); */
        barsik. weight += Cat.eat();
        System.out.println("Барсик весит = " + barsik.weight);
        Cat.method(barsik, murzik, mraz);

        murzik.age = 3;
        System.out.println(murzik.toString("GAV"));

        mraz.balls = true;
        mraz.castrasia (mraz.castrasia(mraz.balls));

    }
}