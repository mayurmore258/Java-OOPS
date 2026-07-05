package Basics;

import java.util.Scanner;

public class ShopingCart {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[10];
        int count = 0;

        while (true) {
            System.out.println("\n===== SHOPPING MENU =====");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Apply Discount");
            System.out.println("4. Calculate Total");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter product name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();

                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();

                    products[count] = new Product(name, price, quantity);
                    count++;

                    System.out.println("Product added!");
                    break;

                case 2:
                    System.out.println("\n--- Product List ---");
                    for (int i = 0; i < count; i++) {
                        products[i].display();
                    }
                    break;

                case 3:
                    System.out.print("Enter product index (0-based): ");
                    int index = sc.nextInt();

                    System.out.print("Enter discount %: ");
                    double discount = sc.nextDouble();

                    products[index].applyDiscount(discount);
                    System.out.println("Discount applied!");
                    break;

                case 4:
                    double total = 0;
                    for (int i = 0; i < count; i++) {
                        total += products[i].calculateTotal(products[i].discount);
                    }
                    System.out.println("Final Total Bill = " + total);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

class Product {
    String name;
    double price;
    int quantity;
    double discount;

    // Constructor overloading
    Product(String name) {
        this(name, 0, 1);
    }

    Product(String name, double price) {
        this(name, price, 1);
    }

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discount = 0;
    }

    void applyDiscount(double discount) {
        this.discount = discount;
    }

    double calculateTotal() {
        return price * quantity;
    }

    double calculateTotal(double discount) {
        double total = price * quantity;
        return total - (total * discount / 100);
    }

    void display() {
        System.out.println("\nProduct: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
    }
}
