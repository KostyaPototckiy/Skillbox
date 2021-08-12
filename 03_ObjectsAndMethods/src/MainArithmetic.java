public class Main {
    public static void main(String[] args) {
        Arithmetic kostyaArithmetic = new Arithmetic(5,20);

        kostyaArithmetic.getSumOfNumbers();
        kostyaArithmetic.getDifferenceOfNumbers();
        kostyaArithmetic.getProductOfNumbers();
        kostyaArithmetic.getAverageValueOfNumbers();
        kostyaArithmetic.getMaxOfNumbers();
        kostyaArithmetic.getMinOfNumbers();

        Arithmetic vasyaArithmetic = new Arithmetic(15,2);

        vasyaArithmetic.getSumOfNumbers();
        vasyaArithmetic.getDifferenceOfNumbers();
        vasyaArithmetic.getProductOfNumbers();
        vasyaArithmetic.getAverageValueOfNumbers();
        vasyaArithmetic.getMaxOfNumbers();
        vasyaArithmetic.getMinOfNumbers();


        kostyaArithmetic.print("Арифметика Кости:");
        System.out.println();
        vasyaArithmetic.print("Арифметика Васи:");
    }
}