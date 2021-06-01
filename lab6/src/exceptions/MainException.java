package exceptions;

/**
 * parent exception
 */
public class MainException extends Exception {
    private String message;

    public MainException() {
        System.out.println("Something go wrong...");
    }

    public MainException(String string) {
        this.message = string;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
