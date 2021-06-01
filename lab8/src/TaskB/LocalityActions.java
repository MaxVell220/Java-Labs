package TaskB;

import java.util.ArrayList;
import java.util.Scanner;

public interface LocalityActions {
    default String selectNewManager(ArrayList<String> managers) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < managers.size(); i++) {
            System.out.println(i + 1 + ")" + managers.get(i));
        }
        System.out.println("Input number of mayor: ");
        int chosen = in.nextInt();
        return managers.get(chosen - 1);
    }

    public void showInfo();

    public void changePopulation(int times, boolean isEnlarge);

    public void changeBudget(int times, boolean isEnlarge);

}
