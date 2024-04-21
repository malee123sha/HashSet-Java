import java.util.HashSet;
public class clearMethod {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Mazda");
        hs.add("Alto");
        hs.add("Hybrid");
        hs.add("BMW");
        System.out.println("Before Using Clear Method :- "+hs);
        //use clear method
        hs.clear();
        System.out.println("After Using Clear Method  :- "+hs);
    }
}
