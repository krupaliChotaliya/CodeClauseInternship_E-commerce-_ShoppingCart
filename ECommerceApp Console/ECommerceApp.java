import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ECommerceApp {
    private static List<Product> productList = new ArrayList<>();
    private static ShoppingCart cart = new ShoppingCart();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeProducts();

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayProducts();
                    break;
                case 2:
                    addProductToCart();
                    break;
                case 3:
                    viewCart();
                    break;
                case 4:
                    removeProductFromCart();
                    break;
                case 5:
                    checkout();
                    break;
                case 6:
                    System.out.println("Thank you for shopping with us!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void initializeProducts() {
        productList.add(new Product(1, "Laptop", 999.99));
        productList.add(new Product(2, "Smartphone", 499.99));
        productList.add(new Product(3, "Tablet", 299.99));
    }

    private static void displayMenu() {
        System.out.println("\n1. View Products");
        System.out.println("2. Add Product to Cart");
        System.out.println("3. View Cart");
        System.out.println("4. Remove Product from Cart");
        System.out.println("5. Checkout");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void displayProducts() {
        System.out.println("Available Products:");
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    private static void addProductToCart() {
        System.out.print("Enter the product ID to add to cart: ");
        int productId = scanner.nextInt();
        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();

        for (Product product : productList) {
            if (product.getId() == productId) {
                cart.addItem(product, quantity);
                System.out.println(quantity + " " + product.getName() + "(s) added to cart.");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    private static void viewCart() {
        cart.displayCart();
    }

    private static void removeProductFromCart() {
        System.out.print("Enter the product ID to remove from cart: ");
        int productId = scanner.nextInt();
        cart.removeItem(productId);
    }

    private static void checkout() {
        cart.displayCart();
        System.out.println("Proceed to checkout? (yes/no)");
        String response = scanner.next();
        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Total amount to be paid: $" + cart.getTotalPrice());
            cart.clearCart();
            System.out.println("Checkout complete. Thank you for your purchase!");
        }
    }
}
