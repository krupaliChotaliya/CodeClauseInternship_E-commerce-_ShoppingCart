import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<ShoppingCartItem> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Product product, int quantity) {
        for (ShoppingCartItem item : items) {
            if (item.getProduct().getId() == product.getId()) {
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }
        items.add(new ShoppingCartItem(product, quantity));
    }

    public void removeItem(int productId) {
        for (ShoppingCartItem item : items) {
            if (item.getProduct().getId() == productId) {
                items.remove(item);
                System.out.println(item.getProduct().getName() + " has been removed from the cart.");
                return;
            }
        }
        System.out.println("Product not found in the cart.");
    }

    public double getTotalPrice() {
        double total = 0;
        for (ShoppingCartItem item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public void clearCart() {
        items.clear();
    }

    public List<ShoppingCartItem> getItems() {
        return items;
    }

    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Shopping Cart:");
            for (ShoppingCartItem item : items) {
                System.out.println(item);
            }
            System.out.println("Total: $" + getTotalPrice());
        }
    }
}
