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
      //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО
      String lettersList = "[А-Яа-я-]+";
      String regex = lettersList + "\\s" + lettersList + "\\s" + lettersList;
      boolean fullName = input.matches(regex);
      if (!fullName) {
        System.out.println("Введенная строка не является ФИО");
      }
      else {
        System.out.println("Фамилия: " + input.substring(0, input.indexOf(' ')));
        System.out.println("Имя: " + input.substring(input.indexOf(' '), input.lastIndexOf(' ')).trim());
        System.out.println("Отчество: " + input.substring(input.lastIndexOf(' ')).trim());
      }
    }
  }
}