package exceptions;

public class MainException extends Exception {
    private static final String STANDARD_MESSAGE = "Something go wrong";
    private String message;

    public MainException() {
        this.message = STANDARD_MESSAGE;
    }

    public MainException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.getClass() + message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
