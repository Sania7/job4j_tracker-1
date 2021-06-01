package ru.job4j.tracker.pojo;


 // 3.2. Удаление моделей из массива. [#310016 #117288]
public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
            products[index] = products[index + 1];
        }
        products[products.length - 1] = null;
        return products;
    }
    public static void main(String[] args) {
        Product[] product = new Product[4];
        product[0] = new Product("Milk", 10);
        product[1] = new Product("Bread", 4);
        product[2] = new Product("Egg", 19);
        product[3] = new Product("Egg", 19);


        for (int i = 0; i < product.length; i++) {
            Product product1 = product[i];
            System.out.println(product1.getName());
        }
        product[1] = product[2];
        product[2] = null;
        product[3] = product[2];

        System.out.println();
        for (int i = 0; i < product.length; i++) {
            Product product1 = product[i];
            if (product1 != null) {
                System.out.println(product1.getName());
            } else {
                System.out.println("Null");
            }
        }
    }
}
