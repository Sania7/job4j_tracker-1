package ru.job4j.tracker.pojo;

public class Shop {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.print(product.getName() + " ");
            }
        }
        int rsl;
        for (int i = 0; i < products.length; i++) {
            Product product1 = products[i];
            if (product1 == null) {
                System.out.print(product1 + " ");
            }
        }
    }
}
