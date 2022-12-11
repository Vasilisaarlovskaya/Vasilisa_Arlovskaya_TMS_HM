/*
Дана произвольная строка.
Вывести на консоль новую строку, в которой продублирована каждая буква из начальной строки.
Например, "Hello" -> "HHeelllloo"
 */
package lesson10_2;

public class Main {

    public static void main(String[] args) {
        StringBuilder outrage = new StringBuilder("MyBad");
        StringBuilder doubleWorld= new StringBuilder();
        for (int i = 0; i < outrage.length(); i++) {
            doubleWorld.append(outrage.charAt(i));
            doubleWorld.append(outrage.charAt(i));
        }
        System.out.println(doubleWorld);
    }
}
