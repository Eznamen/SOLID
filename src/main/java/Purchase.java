import java.util.Map;

public class Purchase {
    private long sum = 0;

    public Purchase() {
    }

    public Map<String, Integer> addPurchase(String title, int count, Map<String, Integer> map) {
        if (map.get(title) == null) {
            map.put(title, count);
        } else {
            if (map.containsKey(title)) {
                int ccount = map.get(title) + count;
                map.put(title, ccount);
            }
        }
        return map;
    }

    public long sum(Map<String, Integer> prices, Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : prices.entrySet()) {
            if (map.containsKey(entry.getKey())) {
                sum = entry.getValue() * map.get(entry.getKey()) + sum;
            } else {
                continue;
            }
        }
        return sum;
    }

    public void toStringSum(long sum, Map<String, Integer> prices, Map<String, Integer> map) {
        System.out.println("Shopping cart:");
        System.out.println(sum + " $");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("\t" + entry.getKey() + " " + entry.getValue() + " unit by price " + (entry.getValue() * prices.get(entry.getKey()) + " $"));
        }
    }
}