import java.util.HashSet;
public class Duplicate {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        //add elements
        hs.add("Mazda");
        hs.add("BMW");
        hs.add("Hybrid");
        //duplicate
        hs.add("BMW");
        hs.add("Mazda");
        System.out.println(hs);
    }
}
