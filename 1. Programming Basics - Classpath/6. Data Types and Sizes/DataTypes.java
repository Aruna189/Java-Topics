import java.io.*;

public class DataTypes{
    static byte a;
    static short b;
    static int c;
    static float f;
    static long e;
    static double d;
    static char ch;
    static boolean bool;
    public static void main(String args[]){
        System.out.println("------Primitive Data Types in Java------");
        System.out.printf("%n%-10s %-6s %-25s %-25s %-15s %n%n","Data Type", "Size", "Minimum Value", "Maximum Value", "Default Value");
        System.out.printf("%-10s %-6s %-25s %-25s %-15s %n", "Byte", Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE, a);
        System.out.printf("%-10s %-6s %-25s %-25s %-15s %n", "Short", Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE, b);
        System.out.printf("%-10s %-6s %-25s %-25s %-15s %n", "Integer", Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE, c);
        System.out.printf("%-10s %-6s %-25s %-25s %-15s %n", "Float", Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE, f);
        System.out.printf("%-10s %-6s %-25s %-25s %-15s %n", "Long", Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE, e);
        System.out.printf("%-10s %-6s %-25s %-25s %-15s %n", "Double", Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE, d);
        System.out.printf("%-10s %-6s %-25s %-25s %-15s %n", "Character", Character.SIZE, Character.MIN_VALUE, Character.MAX_VALUE, ch);
        System.out.printf("%-10s %-6s %-25s %-25s %-15s %n", "Boolean", "NA", "NA", "NA", bool);
    }
}