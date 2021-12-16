import java.io.*;
class newTestClass {
    static newTestClass object = null;
    public int a = 20;
    private newTestClass() {
    }
    static public newTestClass displayInstance(){
        if (object == null){}
            object = new newTestClass();
            return object;
    }
}

public class PrivateConstructor {

public static void main(String args[]) {
    newTestClass instance1 = newTestClass.displayInstance();
    newTestClass instance2 = newTestClass.displayInstance();
    instance1.a = instance1.a + 26;
    System.out.println("Instance 1 created has the following value = " + instance1.a);
    System.out.println("Instance 2 created has the following value = " + instance2.a);

    }
}