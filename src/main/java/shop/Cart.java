package shop;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Cart {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Товар додано до кошика: " + product.getName());
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public double getTotalPrice() {
        double total = 0;

        for (Product product : products) {
            total += product.getPrice();
        }

        return total;
    }

    public void clear() {
        products.clear();
    }

    public boolean isEmpty() {
        return products.isEmpty();
    }

    public void printCart() {
        if (products.isEmpty()) {
            System.out.println("Кошик порожній.");
            return;
        }

        System.out.println("\nКошик містить:");
        for (Product product : products) {
            System.out.println(product);
        }

        System.out.printf("Загальна вартість: %.2f грн%n", getTotalPrice());
    }
}
