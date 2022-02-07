package com.edabit.coffe_shop;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class CoffeeShop {
    private String name;
    private ArrayList<MenuItem> menu = new ArrayList<>();
    private ArrayList<String> orders = new ArrayList<>();

    public CoffeeShop(String name, MenuItem[] menu, String[] orders) {
        this.name = name;
        this.menu.addAll(Arrays.asList(menu));
        this.orders.addAll(Arrays.asList(orders));
    }

    public String addOrder(String order) {
        for (MenuItem item : menu) {
            String itemName = item.getItem();
            if (itemName.equals(order)) {
                this.orders.add(order);
                return "Order added!";
            }
        }
        return "This item is currently unavailable!";
    }

    public String fulfillOrder() {
        if (!this.orders.isEmpty()) {
            String item = orders.get(0);
            orders.remove(0);
            return "The " + item + " is ready!";
        } else {
            return "All orders have been fulfilled!";
        }
    }

    public String[] listOrders() {
        if (!orders.isEmpty()) {
            int size = orders.size();
            String[] tab = new String[size];
            for (int i = 0; i < orders.size(); i++) {
                tab[i] = orders.get(i);
            }
            return tab;
        } else return new String[]{};
    }

    public double dueAmount() {
        double sum = 0;
        for (String item : orders) {
            for (MenuItem menuItem : menu) {
                if (item.equals(menuItem.getItem())) {
                    sum += menuItem.getPrice();
                }
            }
        }
        return sum;
    }

    public String cheapestItem() {
        double value = 0;
        String itemName = null;
        for (MenuItem item : menu) {
            if (value == 0) {
                itemName = item.getItem();
                value = item.getPrice();
            }
            if (item.getPrice() < value) {
                itemName = item.getItem();
                value = item.getPrice();
            }
        }
        return itemName;
    }

    public String[] drinksOnly() {
        ArrayList<String> arr = new ArrayList<>();
        for (MenuItem item : menu) {
            if (item.getType().equals("drink")) {
                arr.add(item.getItem());
            }
        }
        String[] tab = new String[arr.size()];
        int i = 0;
        for (String item : arr) {
            tab[i] = item;
            i++;
        }
        return tab;
    }

    public String[] foodOnly() {
        ArrayList<String> arr = new ArrayList<>();
        for (MenuItem item : menu) {
            if (item.getType().equals("food")) {
                arr.add(item.getItem());
            }
        }
        String[] tab = new String[arr.size()];
        int i = 0;
        for (String item : arr) {
            tab[i] = item;
            i++;
        }
        return tab;
    }
}
