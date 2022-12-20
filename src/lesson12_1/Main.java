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
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);
        String pathName = scanner.next();
        Scanner scanner1 = new Scanner(new File(pathName));
        try {
            while (scanner1.hasNextLine()) {
                String textfromfile = scanner1.nextLine();
                System.out.println(textfromfile);

                if (textfromfile.length() != 15) {
                    throw new LengthException("Длина номера документа не подходит: ");
                }
                if (!textfromfile.startsWith("docnum") && !textfromfile.startsWith("contract")) {
                        throw new StartWithException("Номер документа не начинается с docnum или с contract"); }
            }
        } catch(ValidException ex){
                System.err.println(ex.getMessage());
            }
        }
    }
