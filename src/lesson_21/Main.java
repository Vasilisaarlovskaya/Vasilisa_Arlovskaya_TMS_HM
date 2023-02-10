package lesson_21;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/*
Создать программу для чтения номеров контрактов из файла.
Неповторяющиеся номера контрактов следует сохранить в структуру данных ключ-значение,
где ключ - это номер документа, а значение - это объекта класса Document со всей контекстной
информацией (номер документа, дата создания и другая информация).
Структуру данных ключ-значение вывести на экран.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        FileReader file = new FileReader("C:\\Users\\ADMIN\\IdeaProjects\\Vasilisa\\src\\NumberDoc");
        Scanner scan = new Scanner(file);
        HashSet<String> numberDocument = new HashSet<>();
        Date dateToDay = new Date();

        while (scan.hasNextLine()) {
            numberDocument.add(scan.nextLine());

        }
        file.close();

        HashMap<String, Document> informationDocument = new HashMap<>();
        for (String i : numberDocument) {
            Document doc = new Document(i);
            informationDocument.put(i, doc);
        }

        for (Map.Entry <String, Document> item : informationDocument.entrySet()){
            System.out.println("Номер документа: " + item.getKey() + "\n" +
                    "Информация по документу: " + "\n" + item.getValue().getNumber() + " (номер)"
                    + "\n" + item.getValue().date.format(dateToDay) + " (дата создания)" + "\n" );
        }
    }
}
