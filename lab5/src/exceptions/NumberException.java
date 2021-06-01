package exceptions;

public class NumberException extends MainException {
    public NumberException() {
        this.setMessage("Something in work with numbers go wrong");
    }

    public NumberException(String message) {
        this.setMessage(message);
    }
}
