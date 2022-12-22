/*
Создать частотный словарь.
Сколько раз в введённой строке встречается каждая буква
 */
package lesson13_2;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder word = new StringBuilder(scanner.nextLine());
        ArrayList<Character> wordList = new ArrayList<>();
        HashSet<Character> wordSet = new HashSet<>();
        HashMap <Character, Integer> wordMap = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            wordList.add(word.charAt(i));
            wordSet.add(word.charAt(i));
            }
        for (char i : wordSet) {
            int f = 0;
            for (char g : wordList) {
                if (i==g) {
                    wordMap.put(i,f+=1);
                }
            }
        }
        System.out.println(wordMap);
        for (Map.Entry <Character, Integer> item : wordMap.entrySet()){
            System.out.println(item.getKey() + " встречается: " + item.getValue() + " раз(а)");
        }

}}
