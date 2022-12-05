import java.util.*;

public class Main {

    public static void main(String[] args) {
        Products products;
        Purchase purchase;

        HashMap<String, Integer> productses = new HashMap<>();
        products = new Products(productses, "Bread", 56);
        products = new Products(productses, "Sausage", 211);
        products = new Products(productses, "Oil", 153);
        products = new Products(productses, "Pie", 45);
        Products.toStringProducts(productses);
        Map<String, Integer> map = new HashMap<>();

        while (true) {
            System.out.println("Enter two words: product name and count. Or end");
            Scanner scanner = new Scanner(System.in);
            purchase = new Purchase();
            String line = scanner.nextLine();
            if ("end".equals(line)) break;
            String[] parts = line.split(" ");
            String product = parts[0];
            int count = Integer.parseInt(parts[1]);
            map = purchase.addPurchase(product, count, map);
        }
        long sum = purchase.sum(productses, map);

        purchase.toStringSum(sum, productses, map);
    }
}