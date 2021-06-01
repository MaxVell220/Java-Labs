import taskA.TaskA;
import taskB.TaskB;

public class Main {
    public static void main(String[] args) {
        try {
            TaskA.defiant();
            //TaskB.defiant();
            //TaskC.defiant();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}



