import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int array[] = {4, 17, 98, 16, 67, 1};

        System.out.println("Введите число для поиска");
        int number = scanner.nextInt();
        Arrays.sort(array);
        int pos = Arrays.binarySearch(array, number);
        if (pos >= 0) {
            System.out.println("Число входит в массив, индекс числа " + pos);
        } else {
            System.out.println("Число в массив не входит");
        }


        Scanner scanner1 = new Scanner(System.in);
        int array1[] = {4, 7, 9, 22, 20};
        System.out.println("Введите число для поиска в массиве");
        int number1 = scanner1.nextInt();
        if (number1 == array1[0] || number1 == array1[1] || number1 == array1[2] ||
                number1 == array1[3] || number1 == array1[4]) {
            Arrays.sort(array1);
            int pos1 = Arrays.binarySearch(array1, number1);
            array1[pos1] = array1[4];
            array1[4] = 0;
            int result[] = new int[array1.length - 1];
            System.arraycopy(array1, 0, result, 0, result.length);
            System.out.println("Элементы нового массив" + Arrays.toString(result));
        } else {
            System.out.println("Числа нет в массиве");
        }


        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int x = scanner.nextInt();
        int array3[] = new int[x];
        for (int i = 0; i < x; i++) {
            array3[i] = ((int) (Math.random() * 50));
        }
        System.out.println(Arrays.toString(array3));
        int maxNum = array3[0];
        for (int g : array3) {
            if (g > maxNum)
                maxNum = g;
        }
        System.out.println("Максимальное значение " + maxNum);
        int minNum = array3[0];
        for (int k : array3) {
            if (k < minNum)
                minNum = k;
        }
        System.out.println("Минимальное значение " + minNum);
        double meanNum = 0;
        for (int i = 0; i < x; i++) {
            meanNum += array3[i];
        }
        meanNum /= x;
        System.out.println("Среднее значение массива " + meanNum);


        int mass1[] = new int[]{1, 9, 7, 44, 75};
        int mass2[] = {4, 16, 0, 2, 90};
        System.out.println(Arrays.toString(mass1));
        System.out.println(Arrays.toString(mass2));
        double mean1 = 0;
        double mean2 = 0;
        for (int i = 0; i < 5; i++) {
            mean1 += mass1[i];
            mean2 = +mass2[i];
        }
        mean1 /= 5;
        mean2 /= 5;
        if (mean1 > mean2) {
            System.out.println("Среднее арифметическое первого массива побольше " +
                    "среднего арифметического второго массива");
        } else if (mean2 > mean1) {
            System.out.println("Среднее арифметическое второго массива побольше " +
                    "среднего арифметического первого массива");
        } else System.out.println("Срдние арифметические двух массивов равны");
    }
}
