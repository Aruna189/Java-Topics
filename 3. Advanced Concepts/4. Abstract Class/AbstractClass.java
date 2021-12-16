abstract class Chair{
    abstract void rotate();
}
class EasyChair extends Chair{
    void rotate(){
        System.out.println("An easy chair can't rotate.");
    }
}
class RollingChair extends Chair{
    void rotate(){
        System.out.println("A rolling chair can rotate.");
    }
}
public class AbstractClass {
    public static void main(String args[]){
        Chair easyChair = new EasyChair();
        Chair rollingChair = new RollingChair();
        easyChair.rotate();
        rollingChair.rotate();
    }
}
