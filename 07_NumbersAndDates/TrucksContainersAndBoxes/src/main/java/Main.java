import java.util.Scanner;

public class Main {
    public static final int boxesInContainer = 27;
    public static final int containersInTrucks = 12;

    public static void main(String[] args) {
        int containersNumber = 0;
        int trucksNumber = 0;
        Scanner scanner = new Scanner(System.in);
        String boxes = scanner.nextLine();
        double boxesCount = Integer.parseInt(boxes);


        for (int i = 1; i <= boxesCount; i++) {
            if (i % (boxesInContainer * containersInTrucks) == 1) {
                trucksNumber += 1;
                System.out.println("Грузовик: " + trucksNumber);
            }
            if (i % boxesInContainer == 1) {
                containersNumber += 1;
                System.out.println("\tКонтейнер: " + containersNumber);
            }
            System.out.println("\t\tЯщик: " + i);
        }
        System.out.println("Необходимо:" + "\r\n" + "грузовиков - " +
                trucksNumber + " шт." + "\r\n" + "контейнеров - " + containersNumber + " шт.");

        // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
        // пример вывода при вводе 2
        // для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */
    }
}
