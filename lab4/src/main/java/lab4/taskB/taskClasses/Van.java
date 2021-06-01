package lab4.taskB.taskClasses;

import lab4.taskB.exceptions.FillingVanException;
import lab4.taskB.exceptions.VanSizeException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Van {
    int size;

    public Van(int size) throws VanSizeException {
        if (size <= 0) throw new VanSizeException("Incorrect size.");
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) throws VanSizeException {
        if (size <= 0) throw new VanSizeException("Incorrect size.");
        this.size = size;
    }

    public void fillVan(ArrayList<Coffee> stuff) throws FillingVanException {
        Collections.sort(stuff);
        Integer[] wasteOfCoffee = new Integer[stuff.size()];
        int counter = 0;
        for (Coffee iter : stuff) {
            wasteOfCoffee[counter] = iter.getWeight();
            counter++;
        }
        int[] res = new int[stuff.size()];
        int weighMin = Collections.min(Arrays.asList(wasteOfCoffee));

        int[] LP = new int[size];
        int[] LCr = new int[size];

        LP[weighMin - 1] = stuff.get(0).getPrice();
        LCr[weighMin - 1] = 1;
        int[] clone = new int[size];
        for (int i = 1; i < stuff.size(); i++) {
            if (wasteOfCoffee[i] < size) {
                clone[wasteOfCoffee[i]] = stuff.get(i).getPrice();
            }
            for (int j = weighMin - 1; j < size - wasteOfCoffee[i]; j++) {
                if (LP[j] > 0) {
                    clone[j + wasteOfCoffee[i]] = LP[j] + stuff.get(i).getPrice();
                }
            }
            for (int j = weighMin - 1; j < size; j++) {
                if (clone[j] > 0 && clone[j] > LP[j]) {
                    LP[j] = clone[j];
                    LCr[j] = i;
                }
            }
        }
        int index = 0;
        int maxPrice = 0;
        for (int i = 0; i < size; i++) {
            if (LP[i] > maxPrice) {
                index = i;
                maxPrice = LP[i];
            }
        }
        res[LCr[index]] = 1;
        while (index > 0) {
            index -= wasteOfCoffee[LCr[index]];
            if (res[LCr[index]] == 0) {
                res[LCr[index]] = 1;
            }
        }
        int size = this.size;
        for (int i = 0; i < stuff.size(); i++) {
            if (res[i] == 1 && size - stuff.get(i).getWeight() >= 0) {
                System.out.println(stuff.get(i));
                size -= stuff.get(i).getWeight();
            }
        }
        if (size == this.size) {
            throw new FillingVanException("Van is empty");
        }
    }


}



