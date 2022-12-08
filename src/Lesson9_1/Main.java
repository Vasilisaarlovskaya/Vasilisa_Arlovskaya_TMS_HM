package Lesson9_1;

/*
Создайте класс, который описывает вектор в двумерной системе координат.
Создайте класс, который описывает вектор в трехмерной системе координат.
У каждого класса должны быть:
- конструктор с параметрами в виде списка координат (например, x, y, z);
- метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt();
- метод, вычисляющий скалярное произведение;
- метод сложения векторов;
- метод разности векторов;
- статический метод, который принимает целое число N, и
возвращает массив случайных векторов размером N.
Предусмотреть метод сравнение векторов.
Предусмотреть метод для вывода информации о векторе.
Каждый из классов должен иметь константу, содержащею описание вектора.
Например, "Это вектор для двумерной системы координат".
Эта константа так же должна выводиться в методе для вывода информации о векторе
*/

public class Main {
    public static void main(String[] args) {

        vector_xy vector1 = new vector_xy(2, 8);
        vector_xy vector2 = new vector_xy(9,8);
        vector1.lenght();
        vector1.scaler(vector2);
        vector_xy vector3 = vector1.sum(vector2);
        System.out.println("Новый вектор из суммы векторов" + vector3);
        vector_xy vector4 = vector1.difference(vector2);
        System.out.println("Новый вектор из разности векторов" + vector4);
        vector_xy.random(3);
        vector1.comparison(vector2);
        vector1.informations();

        System.out.println();
        vector_xyz vector11 = new vector_xyz(8, 9,6);
        vector_xyz vector12 = new vector_xyz(9, 2,4);
        vector11.lenght2(vector12);
        vector11.scaler2(vector12);
        vector_xyz vector13 = vector11.sum2(vector12);
        System.out.println("Новый вектор из суммы векторов" + vector13);
        vector_xyz vector14 = vector11.difference2(vector12);
        System.out.println("Новый вектор из суммы векторов" + vector14);
        vector_xyz.random2(4);
        vector11.comparison(vector12);
        vector11.informations2();
    }
}
