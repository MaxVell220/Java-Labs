package lab4.taskB.exceptions;

/**
 * parent exception
 */
public class MainException extends Exception {
    public MainException() {
        System.out.println("Something go wrong...");
    }

    public MainException(String string) {
        System.out.println("Exception: " + string);
    }
}
