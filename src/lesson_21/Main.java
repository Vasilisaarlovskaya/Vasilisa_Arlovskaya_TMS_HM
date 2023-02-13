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
        Set<String> numberDocument = new HashSet<>();
        HashMap<String, Document> informationDocument = new HashMap<>();
        Date dateToDay = new Date();
        String inf = "";
        String number;
        String typeDocument = "";


        while (scan.hasNextLine()) {
            number = scan.next();
            if (!numberDocument.contains(number)) {
                numberDocument.add(number);
            typeDocument = scan.next();
            inf = scan.next();
            Document doc = new Document(number, typeDocument, inf);
            informationDocument.put(number, doc);
            }
        }

        file.close();

        for (Map.Entry<String, Document> item : informationDocument.entrySet()) {
            System.out.println("Номер документа: " + item.getKey() + "\n" +
                    "Информация по документу: " + "\n" + "Номер: "+  item.getValue().getNumber() +
                            "\n" + "Тип документа: " + item.getValue().getTypeDocument()  +
                                "\n" + "Дата создания: "+ item.getValue().date.format(dateToDay)  +
                                     "\n" + "Безумно важная информация: " +  item.getValue().getInf() + "\n"
                    );
        }
    }
}
