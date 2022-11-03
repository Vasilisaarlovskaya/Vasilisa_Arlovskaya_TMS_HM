import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число, пожалуйста");
        int number = scanner.nextInt();
        if (0 < number && number < 15) {
            i = 1;
            System.out.println("Группа " + i);
        } else
        if (number >= 15 & number < 30) {
            i = 2;
            System.out.println("Группа " + i);
        } else
        if (number >= 30) {
            i = 3;
            System.out.println("Группа " + i);
        } else
            System.out.println("НЕ В ДИАПОЗОНЕ, проверьте число");

        if (i == 1) {
            System.out.println("Дорогая, хочешь убить всех детей? (Бендер)");
        } if (i == 2) {
            System.out.println("Пиво рулит, не ты!");
            System.out.println("Хочешь я немного поглумлюсь над трупом? (Бендер)");
        } if (i == 3) {
            System.out.println("Смотреть порно и зарабатывать?! Что-то мне не верится.");
            System.out.println("Я не так знаменит, чтобы давить людей безнаказанно. ");
            System.out.println("Не бейте меня!... я предам кого угодно. (Бендер)");
        }
    }
}