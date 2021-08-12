public class Main {

    public static void main(String[] args) {
        Printer svetaPrinter = new Printer();
        
        svetaPrinter.append("Привет", "файл", 1);
        svetaPrinter.append("Пока");
        svetaPrinter.append("Как дела?", "Пробник");
        svetaPrinter.append("Конспект", "Учеба", 163);
        
        svetaPrinter.print("Список Светы: ");
    }
}