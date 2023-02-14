package lesson_20;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) throws IOException {
            String name = "";
            String surname = "";
            String gender = "";
            String age = "";
            int count = 0;
            int male = 0;
            int female = 0;
            int kd = 0;
            System.out.println("Введите путь к файлу");
            Scanner scan = new Scanner(System.in);
            String fname = scan.nextLine();
            FileReader file = new FileReader(fname);
            Scanner scanfile = new Scanner(file);
            ArrayList<Person> person = new ArrayList();

            while(scanfile.hasNextLine()) {
                Scanner s = new Scanner(scanfile.nextLine());
                s.useDelimiter(",");
                name = s.next();
                surname = s.next();
                gender = s.next();
                age = s.next();
                Person per = new Person(name, surname, gender, age);
                person.add(per);
            }

            file.close();
            person.sort(Comparator.comparing((person1x) -> {
                String var10000 = person1x.getName();
                return var10000 + person1x.getSurname();
            }));

            try {
                PrintWriter del = new PrintWriter(fname);
                del.close();
            } catch (IOException var19) {
                var19.printStackTrace();
            }

            FileWriter fileWriter = new FileWriter(fname);

            for(int i = 0; i < person.size(); ++i) {
                String var10001 = ((Person)person.get(i)).getName();
                fileWriter.write(var10001 + ((Person)person.get(i)).getSurname() + ((Person)person.get(i)).getGender() + ((Person)person.get(i)).getAge());
                fileWriter.write("\n");
            }

            fileWriter.close();
            Iterator var23 = person.iterator();

            while(var23.hasNext()) {
                Person person1 = (Person)var23.next();
                if (person1.getGender().equals("мужской")) {
                    ++male;
                } else {
                    ++female;
                }

                try {
                    kd = Integer.parseInt(person1.getAge());
                } catch (NumberFormatException var18) {
                }

                if (kd > 30) {
                    ++count;
                }
            }

            System.out.println("Количество лиц с возрастом более 30: " + count);
            System.out.println("Количество лиц мужского пола: " + male);
            System.out.println("Количество лиц женского пола: " + female);
        }
    }

