package lab4.taskB.taskClasses;

import java.util.Comparator;

public abstract class Coffee implements Comparable<Coffee>, Comparator<Coffee> {
    private String sort;
    private int price;
    private String typeOfPackaging;
    private int weight;

    public Coffee(String sort, int price, String typeOfPackaging, int weight) {
        this.sort = sort;
        this.price = price;
        this.typeOfPackaging = typeOfPackaging;
        this.weight = weight;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTypeOfPackaging() {
        return typeOfPackaging;
    }

    public void setTypeOfPackaging(String typeOfPackaging) {
        this.typeOfPackaging = typeOfPackaging;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "sort: " + sort +
                ", price: " + price +
                ", typeOfPackaging: " + typeOfPackaging +
                ", weight: " + weight;
    }
}
