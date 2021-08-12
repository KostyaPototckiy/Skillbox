import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }
      //TODO:напишите ваш код тут, результат вывести в консоль.
      //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО // 32-пробел, 45-дефис
      int countSpace = 0;

      for (int i = 0; i < input.length(); i++) {
        char symbol = input.charAt(i);

        if (Character.isWhitespace(symbol)) {
          countSpace++;
        }

        if (Character.isDigit(symbol)) {
          countSpace = 0;
        }
      }
      if (countSpace == 2 || Character.isDefined(input.indexOf('-'))) {
        System.out.println("Фамилия: " + input.substring(0, input.indexOf(' ')));
        System.out.println("Имя: " + input.substring(input.indexOf(' '), input.lastIndexOf(' ')).trim());
        System.out.println("Отчество: " + input.substring(input.lastIndexOf(' ')).trim());
      }
      else {
        System.out.println("Введенная строка не является ФИО");
      }
    }
  }
}
