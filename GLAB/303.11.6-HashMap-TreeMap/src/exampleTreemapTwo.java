import java.util.TreeMap;

public class exampleTreemapTwo {
    public static void main(String[] args) {
        TreeMap<Integer, String> t0 = new TreeMap<>();
        t0.put(1, "a");
        t0.put(2, "g");
        t0.put(3, "b");
        System.out.println("original map " + t0);

        System.out.println(t0.firstKey());
        System.out.println(t0.firstEntry());
        System.out.println(t0.lastKey());
        System.out.println(t0.lastEntry());
    }
}
