package Problem4;

public class Test {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("Shirt", 19.99);
        Item item2 = new Item("Pants", 29.99);
        cart.addItem(item1);
        cart.addItem(item2);
        cart.displayCart();

        double total = cart.calculateTotal();
        System.out.println("Total: $" + total); // output: "Total: $49.98"

        cart.removeItem(item1);
        cart.displayCart();

        total = cart.calculateTotal();
        System.out.println("Total: $" + total); // output: "Total: $29.99"

    }
}
