public class Main {
    public static  void main(String [] args) {

        CreditCard firstcart = new CreditCard ("836400ART2864",0);
        CreditCard secondcart = new CreditCard("85703897YTU36",13);
        CreditCard thirdcart = new CreditCard ("3866827873YRI", 99);
        firstcart.plus(216);
        secondcart.plus(1);
        thirdcart.minus(9);
        firstcart.inf();
        System.out.println();
        secondcart.inf();
        System.out.println();
        thirdcart.inf();

    System.out.println();
    Computer computer1 = new Computer(1056,"Keybord");
    computer1.information();
    System.out.println();
    Computer computer2 = new Computer (375, "Poppy", new RAM("jg", 8.9), new HDD("flii", 8.9,true));
    computer2.information2();

    }

}