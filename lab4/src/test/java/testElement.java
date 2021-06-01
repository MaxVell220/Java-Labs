import static org.testng.Assert.*;

import org.testng.annotations.Test;
import lab4.taskA.taskClasses.Element;

@Test
public class testElement {
    public void checkGetNumber() {
        Element num = new Element();
        num.setNumber(15);
        assertEquals(num.getNumber(), 15);
    }

    public void checkSetNumber() {
        Element num = new Element();
        num.setNumber(15);
        assertEquals(num.getNumber(), 15);
    }

    public void checkToString() {
        Element num = new Element();
        num.setNumber(15);
        assertEquals(num.toString(), "number = 15");
    }
}
