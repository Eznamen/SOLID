import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> products = new HashMap<>();
        Stock.addProd(new Product("Bread", 56), products);
        Stock.addProd(new Product("Sausage", 211), products);
        Stock.addProd(new Product("Oil", 153), products);
        Stock.addProd(new Product("Pie", 45), products);
        Purchase purchase;
        Basket basket = new Basket();
        Stock.toStringProducts(products);

        while (true) {
            System.out.println("Enter two words: product name and count. Or end");
            Scanner scanner = new Scanner(System.in);

            String line = scanner.nextLine().toLowerCase();
            if ("end".equals(line)) break;
            String[] parts = line.split(" ");
            String title = parts[0];
            int count = Integer.parseInt(parts[1]);
            purchase = new Purchase(title, count);
            basket.addPurchase(purchase);
        }
        basket.toStringProducts(products);
    }
}