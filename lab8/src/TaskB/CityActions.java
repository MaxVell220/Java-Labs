package TaskB;

public interface CityActions extends LocalityActions{
    default boolean isNeedQuarantine(int population, int sickPopulation) {
        double percent = (sickPopulation / population) * 100;
        return percent >= 30;
    }

    public void setNewLaw(String law);

    public void becomeRegionalCenter();
}
