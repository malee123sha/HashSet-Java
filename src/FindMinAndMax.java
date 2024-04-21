import java.util.Collections;
import java.util.HashSet;
public class FindMinAndMax {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(5600);
        hs.add(2);
        hs.add(55);
        hs.add(330);
        hs.add(2);
        hs.add(680);
        hs.add(5000);
        hs.add(1000);
        hs.add(900);
        hs.add(2500);
        System.out.println("HashSet is       :- "+hs);
        //Minimum Value
        System.out.println("Minimum Value is :- "+ Collections.min(hs));
        //Maximum Value
        System.out.println("Maximum Value is :- "+ Collections.max(hs));
    }
}
