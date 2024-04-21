import java.util.HashSet;
import java.util.Iterator;
public class zFinal {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        //checks if the Tree Set is empty or not
        System.out.println("Is the HashSet Empty ? :- "+hs.isEmpty());
        //checks  size of the TreeSet
        System.out.println("HashSet Size is :-"+hs.size());
        //add elements
        hs.add("Third Generation");
        hs.add("Fifth Generation");
        hs.add("Second Generation");
        hs.add("First Generation");
        hs.add("Fourth Generation");
        System.out.println(hs);
        System.out.println("............................................................................................");
        System.out.println("Before Removing  :-"+hs);
        //remove elements
        hs.remove("Third Generation");
        System.out.println("After Removing   :-"+hs);
        System.out.println("............................................................................................");
        //check "First Generation" available
        String check1 = "First Generation";
        System.out.println("Contains :- "+check1+"   "+hs.contains(check1));
        //check "BMW" available
        String check2 = "BMW";
        System.out.println("Contains :- "+check2+"   "+hs.contains(check2));
        System.out.println("............................................................................................");
        //create an iterator
        Iterator i = hs.iterator();
        System.out.println("Iterator Values: ");
        while (i.hasNext())  {
            System.out.println("  "+"*"+" "+i.next());
        }
        System.out.println("............................................................................................");
        //use clear method
        hs.clear();
        System.out.println("After Using Clear Method  :- "+hs);
    }
}
