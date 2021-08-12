import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int day = 17;
        int month = 5;
        int year = 1997;

        System.out.println(collectBirthdays(year, month, day));

    }

    public static String collectBirthdays(int year, int month, int day) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy - E", Locale.ENGLISH);
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(year, month, day);
        String result = "";
        int number = 0;

        while (today.compareTo(birthday) >= 0) {
            result = result + number  + " - " + dateFormat.format(birthday) + System.lineSeparator();
            birthday = birthday.plusYears(1);
            number++;
        }


        //TODO реализуйте метод для построения строки в следующем виде
        //0 - 31.12.1990 - Mon
        //1 - 31.12.1991 - Tue
        
        return result;
    }
}
