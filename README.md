# Practical Work 1 — Java Internet Shop

Console Java application that demonstrates:
- Product
- Category
- Cart
- Order
- catalog viewing
- adding products to the cart
- viewing the cart
- creating an order
- clearing the cart after order creation

The model classes use Lombok for constructors, getters, setters and `toString()`.

## Requirements
- JDK 21
- IntelliJ IDEA or VS Code with Java support
- Maven (IntelliJ can import the Maven project automatically)

## Run in IntelliJ IDEA
1. Open the folder as a Maven project.
2. Wait for Maven to download dependencies.
3. Open `src/main/java/shop/Main.java`.
4. Run `Main.main()`.

## Run from terminal
```bash
mvn clean package
mvn exec:java -Dexec.mainClass=shop.Main
```

If the `exec` plugin is not configured, run:
```bash
mvn clean package
java -cp target/classes shop.Main
```
