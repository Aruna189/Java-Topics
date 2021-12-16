class TestClass{
    void message(){
        System.out.println("Hello, World!");
    }
}
public class DefaultAccessModifier {
    public static void main(String args[]){
        TestClass t = new TestClass();
        t.message();
    }
}
/*
Hello, world!
*/