public class GeometryCalculator {
    private static double semiPerimeterTriangle;
    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radius) {
        return Math.abs (Math.PI * Math.pow(radius, 2));
    }

    // метод должен использовать абсолютное значение radius
    public static double getSphereVolume(double radius) {
        return Math.abs (4.0 / 3.0 * Math.PI * Math.pow(radius, 3));
    }

    public static boolean isTrianglePossible(double a, double b, double c) {
        if (a + b <= c | a + c <= b | b + c <= a) {
            return false;
        }
        return true;
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTrianglePossible, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        if (!isTrianglePossible(a, b, c)) {
            return -1.0;
        }
        semiPerimeterTriangle = (a + b + c) / 2;
        return Math.sqrt(semiPerimeterTriangle * (semiPerimeterTriangle - a) * (semiPerimeterTriangle - b) *
                (semiPerimeterTriangle - c));
    }
}
