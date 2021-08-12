public class Keyboard {
    private static String type; // Тип
    private static boolean backlight; // Наличие подсветки
    private static int weight; // Вес

    public Keyboard(String type, boolean backlight, int weight) {
        this.type = type;
        this.backlight = backlight;
        this.weight = weight;
    }

    public static String getType() {
        return type;
    }

    public static boolean isBacklight() {
        return backlight;
    }

    public static int getWeight() {
        return weight;
    }

    public static String getAllInformation() {
        return "Тип - " + getType() + "; " + "Наличие подсветки - "
                + isBacklight() + "; " + "Вес - " + getWeight() + ";";
    }
}