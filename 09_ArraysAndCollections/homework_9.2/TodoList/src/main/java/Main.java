import java.util.Scanner;

public class Main {
    private static TodoList list = new TodoList();

    public static void main(String[] args) {
        // TODO: написать консольное приложение для работы со списком дел todoList
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String regex = "[-]?[0-9]+";
            System.out.println("Введите команду: LIST, ADD, EDIT, DELETE...");
            String text = scanner.nextLine();
            String[] input = text.split("\\s+");
            String command = input[0];

            switch (command) {

                case "ADD":
                    if (input[1].matches(regex)) {
                        String[] result = text.split(" ", 3);
                        String index = result[1];
                        String todo = result[2];
                        list.add(Integer.parseInt(index), todo);
                    } else {
                        String[] result = text.split(" ", 2);
                        String todo = result[1];
                        list.add(todo);
                    }
                    break;

                case "DELETE":
                    if (input[1].matches(regex)) {
                        String[] result = text.split(" ", 2);
                        String index = result[1];
                        list.delete(Integer.parseInt(index));
                    }
                    break;

                case "EDIT":
                    if (input[1].matches(regex)) {
                        String[] result = text.split(" ", 3);
                        String index = result[1];
                        String todo = result[2];
                        list.edit(todo, Integer.parseInt(index));
                    }
                    break;

                case "LIST":
                    String[] result = new String[list.todoList.size()];
                    for (int i = 0; i < list.todoList.size(); i++) {
                        result[i] = list.todoList.get(i);
                        System.out.println(i + " - " + result[i]);
                    }
                    break;
            }
        }
    }
}
