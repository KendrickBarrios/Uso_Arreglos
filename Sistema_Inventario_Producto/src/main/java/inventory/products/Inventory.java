package inventory.products;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        for (Product p : products) {
            if (p.getCode().equals(product.getCode())) {
                System.out.println("The product with code " + product.getCode() + " already exists.");
                return;
            }
        }
        products.add(product);
        System.out.println("Product added: " + product.getName());
    }

    public void updateQuantity(String code, int newQuantity) {
        for (Product p : products) {
            if (p.getCode().equals(code)) {
                p.setQuantity(newQuantity);
                System.out.println("Quantity updated for product: " + p.getName());
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public void removeProductsWithZeroQuantity() {
        products.removeIf(product -> product.getQuantity() == 0);
        System.out.println("Products with quantity 0 removed.");
    }

    public void displayInventory() {
        if (products.isEmpty()) {
            System.out.println("The inventory is empty.");
        } else {
            System.out.println("Inventory:");
            for (Product p : products) {
                p.displayInfo();
            }
        }
    }
}
