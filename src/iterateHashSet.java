import java.util.HashSet;
import java.util.Iterator;
public class iterateHashSet {
    public static void main(String[] args) {
        HashSet <Integer> hs = new HashSet<>();
        hs.add(100);
        hs.add(300);
        hs.add(500);
        hs.add(700);
        hs.add(200);
        hs.add(600);
        hs.add(400);
        //using iterator
        System.out.println("Using Iterator");
        Iterator i = hs.iterator();
        while (i.hasNext())
            System.out.print(i.next()+"  ");
        System.out.println();
        System.out.println("............................................");
        //iterate through for loop
        System.out.println("Using For Loop");
        for (int val : hs)
            System.out.print(val+"  ");
    }
}
