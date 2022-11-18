package lesson7_1;

public class Circle extends Figures {
    double r;
    public Circle(double r) {
        this.r = r;
    }
    @Override
    double Perimeter() {
        return  2*Math.PI*r;
    }
    @Override
    double Area() {
        return Math.PI*r*r;
    }
}

