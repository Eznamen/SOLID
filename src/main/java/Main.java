import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> products = new HashMap<>();
        products.put("����", 56);
        products.put("�����", 153);
        products.put("�������", 211);
        products.put("�������", 45);
        long sum;
        Purchase purchase;
        Map<String, Integer> map = new HashMap<>();

        System.out.println("� �������� � �������");
        for (Map.Entry<String, Integer> productAndPrice : products.entrySet()) {
            System.out.println(productAndPrice.getKey() + " �� " + productAndPrice.getValue() + " ���./��.");
        }
        while (true) {
            System.out.println("������� ��� �����: �������� ������ � ����������. ��� end");
            Scanner scanner = new Scanner(System.in);
            purchase = new Purchase();
            String line = scanner.nextLine();
            if ("end".equals(line)) break;
            String[] parts = line.split(" ");
            String product = parts[0];
            int count = Integer.parseInt(parts[1]);
            System.out.println(count);
            map = purchase.addPurchase(product, count, map);
        }
        sum = purchase.sum(products, map);

        purchase.toStringSum(sum, products, map);
    }
}