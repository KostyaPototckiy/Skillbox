public class Arithmetic {

    private int number1;
    private int number2;


    public Arithmetic(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getSumOfNumbers() {
        return number1 + number2;
    }

    public int getDifferenceOfNumbers() {
        return number1 - number2;
    }

    public int getProductOfNumbers() {
        return number1 * number2;
    }

    public int getAverageValueOfNumbers() {
        return  (number1 + number2) / 2;
    }

    public int getMaxOfNumbers() {
        if (number1 >= number2) {
            return number1;
        }
        return number2;
    }

    public int getMinOfNumbers() {
        if (number1 <= number2) {
            return number1;
        }
        return number2;
    }

    public void print(String title) {
        System.out.println(title);
        System.out.println("Сумма чисел: " + getSumOfNumbers());
        System.out.println("Разность чисел: " + getDifferenceOfNumbers());
        System.out.println("Произведение чисел: " + getProductOfNumbers());
        System.out.println("Среднее значение чисел: " + getAverageValueOfNumbers());
        System.out.println("Максимальное число: " + getMaxOfNumbers());
        System.out.println("Минимальное число: " + getMinOfNumbers());
    }
}