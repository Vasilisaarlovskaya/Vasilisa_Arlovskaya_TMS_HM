import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int group =0;

        System.out.println("Введите число, пожалуйста");
        int number = scanner.nextInt();
        if (0 < number && number < 15) {
            System.out.println("Группа 1");
            group = 1;
        } else if (number >= 15 && number < 30) {
            System.out.println("Группа 2");
            group = 2;
        } else if (number >= 30) {
            System.out.println("Группа 3");
            group = 3;
        } else
            System.out.println("НЕ В ДИАПОЗОНЕ, проверьте число");

        for (int i = 0; i < group; i++) {
            System.out.println("Дорогая, хочешь убить всех детей? (Бендер)");
        }
    }
}