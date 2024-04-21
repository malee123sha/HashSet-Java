import java.util.HashSet;
import java.util.Iterator;
public class iteratorMethod {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Maths");
        hs.add("Science");
        hs.add("History");
        hs.add("English");
        hs.add("Literature");
        System.out.println("HashSet is :- " + hs);
        //create an iterator
        Iterator i = hs.iterator();
        System.out.println("Iterator Values: ");
        while (i.hasNext()) {
            System.out.println("  " + "*" + " " + i.next());
        }
    }
}
