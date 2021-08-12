public class Main {

    public static void main(String[] args) {
        Basket kostyaBasket = new Basket();
        kostyaBasket.add("Молоко", 40, 1);
        kostyaBasket.add("Лопата", 250,2, 1.2);
        kostyaBasket.add("Бочка", 3000, 2, 10);
        kostyaBasket.add("Салфетки", 100, 3);
        kostyaBasket.add("Шашлык", 1900, 1, 3);
        kostyaBasket.add("Шампуры", 200, 2);

        Basket vasyaBasket = new Basket();
        vasyaBasket.add("Кетчуп", 60, 1);
        vasyaBasket.add("Хлеб", 45, 2);
        vasyaBasket.add("Лодка", 10000, 1, 100);

        kostyaBasket.print("Корзина Кости:");
        vasyaBasket.print("\n" + "Корзина Васи:");
        System.out.println("\n" + "Общая стоимость всех корзин: " + Basket.getAllTotalPrice() + " руб.");
        System.out.println("Общее количество товаров всех корзин: " + Basket.getTotalCount() + " шт.");
        System.out.println("Средняя цена товара во всех корзинах: " + Basket.getAveragePrice() + " руб.");
        System.out.println("Средняя стоимость корзины: " + Basket.getAveragePriceBasket() + " руб.");
    }
}