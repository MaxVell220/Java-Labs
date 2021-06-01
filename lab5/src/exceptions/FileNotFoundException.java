package exceptions;

public class FileNotFoundException extends FileException {
    public FileNotFoundException() {
        this.setMessage("File not found");
    }

    public FileNotFoundException(String message) {
        this.setMessage(message);
    }
}
