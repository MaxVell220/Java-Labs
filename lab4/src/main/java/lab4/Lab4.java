package lab4;

import lab4.taskA.TaskA;
import lab4.taskB.TaskB;

import java.util.concurrent.TimeUnit;

public class Lab4 {
    public static void defiant() throws InterruptedException {
        //TaskA.defiant();
        System.out.println();
        //TimeUnit.MINUTES.sleep(3);
        TaskB.defiant();
    }
}
