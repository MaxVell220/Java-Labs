package TaskB;

public class Village extends Locality implements VillageActions {
    public boolean isWorkingVillage;

    public Village() {
        this.isWorkingVillage = true;
    }

    public Village(String country, String location, String manager, String language, int foundationYear, int population, int budget, boolean isWorkingVillage) {
        super(country, location, manager, language, foundationYear, population, budget);
        this.isWorkingVillage = isWorkingVillage;
    }

    @Override
    public void setWorkingVillage() {
        this.isWorkingVillage = !this.isWorkingVillage;
    }

    @Override
    public String toString() {
        return "Village {" +
               "isWorkingVillage=" + isWorkingVillage +
               "} " + super.toString();
    }
}
