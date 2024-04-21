import java.util.HashSet;
public class isEmpty {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        //checks if the Tree Set is empty or not
        System.out.println("Is the HashSet Empty ? :- "+hs.isEmpty());
        hs.add("Mazda");
        hs.add("Alto");
        hs.add("Hybrid");
        hs.add("BMW");
        System.out.println(".................................................");
        System.out.println("HashSet  :- "+hs);
        //checks if the Tree Set is empty or not
        System.out.println("Is the HashSet Empty ? :- "+hs.isEmpty());
        System.out.println(".................................................");
        //use clear method
        hs.clear();
        System.out.println("HashSet  :- "+hs);
        //checks if the Tree Set is empty or not
        System.out.println("Is the HashSet Empty ? :- "+hs.isEmpty());
    }
}




















