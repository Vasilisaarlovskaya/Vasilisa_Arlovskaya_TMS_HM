package lesson11_1;

public class abcException extends Exception {

    public abcException() {
    }

    public abcException(String message) {
        super(message);
    }

    public abcException(String message, Throwable cause) {
        super(message, cause);
    }

    public abcException(Throwable cause) {
        super(cause);
    }

    public abcException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
