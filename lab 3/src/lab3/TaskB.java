package lab3;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskB {
    public static void defiant() {
        ArrayList<QuadraticEquation> equations = new ArrayList<>();
        int key = 1;
        double a;
        double b;
        double c;
        Scanner in = new Scanner(System.in);
        while (key != 0) {
            menu();
            key = in.nextInt();
            switch (key) {
                case 1:
                    int count = 0;
                    System.out.println("Введите количество уравнений: ");
                    count = in.nextInt();
                    for (int i = 0; i < count; i++) {
                        System.out.print("Введите коэффициенты квадратного уравнения\n a = ");
                        a = in.nextDouble();
                        System.out.print(" b = ");
                        b = in.nextDouble();
                        System.out.print(" c = ");
                        c = in.nextDouble();
                        equations.add(new QuadraticEquation(a, b, c));
                    }
                    break;
                case 2:
                    try {
                        File file = new File("D:/labs/2course/MPI/BSU/fourth-semester/text-files-for-labs/coefficients.txt");
                        FileReader fr = new FileReader(file);
                        BufferedReader reader = new BufferedReader(fr);
                        String lineA = reader.readLine();
                        while (lineA != null) {
                            a = Double.parseDouble(lineA);
                            String lineB = reader.readLine();
                            b = Double.parseDouble(lineB);
                            String lineC = reader.readLine();
                            c = Double.parseDouble(lineC);
                            lineA = reader.readLine();
                            equations.add(new QuadraticEquation(a, b, c));
                        }
                        System.out.println("Data is taken out of file.");
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.println("Quadratic equations:");
                    int counter = 1;
                    for (QuadraticEquation iter : equations) {
                        System.out.print(counter + ") " + iter);
                        counter++;
                    }
                    break;
                case 4:
                    findMaxAndMinRoots(equations);
                    break;
                case 5:
                    System.out.print("Enter the equation number for which to display the intervals: ");
                    int numb = in.nextInt();
                    if (numb - 1 >= 0 && numb - 1 < equations.size()) {
                        equations.get(numb - 1).findIntervalsOfMonotony();
                    } else {
                        System.out.println("Wrong number.");
                    }
                    break;
                case 6:
                    System.out.println("Quadratic Roots: ");
                    int coun = 1;
                    for (QuadraticEquation iter : equations) {
                        ArrayList<Double> root = iter.findRoot();
                        System.out.print("\n" + coun + ") ");
                        if (root != null) {
                            int num = 1;
                            for (Double iterate : root) {
                                System.out.print("x" + num + " = " + iterate + " ");
                                num++;
                            }
                        } else {
                            System.out.println("No valid roots.");
                        }
                        coun++;
                    }
                    break;
                case 7:
                    int first = 0;
                    int second = 0;
                    System.out.print("Enter equation numbers:");
                    first = in.nextInt();
                    second = in.nextInt();
                    if (first - 1 < 0 || first - 1 > equations.size() || second - 1 < 0 || second - 1 > equations.size()) {
                        System.out.println("Invalid numbers entered.");
                    } else {
                        System.out.println("sum: " + equations.get(first - 1).add(equations.get(second - 1)));
                        System.out.println("Difference: " + equations.get(first - 1).subtract(equations.get(second - 1)));
                    }
                default:
                    break;
            }
        }
    }

    private static void menu() {
        System.out.println("\n\n1 - enter coefficients of the quadratic equation from the console \n" +
                "2 - enter the coefficients of the quadratic equation from the file \n" +
                        "3 - output equations \n" +
                        "4 - find the minimum and maximum roots \n" +
                        "five - find extremum and intervals of increasing / decreasing \n " +
                        "6 - display all roots \n" +
                        "7 - add and subtract selected equations \n" +
                        "0 - exit \n");
    }

    private static void findMaxAndMinRoots(ArrayList<QuadraticEquation> mass) {
        double max = 0;
        double min = mass.get(0).findRoot().get(0);
        QuadraticEquation maxEquation = new QuadraticEquation();
        QuadraticEquation minEquation = new QuadraticEquation();
        for (QuadraticEquation iter : mass) {
            ArrayList<Double> roots = iter.findRoot();
            if (roots.size() != 0) {
                if (roots.get(0) > max) {
                    max = roots.get(0);
                    maxEquation = iter;
                }
                if (roots.get(roots.size() - 1) < min) {
                    min = roots.get(roots.size() - 1);
                    minEquation = iter;
                }
            }
        }
        System.out.println("The maximum root has an equation:" + maxEquation +
                "with root:" + max + "\nThe minimum root has the equation:" + minEquation +
                "with root:" + min);
    }

}
