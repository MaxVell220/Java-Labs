package TaskB;

import java.util.ArrayList;

public class City extends Locality implements CityActions {
    private boolean quarantine = false;
    private int sickPopulation = 50000;
    private boolean isRegionalCenter = false;
    private ArrayList<String> laws;

    City(String country, String location, String manager, String language, int foundationYear, int population, int budget) {
        super(country, location, manager, language, foundationYear, population, budget);
        this.laws = new ArrayList<>();
    }

    public int getSickPopulation() {
        return sickPopulation;
    }

    public boolean isQuarantine() {
        return quarantine;
    }

    public boolean isRegionalCenter() {
        return isRegionalCenter;
    }

    public void setSickPopulation(int sickPopulation) {
        this.sickPopulation = sickPopulation;
    }

    public void infoQuarantine() {
        if (isNeedQuarantine(super.getPopulation(), this.sickPopulation)) {
            this.quarantine = true;
        }
        System.out.println("City on quarantine");
    }

    public ArrayList<String> getLaws() {
        return laws;
    }

    @Override
    public void setNewLaw(String law) {
        laws.add(law);
    }

    @Override
    public void becomeRegionalCenter() {
        this.isRegionalCenter = true;
    }


    @Override
    public String toString() {
        return "City {" +
               "\nquarantine = " + quarantine +
               ", \nsickPopulation = " + sickPopulation +
               ", \nisRegionalCenter = " + isRegionalCenter +
               ", \nlaws = " + laws +
               super.toString();
    }
}
