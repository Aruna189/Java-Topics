import java.io.*;
public class A {
    public static void main(String args[]){
        B b = new B();
        b.message();
    }
}
/* 
Compiled as : javac -d "E:/Java Topics/1. Programming Basics - Classpath/classes" -cp "../Class B/"; A.java

If we compile normally as "javac A.java", the following error will be thrown:-

A.java:4: error: cannot find symbol
        B b = new B();
        ^
  symbol:   class B
  location: class A
A.java:4: error: cannot find symbol
        B b = new B();
                  ^
  symbol:   class B
  location: class A
2 errors

This is due to the class could not able to find the class B.
Hence we set the classpath for B.class using -cp in the CMD.

Executed as     : java -cp "E:/Java Topics/1. Programming Basics - Classpath/classes/"; A

Output : Hi, Hello!

*/