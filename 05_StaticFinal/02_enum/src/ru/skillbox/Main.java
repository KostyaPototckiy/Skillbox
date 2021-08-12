public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(5,6);

        System.out.println(arithmeticCalculator.calculate(Operation.MULTIPLY));
    }
}