public class Screen {  //Экран
    private static int diagonal; // Диагональ
    private static String type; // Тип
    private static int weight; // Вес

    public Screen(int diagonal, String type, int weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    public static int getDiagonal() {
        return diagonal;
    }

    public static String getType() {
        return type;
    }

    public static int getWeight() {
        return weight;
    }

    public static String getAllInformation() {
        return "Диагональ - " + getDiagonal() + "; " + "Тип - " + getType() + "; "
                + "Вес - " + getWeight() + ";";
    }
}
