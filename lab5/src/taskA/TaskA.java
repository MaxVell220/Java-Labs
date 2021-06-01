package taskA;

import taskA.taskClasses.OneDimensionalArray;

import java.util.Scanner;

public class TaskA {
    public static void defiant() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter count of numbers: ");
        try {
            int count = in.nextInt();
            if (count <= 0) {
                throw new IllegalArgumentException("Incorrect size.");
            }
            OneDimensionalArray array = new OneDimensionalArray(count);
            System.out.println("Enter numbers: ");
            for (int i = 0; i < count; i++) {
                array.addElem(in.nextInt(), i);
            }
            int key = 1;
            while (key != 0) {
                menu();
                key = in.nextInt();
                switch (key) {
                    case 1:
                        System.out.print("Enter the size of massive and numbers by which the array will be multiplied: ");
                        int size = in.nextInt();
                        if (size <= 0) {
                            throw new IllegalArgumentException("Incorrect size.");
                        }
                        int[] mass = new int[size];
                        for (int i = 0; i < size; i++) {
                            mass[i] = in.nextInt();
                        }
                        OneDimensionalArray adding = copy(mass);
                        OneDimensionalArray result = array.multiplyNumber(adding);
                        result.show();
                        break;
                    case 2:
                        System.out.print("Enter the size of massive and numbers by which the array will be added: ");
                        int size2 = in.nextInt();
                        if (size2 <= 0) {
                            throw new IllegalArgumentException("Incorrect size.");
                        }
                        int[] mass2 = new int[size2];
                        for (int i = 0; i < size2; i++) {
                            mass2[i] = in.nextInt();
                        }
                        OneDimensionalArray adding2 = copy(mass2);
                        OneDimensionalArray result2 = array.multiplyNumber(adding2);
                        result2.show();
                        break;
                    case 3:
                        System.out.print("Enter the size of massive and numbers which the array will be subtracted from array: ");
                        int size3 = in.nextInt();
                        if (size3 <= 0) {
                            throw new IllegalArgumentException("Incorrect size.");
                        }
                        int[] mass3 = new int[size3];
                        for (int i = 0; i < size3; i++) {
                            mass3[i] = in.nextInt();
                        }
                        OneDimensionalArray adding3 = copy(mass3);
                        OneDimensionalArray result3 = array.multiplyNumber(adding3);
                        result3.show();
                        break;
                    case 4:
                        array.show();
                        break;
                    case 0:
                        break;
                    default:
                        throw new Exception("Incorrect key.");
                }
            }
            in.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void menu() {
        System.out.println("""
                                
                1 - Multiply array by number
                2 - Add number to each element of array
                3 - Subtract number from each element of array
                4 - Show elements of array
                                
                """);
    }

    private static OneDimensionalArray copy(int[] mass) throws Exception {
        OneDimensionalArray arr = new OneDimensionalArray(mass.length);
        try {
            for (int i = 0; i < mass.length; i++) {
                arr.addElem(mass[i], i);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return arr;
    }

}
