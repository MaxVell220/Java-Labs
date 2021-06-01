package taskC;

public class Phone {
    private String number;
    private String ownerName;

    public Phone(String number, String ownerName) {
        this.number = number;
        this.ownerName = ownerName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Phone {" +
               "number = " + number + '\n' +
               ", ownerName = " + ownerName + '\n' +
               '}';
    }
}
