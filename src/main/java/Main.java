import java.util.stream.BaseStream;

public class Main {
    public static void main(String[] args) {
        Basket danilaBasket = new Basket();
        danilaBasket.add("1 кг Креветок", 700, 2);
        danilaBasket.add("1 кг Мандаринок", 200, 3);
        danilaBasket.add("1 кг Винограда", 250, 2);
        danilaBasket.add("Мармеладки", 120, 1);
        danilaBasket.add("Кукурузные палочки", 80, 2);
        danilaBasket.print("Содержание корзины: ");
        danilaBasket.clear();
        danilaBasket.print("Содержание второй корзины: ");

        System.out.println();

        Basket petyaBasket = new Basket(3000);
        petyaBasket.add("Лопата", 2000);
        petyaBasket.add("Бочка", 3100);
        petyaBasket.print("Содержание корзины Пети: ");

        System.out.println();

        Basket mashaBasket = new Basket();
        mashaBasket.add("Стол, стиральный порошок", 12_000);

        System.out.println();
        System.out.println("Кол-во корзин равно: " + Basket.getCountBaskets());
    }
}