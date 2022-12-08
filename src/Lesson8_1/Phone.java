package Lesson8_1;

public class Phone {

    private String number;
    private final String model;
    private double weight;
    public Contact c [] = new Contact[3];

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    Contact contactWeAreLookind = null;

    public void ReceiveCall (Contact c) {
        System.out.println("Звонит: " + c.getContactNumber() + " " + c.getContactName());
    }
    public Contact ReceiveCall ( String getContactNumber, String getContactName) {
        for (int i = 0; i <c.length; i++ ) {
            if (c[i].getContactName().equals(getContactName) &&
            c[i].getContactNumber().equals(getContactNumber)) {
    } contactWeAreLookind = c[i];
        }
        System.out.println("Звоню");
        return contactWeAreLookind;
    }
    public void sendMessage (Contact c, String ... sms) {
        System.out.println("Вам отправили сообщение с номера " + c.getContactNumber() + " : " + sms);
    }

}



