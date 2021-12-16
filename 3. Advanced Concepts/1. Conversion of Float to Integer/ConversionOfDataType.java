import java.io.*;
import java.util.*;
public class ConversionOfDataType {
    public static void main(String args[]){
        Float f;
        Integer i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to convert into integer : ");
        f = sc.nextFloat();
        i = f.intValue();
        System.out.println("Integer value of given input : " + i);
    }
}
