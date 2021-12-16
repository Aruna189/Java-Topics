class TestClass{
    protected void message(){
        System.out.println("Hello, World!");
    }
}
public class ProtectedAccessModifier {
    public static void main(String args[]){
        TestClass t = new TestClass();
        t.message();
    }
}
/*
Hello, world!
*/