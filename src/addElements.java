import java.util.HashSet;
public class addElements {
    public static void main(String[] args) {
        HashSet <String> hs = new HashSet<>();
        //add elements
        hs.add("Mazda");
        hs.add("BMW");
        hs.add("Alto");
        hs.add("Hybrid");
        System.out.println(hs);
        hs.add("Hybrid");
    }
}
