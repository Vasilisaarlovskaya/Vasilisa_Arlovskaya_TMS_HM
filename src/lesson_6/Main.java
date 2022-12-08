package lesson_6;

public class Main {

    public static void main(String [] args) {
Computer computer1 = new Computer(1346, "Lenovo");
Computer computer2 = new Computer(5678, "Lenovo",
        new RAM("DDR",16),
        new HDD("Caviar",320,true));
        System.out.println(computer1);
        System.out.println(computer2);

        CreditCard cart1 = new CreditCard("308HAO798997", 0);
        CreditCard cart2 = new CreditCard("870276AIU978", 870);
        CreditCard cart3 = new CreditCard("903797OYA879", 7);
        cart1.plus(10029);
        cart2.plus(1);
        cart3.minus(7);
        System.out.println("Карта 1 " + cart1);
        System.out.println("Карта 2 " + cart2);
        System.out.println("Карта 3 " + cart3);
}
}
