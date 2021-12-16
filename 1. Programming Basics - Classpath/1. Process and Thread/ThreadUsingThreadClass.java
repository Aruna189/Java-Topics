import java.io.*;
import java.lang.Thread;
public class ThreadUsingThreadClass extends Thread{
    public void run(){ 
        System.out.println("The Thread has been created and running.");
    }
    public static void main(String args[]){
        ThreadUsingThreadClass t = new ThreadUsingThreadClass();
        t.start();
    }
}
