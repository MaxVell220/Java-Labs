package taskB;

import taskB.taskClasses.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class TaskB {
    public static void defiant() {
        Scanner in = new Scanner(System.in);
        ArrayList<Coffee> mass = new ArrayList<>();
        int key = 1;
        try {
            while (key != 0) {
                menu();
                key = in.nextInt();
                switch (key) {
                    case 1:
                        System.out.print("Enter number of elements: ");
                        int count = in.nextInt();
                        if (count <= 0) {
                            throw new Exception("Incorrect size");
                        }
                        String sort;
                        int price;
                        String typeOfPackaging;
                        int weight;
                        for (int i = 0; i < count; i++) {
                            System.out.println("""
                                    Choose type of coffee:
                                    1 - beans
                                    2 - ground coffee
                                    3 - instant coffee
                                    """);
                            int type = in.nextInt();
                            System.out.println("Enter data of the " + i + " element: ");
                            System.out.println("Enter sort of coffee: ");
                            sort = in.next();
                            if (sort == null) {
                                throw new Exception("Incorrect sort text.");
                            }
                            System.out.println("Enter price of one unit: ");
                            price = in.nextInt();
                            if (price <= 0) {
                                throw new Exception("Prise must be positive.");
                            }
                            System.out.println("Enter type of packaging: ");
                            typeOfPackaging = in.next();
                            if (typeOfPackaging == null) {
                                throw new Exception("Incorrect type text.");
                            }
                            System.out.println("Enter weight: ");
                            weight = in.nextInt();
                            if (weight <= 0) {
                                throw new Exception("Weight must be positive");
                            }
                            switch (type) {
                                case 1 -> mass.add(new Coffee_beans(sort, price, typeOfPackaging, weight));
                                case 2 -> mass.add(new Ground_coffee(sort, price, typeOfPackaging, weight));
                                case 3 -> mass.add(new Instant_coffee(sort, price, typeOfPackaging, weight));
                                default -> System.out.println("Incorrect type.");
                            }
                        }
                        break;
                    case 2:
                        System.out.println();
                        try {
                            File file = new File("D:/BSU/lab4/text-files-for-lab/coffee.txt");
                            FileReader fr = new FileReader(file);
                            BufferedReader reader = new BufferedReader(fr);
                            String type;
                            type = reader.readLine();
                            while (type != null) {
                                switch (type) {
                                    case "beans" -> {
                                        sort = reader.readLine();
                                        price = Integer.parseInt(reader.readLine());
                                        typeOfPackaging = reader.readLine();
                                        weight = Integer.parseInt(reader.readLine());
                                        mass.add(new Coffee_beans(sort, price, typeOfPackaging, weight));
                                    }
                                    case "ground" -> {
                                        sort = reader.readLine();
                                        price = Integer.parseInt(reader.readLine());
                                        typeOfPackaging = reader.readLine();
                                        weight = Integer.parseInt(reader.readLine());
                                        mass.add(new Ground_coffee(sort, price, typeOfPackaging, weight));
                                    }
                                    case "instant" -> {
                                        sort = reader.readLine();
                                        price = Integer.parseInt(reader.readLine());
                                        typeOfPackaging = reader.readLine();
                                        weight = Integer.parseInt(reader.readLine());
                                        mass.add(new Instant_coffee(sort, price, typeOfPackaging, weight));
                                    }
                                    default -> System.out.println("Incorrect type.");
                                }
                                type = reader.readLine();
                            }
                            fr.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 3:
                        int size;
                        System.out.println("Enter the load capacity of the van: ");
                        size = in.nextInt();
                        if (size <= 0) {
                            throw new Exception("Incorrect size.");
                        }
                        Van van = new Van(size);
                        van.fillVan(mass);
                        break;
                    case 4:
                        sort(mass);
                        System.out.println("Result of sorting: ");
                        for (Coffee iter : mass) {
                            System.out.println(iter);
                        }
                        break;
                    case 5:
                        System.out.println("Enter range of price: ");
                        int minPrice = in.nextInt();
                        int maxPrice = in.nextInt();
                        if (minPrice <= 0 || maxPrice <= 0 || maxPrice < minPrice) {
                            throw new Exception("Incorrect price.");
                        }
                        System.out.println("Enter range of weight: ");
                        int minWeight = in.nextInt();
                        int maxWeight = in.nextInt();
                        if (minWeight <= 0 || maxWeight < minWeight) {
                            throw new Exception("Incorrect weight");
                        }
                        find(mass, minPrice, maxPrice, minWeight, maxWeight);
                        break;
                    case 6:
                        for (Coffee iter : mass) {
                            System.out.println(iter);
                        }
                        break;
                    default:
                        System.out.println("Incorrect key.");
                }
            }
            in.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void menu() {
        System.out.println("""

                1 - add coffee
                2 - add coffee from file
                3 - fill the van
                4 - sort elements by price adn weight
                5 - find element from range
                6 - show all
                0 - exit
                """);
    }

    private static void sort(ArrayList<Coffee> coffees) {
        Comparator<Coffee> comparator =  Comparator.comparingInt(o -> o.getWeight() * o.getPrice());
        coffees.sort(comparator);
    }

    private static void find(ArrayList<Coffee> coffees, int minPrice, int maxPrice,
                             int minWeight, int maxWeight) {
        int counter = 0;
        for (Coffee iter : coffees) {
            if (iter.getPrice() >= minPrice && iter.getPrice() <= maxPrice) {
                if (iter.getWeight() >= minWeight && iter.getWeight() <= maxWeight) {
                    System.out.println(iter);
                    counter++;
                }
            }
        }
        if (counter == 0) {
            System.out.println("Not found");
        }
    }
}
