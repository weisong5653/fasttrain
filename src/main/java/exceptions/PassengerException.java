package exceptions;

public class PassengerException extends RuntimeException {
    public PassengerException() {
        super();
    }

    public PassengerException(String message) {
        super(message);
    }

    public PassengerException(String message, Throwable cause) {
        super(message, cause);
    }
}
