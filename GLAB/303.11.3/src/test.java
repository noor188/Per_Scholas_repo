import java.util.TreeMap;
import java.util.Map.Entry;

public class test {
    public static void main(String[] args) {
        TreeMap<Integer, String> t0 = new TreeMap<>();
        t0.put(1, "a");
        t0.put(2, "b");
        t0.put(3, "c");
        System.out.println("Original tree map" + t0);

        t0.put(1, "dddd");
        System.out.println("dublicate value " + t0 );

        System.out.println(t0.get(1));
        System.out.println(t0.values());
        System.out.println(t0.keySet());
        System.out.println(t0.entrySet());
    }
}
