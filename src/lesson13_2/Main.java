/*
Создать частотный словарь.
Сколько раз в введённой строке встречается каждая буква
 */
package lesson13_2;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap <Character, Integer> wordMap = new HashMap<>();

        String wordsline = scanner.nextLine();
        for (int i = 0; i< wordsline.length(); i ++) {
            char ch = wordsline.charAt(i);
            int fr = 1;
            if (!wordMap.containsKey(ch)) {
                wordMap.put(ch, fr);
            } else {
                int frr;
                frr = wordMap.get(ch) + 1;
                wordMap.put(ch, frr);
            }
        }
        System.out.println(wordMap);
    }
}
