package Lesson8_2;

public class Surgeon {
    public static void treat(int broken_bones){
        System.out.println("Хирург лечит");
        broken_bones = 0;
        System.out.println("Хирург полечил все косточки (другого он не умеет), сломанных костей у пациента: "
                + broken_bones);
    }
}
