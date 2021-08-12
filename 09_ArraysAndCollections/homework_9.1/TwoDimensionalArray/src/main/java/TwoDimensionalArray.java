public class TwoDimensionalArray {
    public static char symbol = 'X';

    public static char[][] getTwoDimensionalArray(int size) {

        //TODO: Написать метод, который создаст двумерный массив char заданного размера.
        // массив должен содержать символ symbol по диагоналям, пример для size = 3
        // [X,  , X]
        // [ , X,  ]
        // [X,  , X]

        char[][] result = new char[size][size];
        int j = 0;
        int i;
        for (i = 0; i < result.length; i++) {
            result[i][j] = symbol;
            j++;
            result[i][result.length - j] = symbol;
        }

        for (i = 0; i < result.length; i++) {
            for (j = 0; j < result[i].length; j++) {
                if (result[i][j] != symbol) {
                    result[i][j] = ' ';
                }
            }
        }
        return result;
    }
}
