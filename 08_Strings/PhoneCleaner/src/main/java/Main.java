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
      String format = "";
      String regex = "[^0-9]";
      format = input.replaceAll(regex, "");
      String regex2 = "[7-8]?[0-9]{10}";
      boolean formatter = format.matches(regex2);
      if (!formatter) {
        System.out.println("Неверный формат номера");
      }
      else if (format.length() == 10){
        System.out.println("7" + format);
      }
      else {
        boolean start = format.startsWith("8");
        if (start) {
          StringBuilder result = new StringBuilder(format);
          result.setCharAt(0, '7');
          System.out.println(result);
        }
        else System.out.println(format);
      }
    }
  }
}
