package lesson_20;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        String name = "";
        String surname = "";
        String gender = "";
        int age = 0;
        int count = 0;
        int male = 0;
        int female = 0;
        System.out.println("Введите путь к файлу");
        Scanner scan = new Scanner(System.in);
        String fname = scan.nextLine();
        ArrayList<Person> person = new ArrayList();

        try {
            FileReader file = new FileReader(fname);
            Scanner scanfile = new Scanner(file);

            while (scanfile.hasNextLine()) {
                Scanner s = new Scanner(scanfile.nextLine());
                s.useDelimiter(",");
                name = s.next();
                surname = s.next();
                gender = s.next();
                age = Integer.valueOf(s.next().trim());
                Person per = new Person(name, surname, gender, age);
                person.add(per);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        person.sort(Comparator.comparing((p) -> (p.getName() + p.getSurname())));
        try {
            PrintWriter delete = new PrintWriter(fname);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        try {
            FileWriter fileWriter = new FileWriter(fname);
            for (int i = 0; i < person.size(); ++i) {
                fileWriter.write(person.get(i).getName() + person.get(i).getSurname() + person.get(i).getGender() + " " + person.get(i).getAge());
                fileWriter.write("\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        for (Person p : person) {
            if (p.getGender().trim().equals("мужской")) {
                male += 1;
            } else {
                female += 1;
            }
            if (p.getAge() > 30) {
                count += 1;
            }
        }

        System.out.println("Количество лиц с возрастом более 30: " + count);
        System.out.println("Количество лиц мужского пола: " + male);
        System.out.println("Количество лиц женского пола: " + female);
    }
}

