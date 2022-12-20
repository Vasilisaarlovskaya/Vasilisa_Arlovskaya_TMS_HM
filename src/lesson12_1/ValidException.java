package lesson12_1;

public class ValidException extends Exception {
    private String message;

    @Override
    public String getMessage() { return message;}

    public ValidException(String message) {
        this.message = message;
    }
}
