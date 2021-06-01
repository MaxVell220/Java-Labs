import org.testng.annotations.Test;
import lab4.taskA.taskClasses.Massive;

import static org.testng.Assert.*;

@Test
public class testMassive {
    public void checkAddElem() {
        try {
            Massive massive = new Massive(5);
            int[] mass = {1, 2, 8, 25, 45};
            for (int i = 0; i < 5; i++) {
                massive.addElem(mass[i], i);
            }
            for (int i = 0; i < 5; i++) {
                assertEquals(massive.getNumb(i), mass[i]);
            }
            assertEquals(massive.getSize(), 5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void checkGetNumber() throws Exception {
        Massive massive = new Massive(5);
        int[] mass = {1, 2, 8, 25, 45};
        for (int i = 0; i < 5; i++) {
            massive.addElem(mass[i], i);
        }
        for (int i = 0; i < 5; i++) {
            assertEquals(massive.getNumb(i), mass[i]);
        }
    }

    public void checkSize() {
        try {
            Massive massive = new Massive(5);
            assertEquals(massive.getSize(), 5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
