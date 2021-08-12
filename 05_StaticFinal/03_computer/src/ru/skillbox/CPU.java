public class CPU { //Процессор
    private static int frequency; // Частота
    private static int numberOfCores; // Количество ядер
    private static String vendor; // Производитель
    private static int weight; // Вес

    public CPU(int frequency, int numberOfCores, String vendor, int weight) {
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
        this.vendor = vendor;
        this.weight = weight;
    }

    public static int getFrequency() {
        return frequency;
    }

    public static int getNumberOfCores() {
        return numberOfCores;
    }

    public static String getVendor() {
        return vendor;
    }

    public static int getWeight() {
        return weight;
    }

    public static String getAllInformation() {
        return "Частота - " + getFrequency() + "; " + "Количество ядер - " + getNumberOfCores() + "; "
                + "Производитель - " + getVendor() + "; " + "Вес - " + getWeight() + ";";
    }
}