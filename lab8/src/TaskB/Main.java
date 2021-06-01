package TaskB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        City city = new City("USA", "North America", "Taylor",
                "English", 1720, 12555050, 20000500);
        city.showInfo();
        String[] managerArray = new String[]{"Tom", "Pol", "Raider", "Some men"};
        ArrayList<String> managers = new ArrayList<>();
        System.out.println("Select new mayor:");
        System.out.println("Old mayor " + city.getManager());
        managers.addAll(Arrays.asList(managerArray));
        city.selectManager(managers);
        System.out.println("New mayor " + city.getManager());
        System.out.println("\nPopulation before: " + city.getPopulation());
        city.changePopulation(5, false);
        System.out.println("Population after: " + city.getPopulation());
        System.out.println("\nBudget before: " + city.getBudget());
        city.changeBudget(5, true);
        System.out.println("Budget after: " + city.getBudget());
        System.out.println("\nStatus before: " + city.isQuarantine());
        city.isNeedQuarantine(city.getPopulation(), city.getSickPopulation());
        System.out.println("Status after: " + city.isQuarantine());

        System.out.println("Add new law: ");
        Scanner in = new Scanner(System.in);
        String law = in.nextLine();
        city.setNewLaw(law);
        System.out.println("Laws: " + city.getLaws());
    }
}
