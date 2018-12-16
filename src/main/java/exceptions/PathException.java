package exceptions;

/**
 * @author weisong
 * @date 2018/11/22 8:57 AM
 */
public class PathException extends RuntimeException {
    public PathException() {
    }

    public PathException(String message) {
        super(message);
    }

    public PathException(String message, Throwable cause) {
        super(message, cause);
    }
}
