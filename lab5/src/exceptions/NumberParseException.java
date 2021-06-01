package exceptions;

public class NumberParseException extends NumberException {
    public NumberParseException() {
        this.setMessage("Something in parsing numbers go wrong");
    }

    public NumberParseException(String message) {
        this.setMessage(message);
    }
}
