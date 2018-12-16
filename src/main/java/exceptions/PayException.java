package exceptions;

/**
 * @author weisong
 * @date 2018/11/22 2:17 PM
 */
public class PayException extends RuntimeException {
    public PayException() {
    }

    public PayException(String message) {
        super(message);
    }

    public PayException(String message, Throwable cause) {
        super(message, cause);
    }
}
