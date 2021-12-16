final class parentClass{
    void messsage(){
        System.out.println("Hi Hello!");
    }
}
public class FinalClass extends parentClass{
    public static void main(String args[]){
        message();
    }
}
/*
FinalClass.java:6: error: cannot inherit from final parentClass
public class FinalClass extends parentClass{
                                ^
FinalClass.java:8: error: cannot find symbol
        message();
        ^
  symbol:   method message()
  location: class FinalClass
*/