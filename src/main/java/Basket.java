import java.util.HashMap;
import java.util.Map;

public class Basket {
    private long sum = 0;
    Map<String, Integer> map;

    public Basket() {
        this.map = new HashMap<>();
    }

    public Map<String, Integer> addPurchase(Purchase purchase) {

        if (map.get(purchase.getTitle()) == null) {
            map.put(purchase.getTitle(), purchase.getCount());
        } else {
            int ccount = map.containsKey(purchase.getTitle()) ? map.get(purchase.getTitle()) + purchase.getCount() : 0;
            map.put(purchase.getTitle(), ccount);
        }

        return map;
    }

    public long sum(Map<String, Integer> prices) {
        for (Map.Entry<String, Integer> entry : prices.entrySet()) {
            sum = map.containsKey(entry.getKey()) ? entry.getValue() * map.get(entry.getKey()) + sum : sum;
        }
        return sum;
    }

    public void toStringProducts(Map<String, Integer> products) {
        System.out.println("Корзина:");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey().toUpperCase() + " по цене " + products.get(entry.getKey()) + " руб. за шт. в кол-ве " + entry.getValue() + " шт.");
        }
        System.out.println("Итого: " + this.sum(products) + " руб.");
    }

}