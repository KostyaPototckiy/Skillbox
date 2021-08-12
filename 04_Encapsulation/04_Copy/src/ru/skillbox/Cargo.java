public class Cargo {
    private final double dimensions;
    private final double weight;
    private final String addres;
    private final String property; //Можно ли переворачивать?
    private final String regNumber;
    private final String fragility; //Является ли груз хрупким?


    public Cargo(double dimensions, double weight, String addres, String property, String regNumber, String fragility) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.addres = addres;
        this.property = property;
        this.regNumber = regNumber;
        this.fragility = fragility;
    }

    public Cargo setDimensions(double dimensions) {
        return new Cargo(dimensions, weight, addres, property, regNumber, fragility);
    }

    public Cargo setWeight(double weight) {
        return new Cargo(dimensions, weight, addres, property, regNumber, fragility);
    }

    public Cargo setAddres(String addres) {
        return new Cargo(dimensions, weight, addres, property, regNumber, fragility);
    }

    public Cargo setProperty(String property) {
        return new Cargo(dimensions, weight, addres, property, regNumber, fragility);
    }

    public Cargo setRegNumber(String regNumber) {
        return new Cargo(dimensions, weight, addres, property, regNumber, fragility);
    }

    public Cargo setFragility(String fragility){
        return new Cargo(dimensions, weight, addres, property, regNumber, fragility);
    }

    public double getDimensions() {
        return dimensions;
    }

    public double getWeight() {
        return weight;
    }

    public String getAddres() {
        return addres;
    }

    public String getProperty() {
        return property;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getFragility() {
        return fragility;
    }

    public String toString() {
        return dimensions + "\n" + "Масса груза: " + weight + "\n"
                + "Адрес доставки: " + addres + "\n"
                + "Можно ли переворачивать груз: " + property + "\n"
                + "Регистрационный номер: " + regNumber + "\n"
                + "Является ли груз хрупким: " + fragility;
    }
}