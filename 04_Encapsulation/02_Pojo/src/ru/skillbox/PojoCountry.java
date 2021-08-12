public class Country {
    private String name;
    private int populationSize;
    private double countryArea;
    private String capital;
    private String landLocked;

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulationSize() {
        return populationSize;
    }

    public void setPopulationSize(int populationSize) {
        this.populationSize = populationSize;
    }

    public double getCountryArea() {
        return countryArea;
    }

    public void setCountryArea(double countryArea) {
        this.countryArea = countryArea;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getLandLocked() {
        return landLocked;
    }

    public void setLandLocked(String landLocked) {
        this.landLocked = landLocked;
    }
}