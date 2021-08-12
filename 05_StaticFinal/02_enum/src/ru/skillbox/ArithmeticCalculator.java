public class ArithmeticCalculator {
    public static int x;
    public static int y;

    public ArithmeticCalculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int calculate(Operation operation) {
        if (operation == Operation.ADD) {
            return x + y;
        }
        if (operation == Operation.SUBTRACT) {
            return x - y;
        }
        if (operation == Operation.MULTIPLY) {
               return x * y;
        }
        return 0;
    }
}