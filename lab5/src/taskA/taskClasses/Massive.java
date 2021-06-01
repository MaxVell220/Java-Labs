package taskA.taskClasses;

import java.util.Arrays;
import java.util.Objects;

public class Massive extends Element {
    protected Element[] mass;
    protected int size;

    public Massive(int size) throws IllegalArgumentException {
        if (size <= 0) {
            throw new IllegalArgumentException();
        }
        this.size = size;
        mass = new Element[size];
    }

    public int addElem(int numb, int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Error.");
        }
        Element newElem = new Element();
        newElem.setNumber(numb);
        mass[index] = newElem;
        return numb;
    }

    public int getNumb(int index) {
        if (index < size) {
            return mass[index].getNumber();
        } else {
            return 0;
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Massive: " + mass.toString() +
               ", size=" + size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Massive massive = (Massive) o;
        return size == massive.size && Arrays.equals(mass, massive.mass);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(mass);
        return result;
    }
}
