package TaskA;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Input size: ");
        size = in.nextInt();
        Integer[] mass = new Integer[size];
        System.out.println("Input numbers: ");
        for (int i = 0; i < size; i++) {
            mass[i] = in.nextInt();
        }
        System.out.println("Unsorted array: ");
        List<Integer> integerList = Arrays.asList(mass);
        integerList.forEach(n-> System.out.print(n + " "));
        TaskA taskA = new TaskA(mass);
        taskA.Sort();
    }
}
