package lesson_6;

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
    @Override
    public String toString() {
        return "{" +
                "Стоимость: " + price +
                ", Модель: '" + model + '\'' +
                ", RAM " + ram +
                ", HDD " + hdd +
                '}';
    }

    }

