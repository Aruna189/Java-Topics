class Welcome{
    private String name;
    public Welcome(String n){
        name = n;
    }
    public String toString(){
        return "Hi "+ name + "!";
    }
}
public class OverridingtoString {
    public static void main(String args[]){
        Welcome obj = new Welcome("Aruna");
        System.out.println(obj);
    }
}
