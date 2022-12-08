package Lesson9_1;

import java.util.Random;

public class vector_xy {
    private double x;
    private double y;
    public static final String INF = "Это вектор для двумерной системы координат";

    public vector_xy(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double lenght (){
        System.out.println("Длина вектора: " + Math.sqrt(x*x+y*y));
    return Math.sqrt(x*x+y*y);
    }
    public double scaler (vector_xy vector) {
        System.out.println("Скаляр: " + (x * vector.x + y * vector.y));
        return x * vector.x + y * vector.y;
    }
    public vector_xy sum (vector_xy vector){
        return new vector_xy(x + vector.x, y + vector.y);
    }
    public vector_xy difference (vector_xy vector){
        return new vector_xy(x - vector.x, y - vector.y);
    }
    public static vector_xy[] random (int n){
        vector_xy[] vectors = new vector_xy[n];
        Random random = new Random();
        for (int i = 0; i< vectors.length; i++) {
            vectors [i] = new vector_xy(random.nextDouble(50), random.nextDouble(77));
            System.out.println(vectors[i]);
        }
        return vectors;
        }
        public boolean comparison (vector_xy vector) {
            System.out.println(x == vector.x && y == vector.y);
        return x == vector.x && y == vector.y;
        }
        public void informations (){
            System.out.println(INF);
            System.out.println("x = " + x + "\ny = " + y);
        }

    @Override
    public String toString() {
        return "vector_xy{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
