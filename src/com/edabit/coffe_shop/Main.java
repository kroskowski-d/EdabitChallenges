package com.edabit.coffe_shop;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MenuItem[] menu = new MenuItem[] {
                new MenuItem("orange juice", "drink", 2.13), new MenuItem("lemonade", "drink", 0.85), new MenuItem("cranberry juice", "drink", 3.36),
                new MenuItem("pineapple juice", "drink", 1.89), new MenuItem("lemon iced tea", "drink", 1.28), new MenuItem("apple iced tea", "drink", 1.28),
                new MenuItem("vanilla chai latte", "drink", 2.48), new MenuItem("hot chocolate", "drink", 0.99), new MenuItem("iced coffee", "drink", 1.12),
                new MenuItem("tuna sandwich", "food", 0.95), new MenuItem("ham and cheese sandwich", "food", 1.35), new MenuItem("bacon and egg", "food", 1.15),
                new MenuItem("steak", "food", 3.28), new MenuItem("hamburger", "food", 1.05), new MenuItem("cinnamon roll", "food", 1.05) };
        CoffeeShop shop = new CoffeeShop("Deep Into Coffee", menu, new String[] {});

        System.out.println(shop.addOrder("tuna sandwich"));
        System.out.println(shop.addOrder("hot chocolate"));
        System.out.println(shop.dueAmount());
        System.out.println(Arrays.toString(shop.listOrders()));
        System.out.println(shop.fulfillOrder());
        System.out.println(shop.fulfillOrder());
        System.out.println(shop.cheapestItem());
        System.out.println(Arrays.toString(shop.drinksOnly()));
        System.out.println(Arrays.toString(shop.foodOnly()));
    }
}
