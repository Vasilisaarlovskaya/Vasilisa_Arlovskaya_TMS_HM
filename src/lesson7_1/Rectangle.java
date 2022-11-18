package lesson7_1;

public class Rectangle extends Figures {

    double a;
    double b;
    public Rectangle(double a, double b ){
        this.a = a;
        this.b = b;
    }
    @Override
    double Perimeter() {
      return  (a+b)*2;
    }
    @Override
    double Area() {
        return a*b;
    }
}
