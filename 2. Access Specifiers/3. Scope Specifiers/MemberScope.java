class Test{
    private int num = 5;
    public void display(){
        System.out.println(num);
    }
}
public class MemberScope {
    public static void main(String args[]){
        Test t = new Test();
        System.out.println(t.num); // Compile Time Error : The field Test.num is not visible
        t.display(); // Getter to access the private variable
    }
}

