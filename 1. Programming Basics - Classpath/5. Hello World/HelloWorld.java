import java.io.*;
public class HelloWorld {
    public static void main(String args[]){
        System.out.println("Hello, World!");
    }
}
/* 
File Location                               : E:/Java Topics/1. Programming Basics - Classpath/5. Hello World/ directory
Compiled as                                 : javac -d "../classes/" HelloWorld.java
Class File Location                         : E:/Java Topics/1. Programming Basics - Classpath/classes/
Executed from the directory of java file as : java -cp "../classes/"; HelloWorld
-d --> to store the compiled class file in specified directory
-cp --> to set the class path in Command Line

Output : Hello, World!
*/