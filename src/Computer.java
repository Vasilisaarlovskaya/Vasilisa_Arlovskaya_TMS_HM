public class Computer {
    int price;
    String model;
    public RAM ram;
    public HDD hdd;

    public Computer (int price, String model) {
        this.price = price;
        this.model = model;
    }

    public Computer (int price, String model, RAM ram, HDD hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }
    public void information() {
        System.out.println("Параметры компьютера:");
        System.out.println("Стоимость: " + price);
        System.out.println("Модель: " + model);
    }
    public void information2() {
        System.out.println("Параметры компьютера:");
        System.out.println("Стоимость: " + price);
        System.out.println("Модель: " + model);
        System.out.println("RAM: " + ram); // Не выводит
        System.out.println("HDD: " + hdd); // Не выводит
    }
}
