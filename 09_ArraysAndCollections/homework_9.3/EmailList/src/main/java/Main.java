import java.util.Scanner;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";
    public static EmailList list = new EmailList();
    
    /* TODO:
        Пример вывода списка Email, после ввода команды LIST в консоль:
        test@test.com
        hello@mail.ru
        - каждый адрес с новой строки
        - список должен быть отсортирован по алфавиту
        - email в разных регистрах считается одинаковыми
           hello@skillbox.ru == HeLLO@SKILLbox.RU
        - вывод на печать должен быть в нижнем регистре
           hello@skillbox.ru
        Пример вывода сообщения об ошибке при неверном формате Email:
        "Неверный формат email"
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Введите команду: ADD, LIST...");
            String input = scanner.nextLine();
            String[] text = input.split("\\s+");

            if (input.equals("0")) {
                break;
            }

            switch (text[0]) {

                case "ADD" : {
                    list.add(text[1]);
                }
                    break;

                case "LIST" : {
                    list.getPrint();
                }
                    break;
            }
        }
    }
}
