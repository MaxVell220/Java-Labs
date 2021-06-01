package exceptions;

public class FileException extends MainException {
    public FileException() {
        this.setMessage("Something in work with file go wrong");
    }

    public FileException(String message) {
        this.setMessage(message);
    }
}
