package com.example.inheritance;

public class Main04 {
    public static void main(String[] args) {
        Product product = new Product("Apple", 15.00);
        Product product2 = new Product("Banana", 10.00);
        System.out.println(product.getId());
        System.out.println(product2.getId());

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(product2, 3);
        shoppingCart.addProduct(product, 2);
        System.out.println(shoppingCart.getTotalQuantity());
        System.out.println(shoppingCart.getTotalSum());
        shoppingCart.printReceipt();
    }
}
