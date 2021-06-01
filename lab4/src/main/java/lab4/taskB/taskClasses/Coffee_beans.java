package lab4.taskB.taskClasses;

public class Coffee_beans extends Coffee {
    public Coffee_beans(String sort, int price, String typeOfPackaging, int weight) {
        super(sort, price, typeOfPackaging, weight);
    }

    @Override
    public String toString() {
        return "Coffee beans: " + super.toString();
    }

    @Override
    public int compareTo(Coffee o) {
        return this.getPrice() - o.getPrice();
    }

    @Override
    public int compare(Coffee o1, Coffee o2) {
        return o1.getWeight() - o2.getWeight();
    }
}
