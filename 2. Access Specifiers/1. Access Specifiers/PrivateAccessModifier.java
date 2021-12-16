class Test{
    private void message(){
        System.out.println("Hello, World!");
    }
}
public class PrivateAccessModifier {
    public static void main(String args[]){
        Test t = new Test();
        t.message();
    }
}
/*
Compile Time Error : The method message() from the type Test is not visible
*/
/*
To get rid of the error calling the function by its own function is possible

class Test{
    private void message(){
        System.out.println("Hello, World!");
    }
    public void test(){
        message();
    }
}
public class PrivateAccessModifier {
    public static void main(String args[]){
        Test t = new Test();
        t.test();
    }
}

This prints the message.


*/