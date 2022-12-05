
import java.util.Map;

public class Products {
    String name;
    int price;

    public Products(Map<String, Integer> map, String name, int price) {
        this.name = name;
        this.price = price;
        map.put(this.name, this.price);
    }

public static void toStringProducts(Map<String, Integer> map) {
    System.out.println("Product in stock");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " for " + entry.getValue() + " $/unit");
        }
    }
}
