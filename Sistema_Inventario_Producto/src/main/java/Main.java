package inventory;

import inventory.products.Inventory;
import inventory.products.Product;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);

        Product product1 = new Product("001", "Laptop", 5, 750.00);
        Product product2 = new Product("002", "Mouse", 10, 25.00);
        Product product3 = new Product("003", "Keyboard", 0, 30.00);

        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        inventory.displayInventory();

        System.out.println("Would you like to remove a product from the inventory? (yes/no)");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Enter the product code to remove:");
            String code = scanner.nextLine();
            inventory.removeProduct(code);
        }

        inventory.displayInventory();
        scanner.close();
    }
}
