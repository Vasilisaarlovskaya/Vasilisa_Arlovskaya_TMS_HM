package Lesson9_1;

import java.sql.SQLOutput;
import java.util.Random;

public class vector_xyz {
    private double x;
    private double y;
    private double z;
    public static final String INFORMATION = "Этот вектор для трехмерной системы координат";

    public vector_xyz(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double lenght2 (vector_xyz vector) {
        System.out.println("Длина векторна: " + Math.sqrt(x*x+y*y+z*z));
        return Math.sqrt(x*x+y*y+z*z);
    }
    public double scaler2 (vector_xyz vector) {
        System.out.println("Скаляр: " + x * vector.x + y * vector.y + z * vector.z);
        return x * vector.x + y * vector.y + z * vector.z;
    }
    public vector_xyz sum2 (vector_xyz vector) {
        return new vector_xyz (x + vector.x, y + vector.y, z + vector.z);
    }
    public vector_xyz difference2 (vector_xyz vector) {
        return new vector_xyz(x - vector.x, y - vector.y, z - vector.z);
    }
    public static vector_xyz [] random2 (int n) {
        vector_xyz [] vectors = new vector_xyz[n];
        Random random = new Random();
        for (int i = 0; i < vectors.length; i++) {
        vectors [i] = new vector_xyz(random.nextDouble(55),
                random.nextDouble(89), random.nextDouble(8));
            System.out.println(vectors[i]);
        }
        return vectors;
    }
    public boolean comparison (vector_xyz vector){
        System.out.println(x == vector.x && y == vector.y && z == vector.z);
        return x == vector.x && y == vector.y && z == vector.z;
    }
    public void informations2 (){
        System.out.println(INFORMATION);
        System.out.println("x = " + x + "\ny = " + y + "\nz = " +z);
    }

    @Override
    public String toString() {
        return "vector_xyz{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
