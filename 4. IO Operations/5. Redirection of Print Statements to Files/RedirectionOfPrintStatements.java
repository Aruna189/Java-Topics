import java.io.*;
import java.util.*;
public class RedirectionOfPrintStatements {
    public static void main(String arr[]) throws FileNotFoundException
    {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter values for dividend and divisor : ");
            a = sc.nextInt();
            b = sc.nextInt();
            c = a/b;
            PrintStream p = new PrintStream(new File("stdout.txt"));
            System.setOut(p);
            System.out.println(a + " / " + b + " = " + c);  
        }
        catch(ArithmeticException e){
            PrintStream o = new PrintStream(new File("stderr.txt"));
            System.setErr(o);
            System.err.println(e);
        }
    }
}
