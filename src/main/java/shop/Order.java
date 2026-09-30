package shop;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Order {
    private List<Product> products;
    private double totalPrice;
    private String status;

    public Order(Cart cart) {
        this.products = new ArrayList<>(cart.getProducts());
        this.totalPrice = cart.getTotalPrice();
        this.status = "Нове";
    }

    public void printOrder() {
        System.out.println("\nЗамовлення:");
        for (Product product : products) {
            System.out.println(product);
        }

        System.out.printf("Загальна вартість: %.2f грн%n", totalPrice);
        System.out.println("Статус: " + status);
    }
}
