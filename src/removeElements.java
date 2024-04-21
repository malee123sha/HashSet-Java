import java.util.HashSet;
public class removeElements {
    public static void main(String[] args) {
        HashSet <String> hs = new HashSet<>();
        //add elements
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("E");
        hs.add("F");
        System.out.println("Before Removing :- "+hs);
        System.out.println("............................................");
        System.out.println("Remove B from HashSet :- "+hs.remove("B"));
        System.out.println("After Removing  :- "+hs);
        System.out.println("............................................");
        System.out.println("Element M exists in the HashSet :- "+hs.remove("M"));
    }
}
