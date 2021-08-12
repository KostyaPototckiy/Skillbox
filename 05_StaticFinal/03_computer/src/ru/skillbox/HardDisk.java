public class HardDisk {  // Жесткий диск
    private static String type; // Тип
    private static int volume; // Объем
    private static int weight; // Вес

    public HardDisk(String type, int volume, int weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public static String getType() {
        return type;
    }

    public static int getVolume() {
        return volume;
    }

    public static int getWeight() {
        return weight;
    }

    public static String getAllInformation() {
        return "Тип - " + getType() + "; " + "Объем - " + getVolume() + "; "
                + "Вес - " + getWeight() + ";";
    }
}
