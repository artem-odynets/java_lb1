package shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Category electronics = new Category(1, "Електроніка");
        Category smartphones = new Category(2, "Смартфони");
        Category accessories = new Category(3, "Аксесуари");

        Product product1 = new Product(
                1,
                "Ноутбук",
                19999.99,
                "Високопродуктивний ноутбук для роботи та ігор",
                electronics
        );

        Product product2 = new Product(
                2,
                "Смартфон",
                12999.50,
                "Смартфон з великим екраном та високою автономністю",
                smartphones
        );

        Product product3 = new Product(
                3,
                "Навушники",
                2499.00,
                "Бездротові навушники з шумозаглушенням",
                accessories
        );

        Cart cart = new Cart();

        while (true) {
            System.out.println("\n================================");
            System.out.println("      ІНТЕРНЕТ-МАГАЗИН");
            System.out.println("================================");
            System.out.println("1 - Переглянути список товарів");
            System.out.println("2 - Додати товар до кошика");
            System.out.println("3 - Переглянути кошик");
            System.out.println("4 - Зробити замовлення");
            System.out.println("0 - Вийти");
            System.out.print("Оберіть опцію: ");

            int choice;

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Введіть число.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("\nСписок товарів:");
                    System.out.println(product1);
                    System.out.println(product2);
                    System.out.println(product3);
                    break;

                case 2:
                    System.out.print("Введіть ID товару для додавання до кошика: ");

                    int id;

                    try {
                        id = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("ID повинен бути числом.");
                        break;
                    }

                    if (id == 1) {
                        cart.addProduct(product1);
                    } else if (id == 2) {
                        cart.addProduct(product2);
                    } else if (id == 3) {
                        cart.addProduct(product3);
                    } else {
                        System.out.println("Товар з таким ID не знайдено.");
                    }
                    break;

                case 3:
                    cart.printCart();
                    break;

                case 4:
                    if (cart.isEmpty()) {
                        System.out.println("Кошик порожній. Додайте товари перед оформленням замовлення.");
                    } else {
                        Order order = new Order(cart);
                        System.out.println("Замовлення оформлено:");
                        order.printOrder();
                        cart.clear();
                        System.out.println("Кошик очищено.");
                    }
                    break;

                case 0:
                    System.out.println("Дякуємо, що використовували наш магазин!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Невідома опція. Спробуйте ще раз.");
            }
        }
    }
}
