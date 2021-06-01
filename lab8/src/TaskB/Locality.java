package TaskB;

import java.util.ArrayList;

public class Locality implements LocalityActions {
    private String country;
    private String location;
    private String manager;
    private String language;
    private int foundationYear;
    private int population;
    private int budget;

    public Locality(String country, String location, String manager, String language, int foundationYear, int population, int budget) {
        this.country = country;
        this.location = location;
        this.manager = manager;
        this.language = language;
        this.foundationYear = foundationYear;
        this.population = population;
        this.budget = budget;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public Locality() {
        this.country = "";
        this.location = "";
        this.manager = "";
        this.language = "";
        this.foundationYear = 0;
        this.population = 0;
        this.budget = 0;
    }

    public void selectManager(ArrayList<String> managers) {
        this.manager = selectNewManager(managers);
    }


    @Override
    public String toString() {
        return "\ncountry = " + country +
               ", \nlocation = " + location +
               ", \nmanager = " + manager +
               ", \nlanguage = " + language +
               ", \nfoundationYear = " + foundationYear +
               ", \npopulation = " + population +
               ",\nbudget = " + budget +
               " }";
    }

    @Override
    public void showInfo() {
        System.out.println(this.toString());
    }

    @Override
    public void changePopulation(int times, boolean isEnlarge) {
        if (isEnlarge) {
            this.population *= times;
        } else {
            this.population /= times;
        }
    }

    @Override
    public void changeBudget(int times, boolean isEnlarge) {
        if (isEnlarge) {
            this.budget *= times;
        } else {
            this.budget /= times;
        }
    }
}
