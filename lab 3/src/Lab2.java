import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Darina Skovysh 2 course MMF
 */
public class Lab2 {


    /**
     * exponential method to call from main<br>
     * to demonstrate assignments<br>
     *
     * @see Lab2 # taskA () - first task<br>
     * @see Lab2 # taskC () - second task<br>
     */
    public static void defiant() {
        taskA();
        System.out.println("\n");
        taskC();
        System.out.println("\n");
        Calendar temp = Calendar.getInstance();
        temp.set(2021, 1, 8, 13, 00);
        Date dateOfDelivery = new Date();
        Date dateOfReceiving = temp.getTime();
        System.out.println("Developer surname: Skovysh\n" +
                "date of delivery: " + dateOfReceiving.toString() +
                "\ndate of receipt of the task: " + dateOfDelivery.toString()
        );
    }

    /**
     * method for the first task<br>
     * <b> Task text </b><br>
     * 13. Display all numbers from 1 to 100 that are divisible by 3 without remainder.<br>
     */
    private static void taskA() {
        System.out.println("Task A");
        System.out.println("Numbers from 1 to 100, divisible by 3 without remainder:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    /**
     * method of the second task<br>
     * <b> Task text </b><br>
     * 13. Transform the rows of the matrix so that<br>
     * elements equal to zero were located after all others.<br>
     */
    private static void taskC() {
        System.out.println("Task C");
        int cols;
        int rows;
        System.out.print("Enter the number of rows and columns of the Martix: ");
        Scanner in = new Scanner(System.in);
        rows = in.nextInt();
        cols = in.nextInt();
        System.out.println("Enter matrix values: ");
        int[][] mass = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mass[i][j] = in.nextInt();
            }
        }
        System.out.println("Initial matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(mass[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < rows; i++) {
            int[] buff = bar(mass[i]);
            for (int j = 0; j < cols; j++) {
                mass[i][j] = buff[j];
            }
        }

        System.out.println("Final matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(mass[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * method that sorts array elements in such a way<br>
     * so that all zeros come after others<br>
     *
     * @param mass - 2D matrix row<br>
     */
    private static int[] bar(int[] mass) {
        int[] result = new int[mass.length];
        int index = 0;
        for (int elem : mass) {
            if (elem != 0) result[index++] = elem;
        }
        return result;
    }
}
