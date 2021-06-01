package lab4.taskA.taskClasses;

public class Element {
    protected int number;

    public Element() {}

    public Element(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "number = " + number;
    }
}