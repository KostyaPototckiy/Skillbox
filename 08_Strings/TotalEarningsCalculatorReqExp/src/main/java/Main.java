import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {
    String letter = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    System.out.println(calculateSalarySum(letter));
  }

  public static int calculateSalarySum(String text){
    //TODO: реализуйте метод
    int summa = 0;
    String regex = "[0-9]+";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(text);
    while (matcher.find()) {
      int start = matcher.start();
      int end = matcher.end();
      summa = summa + Integer.parseInt(text.substring(start,end));
    }
    return summa;
  }
}