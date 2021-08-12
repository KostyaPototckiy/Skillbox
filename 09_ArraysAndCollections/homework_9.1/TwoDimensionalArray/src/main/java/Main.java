public class Main {
    static final int size = 7;
    public static void main(String[] args) {
        //Распечатайте сгенерированный в классе TwoDimensionalArray.java двумерный массив
        char[][] array = TwoDimensionalArray.getTwoDimensionalArray(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
