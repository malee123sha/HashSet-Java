import java.util.HashSet;
public class sizeMethod {
    public static void main(String[] args) {
        HashSet<String> hs1 = new HashSet<>();
        HashSet <Integer> hs2 = new HashSet<>();
        HashSet <Double> hs3 = new HashSet<>();
        hs1.add("Mazda");
        hs1.add("Alto");
        hs1.add("Hybrid");
        hs1.add("BMW");
        hs2.add(2000);
        hs2.add(5000);
        hs2.add(1000);
        hs2.add(6000);
        hs2.add(4000);
        hs2.add(3000);
        hs3.add(0.5);
        hs3.add(2.66);
        hs3.add(820.66);
        System.out.println("HashSet 1 :- "+hs1);
        System.out.println("HashSet 1 Size is :-"+hs1.size());
        System.out.println("..................................................");
        System.out.println("HashSet 2 :- "+hs2);
        System.out.println("HashSet 2 Size is :-"+hs2.size());
        System.out.println("..................................................");
        System.out.println("HashSet 3 :- "+hs3);
        System.out.println("HashSet 3 Size is :-"+hs3.size());
    }
}
