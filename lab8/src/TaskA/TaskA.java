package TaskA;

import java.util.Arrays;
import java.util.List;

public class TaskA {
    Integer[] mass;

    public TaskA(Integer[] mass) {
        this.mass = new Integer[mass.length];
        System.arraycopy(mass, 0, this.mass, 0, mass.length);
    }

    public void Sort() {
        System.out.println("\nSorted mass: ");
        List<Integer> integerList = Arrays.asList(this.mass);
        integerList.stream().sorted((i1, i2) -> i2.compareTo(i1)).forEach(n -> System.out.print(n + " "));
    }
}
