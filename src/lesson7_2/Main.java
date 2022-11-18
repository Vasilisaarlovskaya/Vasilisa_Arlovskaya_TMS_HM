package lesson7_2;
/*
Создать классы "Директор", "Рабочий", "Бухгалтер".
Реализовать интерфейс с методом, который печатает название должности и
имплементировать этот метод в созданные классы.
 */

import java.util.Arrays;

public class Main {
    public static void main(String [] args) {
        Director d = new Director();
        d.print();
        Worker w = new Worker();
        w.print();
        Accounter a = new Accounter();
        a.print();
    }
}
