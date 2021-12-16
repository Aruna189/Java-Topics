class Test{
    public void message(){
        System.out.println("Hello, World!");
    }
}
public class PublicAccessModifier {
    public static void main(String args[]){
        Test t = new Test();
        t.message();
    }
}
/*
Hello, world!
*/