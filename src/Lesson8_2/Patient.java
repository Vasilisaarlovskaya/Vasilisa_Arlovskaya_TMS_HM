package Lesson8_2;

public class Patient {

    int teeth;
    int broken_bones;
    int diseas;
    static int plan;


    public Patient(int teeth, int broken_bones, int diseas) {
        this.teeth = teeth;
        this.broken_bones = broken_bones;
        this.diseas = diseas;
    }

    public void plan_definition1 (){
        if (broken_bones > 0) {
            Patient.plan = 1;
            Surgeon.treat(broken_bones);

        }
    }
    public void plan_definition2 (){
        if (teeth !=32) {
            Patient.plan = 2;
            Dentist.treat(teeth);
        }}
    public void plan_definition3 (){
        if (diseas > 0) {
            Patient.plan = 3;
            Therapist.treat(diseas);
        }
    }
}

    /*
    public void victim  () {
     if (Patient.plan == 1) {
            Surgeon.treat(broken_bones);
        } if (Patient.plan == 2) {
            Dentist.treat(teeth);
        } else {
            Therapist.treat(diseas);
        }
     */


