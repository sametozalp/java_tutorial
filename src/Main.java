import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // HASHMAP
        // Key and value
        // Keyden sadece bir tane olabilir. birden fazla value olabilir.
        // Elementleri ekleme sırasına göre depolamaz. (HashSet gibi)
        // Map Collection interface'inden implement etmez.

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(10, "Java");
        hashMap.put(30, "Python");
        hashMap.put(50, "Php");
        hashMap.put(20, "Php");
        hashMap.put(50, "JavaScript"); // üzerine yazar.

        System.out.println(hashMap);
        System.out.println(hashMap.get(50));

        // liste gibi alt alta yazdırmak
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

    }
}
