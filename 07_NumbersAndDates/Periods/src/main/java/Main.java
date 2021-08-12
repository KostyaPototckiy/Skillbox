import java.time.LocalDate;
import java.time.Period;

public class Main {

  public static void main(String[] args) {
    System.out.println(getPeriodFromBirthday(LocalDate.EPOCH));
  }

  private static String getPeriodFromBirthday(LocalDate birthday) {
    LocalDate today = LocalDate.now();
    birthday = LocalDate.EPOCH;
    String result = "";
    Period period = Period.between(birthday, today);
    result = result + period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays()
            + " days";
    return result;
  }
}
