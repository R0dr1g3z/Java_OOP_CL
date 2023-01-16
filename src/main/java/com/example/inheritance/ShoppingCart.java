package com.example.inheritance;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<CartItem> cartItems = new ArrayList<>();

    public void addProduct(Product product, int quantity) {
        cartItems.add(new CartItem(product, quantity));
    }

    public void removeProduct(Product product) {
        cartItems.remove(product);
    }

    public int getTotalQuantity() {
        int total = 0;
        for (CartItem c : cartItems) {
            total += c.getQuantity();
        }
        return total;
    }

    public double getTotalSum() {
        double total = 0d;
        for (CartItem c : cartItems) {
            total += c.getProduct().getPrice() * c.getQuantity();
        }
        return total;
    }

    public void printReceipt() {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        double cost = 0;
        for (CartItem c : cartItems) {
            double sumProduct = c.getProduct().getPrice() * c.getQuantity();
            cost += sumProduct;
            sb.append(String.format("%s: %s - %.2f x %s = %.2f \n", count, c.getProduct().getName(),
                    c.getProduct().getPrice(), c.getQuantity(), sumProduct));
            count++;
        }
        sb.append("----------\n");
        sb.append(String.format("Razem: %.2f", cost));
        System.out.println(sb);
    }
}
