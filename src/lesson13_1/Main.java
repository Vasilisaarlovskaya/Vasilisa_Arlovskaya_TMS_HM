/*
Программа должна получать имена файлов с номерами документов с
консоли: каждая новая строка - это путь к файлу и имя файла.
Для завершения ввода списка файлов следует ввести 0.
После получения списка документов программа должна обработать
каждый документ: вычитать из файла номера документов и
провалидировать их.
В конце работы создать один файл отчет с выходной информаций: номер
документа - комментарий(валиден или не валиден и по какой причине).
Пусть каждый файл содержит каждый номер документа с новой строки и
в строке никакой другой информации, только номер документа.
Валидный номер документа должен иметь длину 15 символов и
начинаться с последовательности docnum(далее любая
последовательность букв/цифр) или kontract(далее любая
последовательность букв/цифр).
Учесть, что номера документов могут повторяться в пределах одного
файла и так же разные документы могут содержать одни и те же номера
документов.
Если номера документов повторяются, то повторные номера документов
не проверять, не валидировать.
Немного технических деталей
1) Считать с консоли список документов: раз список - то это коллекции
типа List, никаких других условий нет - значит все имена файлов с
консоли сохраняем в структуру данных ArrayList.
2) Номера документов могут повторяться, но повторные документы
обрабатывать не надо и валидировать не надо,т.е. по сути дубликаты
нам не нужны - значит, надо считать номера документов из файлов и все
номера документов сохранять в коллекцию типа Set. Других условий нет,
значит можно использовать HashSet.
3) В конце должна быть структура номер документа - комментарий - т.е.
эта структура типа ключ-значений,значит это коллекция типа Map.
Других условий нет - значит, можно использовать HashMap. Создать
такую структуру и уже потом сделать цикл по этой структуре и записать
всю информацию из этой мапы в файл-отчет.
 */
package lesson13_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        String stop = "0";
        String nameFile = "1";
        ArrayList<String> nameFileList = new ArrayList<>();

        while (!nameFile.equals(stop)) {
            Scanner scanner = new Scanner(System.in);
            nameFile = scanner.next();
            nameFileList.add(nameFile);
        }
        HashSet <String> numberDocument = new HashSet<>();
        for (int i = 0; i < nameFileList.size()-1; i++) {
            Scanner scanner1 = new Scanner(new File(nameFileList.get(i)));
            while (scanner1.hasNextLine()) {
                numberDocument.add(scanner1.nextLine());
            }
        }
        String valid = "";
        HashMap <String, String> otchet = new HashMap<>();
        for (String i : numberDocument) {
            if (i.length() != 15 ) {
                valid = "Номер документа не валиден: длина не совпадает";
            } else {
                if (!i.startsWith("docnum") && !i.startsWith("kontract")) {
                    valid = "Номер документа не валиден: начинается не с docnum/kontract";
                } else {
                    valid = "Номер документа валиден";
                }
            }
            otchet.put(i, valid);
        }
        FileWriter lastStepOtchet = new FileWriter("otchet.txt");
        for (Map.Entry <String,String> item : otchet.entrySet()){
        lastStepOtchet.write(item.getKey() + " (комментарий: " + item.getValue() + ")\n");
    } lastStepOtchet.close();
    }}

