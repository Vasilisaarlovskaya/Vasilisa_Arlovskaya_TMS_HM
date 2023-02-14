package Lesson_21_1;

import java.text.SimpleDateFormat;

public class Document {

    private String number;
    private String inf;
    private String typeDocument;

    public String getNumber() {
        return number;
    }
    public String getInf () {return inf;}

    public String getTypeDocument() {return typeDocument;}

    public void setNumber(String number) {
        this.number = number;
    }
    public void setInf (String inf) {this.inf = inf;}

    public void setTypeDocument(String typeDocument) {this.typeDocument = typeDocument;}

    SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
    public Document(String number,String typeDocument, String inf) {
        this.number = number;
        this.inf = inf;
        this.typeDocument = typeDocument;
        this.date = date;
    }
}

