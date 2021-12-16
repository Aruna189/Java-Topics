public class BlockScope {
    public static void main(String args[]){
        for(int i=0; i<5; i++){
            System.out.println(i*i);
        }
        System.out.println(i);
    }
}
/*
Compile Time Error:

BlockScope.java:6: error: cannot find symbol
        System.out.println(i);

*/
