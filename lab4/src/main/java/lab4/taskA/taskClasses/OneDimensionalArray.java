package lab4.taskA.taskClasses;

public class OneDimensionalArray extends Massive {

    public OneDimensionalArray(int size) throws IllegalArgumentException {
        super(size);
    }

    public String show() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            int a = this.mass[i].getNumber();
            result.append(a).append(" ");
        }
        System.out.println(result);
        return result.toString();
    }

    public OneDimensionalArray addNumber(OneDimensionalArray mass) throws IllegalArgumentException {
        OneDimensionalArray result = new OneDimensionalArray(this.size);
            if (this.size == mass.getSize()) {
                for (int i = 0; i < this.size; i++) {
                    result.addElem(this.mass[i].getNumber() + mass.getNumb(i), i);
                }
            } else {
                throw new IllegalArgumentException("Incorrect size.");
            }
        return result;
    }

    public OneDimensionalArray subtractNumber(OneDimensionalArray mass) throws IllegalArgumentException {
        OneDimensionalArray result = new OneDimensionalArray(this.size);
            if (this.size == mass.getSize()) {
                for (int i = 0; i < this.size; i++) {
                    result.addElem(this.mass[i].getNumber() - mass.getNumb(i), i);
                }
            } else {
                throw new IllegalArgumentException("Incorrect size.");
            }
        return result;
    }

    public OneDimensionalArray multiplyNumber(OneDimensionalArray mass) throws IllegalArgumentException {
        OneDimensionalArray result = new OneDimensionalArray(this.size);
            if (this.size == mass.getSize()) {
                for (int i = 0; i < this.size; i++) {
                    result.addElem(this.mass[i].getNumber() * mass.getNumb(i), i);
                }
            } else {
                throw new IllegalArgumentException("Incorrect size.");
            }
        return result;
    }

    public int getNumb(int index) {
        return this.mass[index].getNumber();
    }

}
