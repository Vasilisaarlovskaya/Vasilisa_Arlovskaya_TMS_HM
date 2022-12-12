/*
Допустим есть txt файл с номерами документов.
Номером документа является строка, состоящая из букв и цифр(без
служебных символов).
Пусть этот файл содержит каждый номер документа с новой строки и в
строке никакой другой информации, только номер документа.
Валидный номер документа должен иметь длину 15 символов и
начинаться с последовательности docnum(далее любая
последовательность букв/цифр) или contract(далее любая
последовательность букв/цифр).
Написать программу для чтения информации из входного файла - путь к
входному файлу должен задаваться через консоль.
Программа должна проверять номера документов на валидность.
 */

package lesson12_1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

        public static void valid (String numberDocument) throws ValidException {
            String n = numberDocument;
            if ((n.length() != 15) || !n.startsWith("docnum") && !n.startsWith("contract")) {
                throw new ValidException();
            }
        }

        public static void main(String[] args) throws IOException {

            Scanner scanner = new Scanner(System.in);
            String pathName = scanner.next();

            Scanner scanner1 = new Scanner(new File(pathName));
            while (scanner1.hasNextLine()) {
                String textfromfile = scanner1.nextLine();
                try {
                    valid(textfromfile);
                } catch (ValidException e) {
                    System.out.println("Номер следующего документа не подходит по параметрам");
                }
                System.out.println(textfromfile);
            }
        }
    }
