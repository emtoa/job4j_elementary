package ru.job4j.pojo;

public class Shop {
    public static Product[] delete(Product[] products, int index){
        for (int i=index; i < products.length-1; i++){
            products[i] = products[i+1];
        }
        products[products.length-1] = null;
        return products;
    }

    public static void main(String[] args) {
        Product products[] = new Product[5];
        products[0] = new Product("Milk", 10);
        products[2] = new Product("Bread", 4);
        products[3] = new Product("Egg", 19);
        products[4] = new Product("Cheese", 9);

        // демонстрация домашнего задания
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            //проверяем, что объект не равен null. так как  у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
        System.out.println("############################################################");
       products = delete(products, 1);

        // демонстрация домашнего задания
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            //проверяем, что объект не равен null. так как  у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
    }
}