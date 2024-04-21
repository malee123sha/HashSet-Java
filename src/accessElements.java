import java.util.HashSet;
public class accessElements {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        //add elements
        hs.add("Mazda");
        hs.add("BMW");
        hs.add("Hybrid");
        System.out.println("Hash Set :-"+hs);
        System.out.println("............................................................................................");
        //check "BMW" available
        String check1 = "BMW";
        System.out.println("Contains :- "+check1+"   "+hs.contains(check1));
        //check "Alto" available
        String check2 = "Alto";
        System.out.println("Contains :- "+check2+"   "+hs.contains(check2));
        System.out.println("............................................................................................");
    }
}
