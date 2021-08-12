public class Printer {

    private String queue = "Список документов на печать: ";
    private int pagesCount = 0;
    private int documentsCount = 0;
    private String allStatisticDocuments;
    
    public void append(String text) {
        append(text, "", 0);
    }

    public void append(String text, String name) {
        append(text, name, 0);
    }

    public void append(String text, String name, int count) {
        queue = queue + "\n" + text + " - Текст документа" + "\n" +
                name + " - Имя документа" + "\n" + count + " - кол-во страниц" + "\n";
        documentsCount++;
        pagesCount = pagesCount + count;
        allStatisticDocuments = "Общая статистика: " + "\n" + "Общее количество документов: " + documentsCount +
                "\n" + "Общее количество страниц: " + pagesCount;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public int getDocumentsCount() {
        return documentsCount;
    }

    public String getAllStatisticDocuments() {
        return allStatisticDocuments;
    }

    public void clear() {
        queue = "Пусто";
        pagesCount = 0;
        documentsCount = 0;
    }

    public void print(String title) {
        System.out.println(title);
        System.out.println(queue);
        System.out.println("Общее количество документов на печати: " + getDocumentsCount() + " шт.");
        System.out.println("Общее количество страниц на печати: " + getPagesCount() + " шт." + "\n");
        System.out.println(getAllStatisticDocuments() + "\n");
        clear();
        System.out.println(title);
        System.out.println(queue);
        System.out.println("Общее количество документов на печати: " + getDocumentsCount() + " шт.");
        System.out.println("Общее количество страниц на печати: " + getPagesCount() + " шт.");
        System.out.println("\n" + getAllStatisticDocuments());
    }
}