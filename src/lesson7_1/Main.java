package lesson7_1;
/*
    Написать иерархию классов «Фигуры».
    Фигура -> Треугольник -> Прямоугольник -> Круг.
    Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет периметра.
    Площадь треугольника по формуле Герона.
    Создать массив из 5 фигур.
    Вывести на экран сумму периметров и сумму площадей всех фигур в массиве.
*/
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {

    public static void main(String [] args) {

        double sumPerimeter = 0;
        double sumArea = 0;

     Circle c = new Circle(4);
     Circle c1 = new Circle(1.5);
     Triangle t = new Triangle(12, 7.1, 8);
     Triangle t1 = new Triangle(9, 8, 14);
     Rectangle r1 = new Rectangle(6,9);
     Figures figures [] = new Figures [] {c, c1, t, t1, r1};

     for (Figures f : figures) {
         sumPerimeter += f.Perimeter();
         sumArea += f.Area();
     }
        System.out.println("Сумма периметров всех фигур: " + Math.round(sumPerimeter));
        System.out.println("Сумма площадей всех фигур: " + Math.round(sumArea));
    }
}