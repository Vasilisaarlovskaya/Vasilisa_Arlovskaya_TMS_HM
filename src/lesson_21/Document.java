package lesson_21;

import java.text.SimpleDateFormat;

public class Document {

    private String number;

    public String getNumber() {
        return number;
    }


    public void setNumber(String number) {
        this.number = number;
    }

    SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
    public Document(String number) {
        this.number = number;
        this.date = date;
    }
}

