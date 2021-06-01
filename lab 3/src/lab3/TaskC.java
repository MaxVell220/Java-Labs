package lab3;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class TaskC {
    public static void defiant() {
        ArrayList<Vector> mass = new ArrayList<>();
        int key = 1;
        Scanner in = new Scanner(System.in);
        while (key != 0) {
            menu();
            key = in.nextInt();
            switch (key) {
                case 1:

                    int count = 0;
                    System.out.print("Enter the number of vectors: ");
                    count = in.nextInt();
                    for (int i = 0; i < count; i++) {
                        int[] coord = new int[3];
                        for (int j = 0; j < 3; j++) {
                            coord[j] = in.nextInt();
                        }
                        mass.add(new Vector(coord));
                    }
                    break;
                case 2:
                    try {
                        File file = new File("C:\\Users\\DELL\\Desktop\\ЛАБА 3\\text-files-for-labs\\coeffVector.txt");
                        FileReader fr = new FileReader(file);
                        BufferedReader reader = new BufferedReader(fr);
                        String line = reader.readLine();
                        while (line != null) {
                            String[] parts = line.split(" ");
                            int[] score = new int[parts.length];
                            for (int i = 0; i < parts.length; i++)
                                score[i] = Integer.parseInt(parts[i]);
                            mass.add(new Vector(score));
                            line = reader.readLine();
                        }
                        System.out.println("Data is taken out of file.");
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.println("Vectors:");
                    int counter = 1;
                    for (Vector iter : mass) {
                        System.out.println(counter + ") " + iter);
                        counter++;
                    }
                    break;
                case 4:
                    System.out.print("Enter vector numbers: ");
                    int numb1 = in.nextInt();
                    int numb2 = in.nextInt();
                    if (numb1 - 1 >= 0 && numb1 - 1 < mass.size() && numb2 - 1 >= 0 && numb2 - 1 < mass.size()) {
                        if (mass.get(numb1 - 1).isOrthogonal(mass.get(numb2 - 1))) {
                            System.out.println("Vectors are orthogonal.");
                        } else {
                            System.out.println("Vectors intersect.");
                        }
                    } else {
                        System.out.println("Wrong number.");
                    }
                    break;
                case 5:
                    System.out.print("Enter vector numbers: ");
                    int numb = in.nextInt();
                    int num = in.nextInt();
                    if (numb - 1 >= 0 && numb - 1 < mass.size() && num - 1 >= 0 && num - 1 < mass.size()) {
                        System.out.println(mass.get(numb - 1).compare(mass.get(num - 1)));
                    } else {
                        System.out.println("Wrong number.");
                    }
                    break;
                case 6:
                    System.out.print("Enter vector numbers: ");
                    int numb3 = in.nextInt();
                    int numb4 = in.nextInt();
                    int numb5 = in.nextInt();
                    if (numb3 - 1 >= 0 && numb3 - 1 < mass.size() && numb4 - 1 >= 0 && numb4 - 1 < mass.size() && numb5 - 1 >= 0 && numb5 - 1 < mass.size()) {
                        if (mass.get(numb3 - 1).isCoplanar(mass.get(numb4 - 1), mass.get(numb5 - 1))) {
                            System.out.println("Vectors coplanar.");
                        } else {
                            System.out.println("Vectors not coplanar.");
                        }
                    } else {
                        System.out.println("Wrong number.");
                    }
                    break;
                default:
                    break;
            }
        }
    }

    private static void menu() {
        System.out.println ("\n1 - enter the coordinates of the vector from the console \n" +
                "2 - enter the coordinates of the vector from the file \n" +
                "3 - display vectors \n" +
                "4 - check for orthogonality / intersection of vectors \n" +
                "5 - compare vectors \n" +
                "6 - check for coplanar \n" +
                "0 - exit \n");
    }

}
