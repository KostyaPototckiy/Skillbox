public class Main {

  public static void main(String[] args) {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    //TODO: напишите ваш код, результат вывести в консоль

    int sumVasya = Integer.parseInt(getEncodingVasya(text));
    int sumPetya = Integer.parseInt(getEncodingPetya(text));
    int sumMasha = Integer.parseInt(getEncodingMasha(text));
    System.out.println(sumVasya + sumPetya + sumMasha);
  }

  public static String getEncodingVasya(String money) {
    String charsetStr = "заработал ";
    int start = money.indexOf(charsetStr) + charsetStr.length();
    int end = money.indexOf(" рублей", start);
    String encoding = money.substring(start, end);
    return encoding;
  }

  public static String getEncodingPetya(String money) {
    String charsetStr = " - ";
    int start = money.indexOf(charsetStr) + charsetStr.length();
    int end = money.indexOf(" рубля", start);
    String encoding = money.substring(start, end);
    return encoding;
  }

  public static String getEncodingMasha(String money) {
    String charsetStr = "Маша - ";
    int start = money.indexOf(charsetStr) + charsetStr.length();
    int end = money.indexOf(" рублей", start);
    String encoding = money.substring(start, end);
    return encoding;
  }

}