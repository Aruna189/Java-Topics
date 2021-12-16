public class StringProgram {
    public static void main(String args[])
    {
        String s1 = "abc";
        String s2 = "abc";
        if (s1 == s2)
           System.out.println("Yes, Both refers to same object.");
        else
           System.out.println("No");
        String a = new String("abc");
        String b = new String("abc");
        if (a == b)
           System.out.println("Yes, Both refers to same object.");
        else
           System.out.println("No");
    }
}
