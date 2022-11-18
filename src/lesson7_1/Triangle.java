package lesson7_1;

public class Triangle extends Figures {
   double a;
   double b;
   double c;
   double p;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        p = (a+b+c)/2;
    }


    @Override
    public double Perimeter() {
        return a+b+c;

    }


    @Override
    double Area() {
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));



    }


}
