import java.util.HashSet;
public class cloneMethod {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        //add elements
        hs.add("Third Generation");
        hs.add("Fifth Generation");
        hs.add("Second Generation");
        hs.add("First Generation");
        hs.add("Fourth Generation");
        System.out.println("Before Cloning :- "+hs);
        System.out.println(".............................................................................");
        //create a new clone set
        HashSet cs = new HashSet();
        //cloning the set, using clone method
        cs = (HashSet)hs.clone();
        System.out.println("After Cloning :- "+cs);
    }
}
