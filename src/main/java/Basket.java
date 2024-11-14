import javax.swing.*;

public class Basket {
    private int limit = 1_000_000;
    private int totalPrice = 0;
    private String items = "";
    private static int countBaskets = 0;

    public Basket() {
        items += "Список товаров: ";
        countBaskets++;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public void add(String name, int price, int count) {
        price = price * count;
        if (totalPrice + price >= limit) {
            return;
        } else if (containsItem(name)) {
            return;
        } else if (items.isEmpty()) {
            items += name + " - " + price + " rub";
            totalPrice += price;
        } else {
            items += "\n" + name + " - " + price + " rub";
            totalPrice += price;
        }
    }

    public void add(String name, int price){
        add(name, price, 1);
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста!");
        } else {
            System.out.println(items);
        }
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean containsItem(String name) {
        return items.contains(name);
    }

    public static int getCountBaskets() {
        return countBaskets;
    }
}