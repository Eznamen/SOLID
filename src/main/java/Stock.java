import java.util.Map;

public class Stock {

    public static void toStringProducts(Map<String, Integer> map) {
        System.out.println("Товары в магазине:");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey().toUpperCase() + " руб. за " + entry.getValue() + " шт.");
        }
    }

    public static Map<String, Integer> addProd(Product product, Map<String, Integer> products) {
        products.put(product.getName(), product.getPrice());
        return products;
    }
}
