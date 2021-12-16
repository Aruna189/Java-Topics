import java.util.Hashtable;

public class HashtableProgram {
    public static void main(String args[]){
        Hashtable <Integer, Integer> a = new Hashtable<>();

        a.put(1, 6);
        a.put(2, 12);
        a.put(3, 18);
        a.put(3, 18);

        System.out.println(a);
    }
}
