package lab4.taskB.taskClasses;

public class Instant_coffee extends Coffee {
    public Instant_coffee(String sort, int price, String typeOfPackaging, int weight) {
        super(sort, price, typeOfPackaging, weight);
    }

    @Override
    public String toString() {
        return "Instant coffee: " + super.toString();
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
