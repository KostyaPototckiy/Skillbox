public class Main {

  public static void main(String[] args) {
    String letter = "What makes every 50American a 3 typical one is a desire to get a well-paid job that will cover their credit card. A credit card is an indispensable part of life in America. In other words, any American knows that how he or she handles their credit card or cards, either will help them or haunt them for years.";
    System.out.println(splitTextIntoWords(letter));
  }

  public static String splitTextIntoWords(String text) {
    //TODO реализуйте метод
    String allWords = "";
    String regex = "[0-9.,;:!?-]";
    text = text.replaceAll(regex, " ");
    String[] words = text.split("\\s+");
    for (int i = 0; i < words.length; i++) {
      allWords += "\n" + words[i];
    }
    allWords = allWords.trim();
    return allWords;
  }
}