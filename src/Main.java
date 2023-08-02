import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>(); // karışık yazar
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); // sırasına göre yazar
        Map<Integer, String> treeMap = new TreeMap<>(); // keylere göre sıralar

        yazdir(hashMap);
        System.out.println("*****************************");
        yazdir(linkedHashMap);
        System.out.println("*****************************");
        yazdir(treeMap);

    }

    public static void yazdir(Map<Integer, String> map) {
        map.put(10, "C++");
        map.put(5, "Java");
        map.put(1, "Python");
        map.put(2, "Php");
        map.put(100, "C");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}
