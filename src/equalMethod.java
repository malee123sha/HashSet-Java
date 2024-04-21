import java.util.HashSet;
public class equalMethod {
    public static void main(String[] args) {
        HashSet <String> hs1 = new HashSet<>();
        HashSet <Integer> hs2 = new HashSet<>();
        HashSet <String> hs3 = new HashSet<>();
        hs1.add("Mazda");
        hs1.add("Alto");
        hs1.add("Hybrid");
        hs1.add("BMW");
        hs2.add(2000);
        hs2.add(5000);
        hs2.add(1000);
        hs2.add(6000);
        hs2.add(4000);
        hs3.add("Mazda");
        hs3.add("Alto");
        hs3.add("Hybrid");
        hs3.add("BMW");
        System.out.println("HashSet 1 :- "+hs1);
        System.out.println("HashSet 2 :- "+hs2);
        //compare HashSet1 to HashSet2
        boolean val1 = hs1.equals(hs2);
        System.out.println("Are both set equal :- "+val1);
        System.out.println(".................................................");
        System.out.println("HashSet 1 :- "+hs1);
        System.out.println("HashSet 3 :- "+hs3);
        //compare HashSet1 to HashSet3
        boolean val2 = hs1.equals(hs3);
        System.out.println("Are both set equal :- "+val2);
    }
}
