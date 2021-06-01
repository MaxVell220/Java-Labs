import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Lab1 {
    public static void defiant() {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int number = 0;
        List<Integer> result = new ArrayList<>();
        System.out.print("Enter count of numbers: ");
        count = in.nextInt();
        System.out.println("Enter numbers among which there is a palindrome: ");
        for (int i = 0; i < count; i++) {
            number = in.nextInt();
            if (isPalindrome(number)) {
                result.add(number);
            }
        }
        System.out.println("Palindrome: ");
        for (int iter : result) {
            System.out.print(iter + " ");
        }
    }


    private static boolean isPalindrome(int number) {
        int buff = number;
        int reverse = 0;
        while (buff > 0) {
            reverse *= 10;
            reverse += buff % 10;
            buff /= 10;
        }
        return reverse == number;
    }
}
