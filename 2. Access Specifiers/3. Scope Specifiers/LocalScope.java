public class LocalScope {
    int a = 7; //Instance Variable --> An object knows about itself
    public void scope(){
        int num = 5;
        System.out.println(num);
    }
    public static void main(String args[]){
        System.out.println(num);
    }
}
/* 
Compile Time Error : 

LocalScope.java:7: error: cannot find symbol
        System.out.println(num);
*/