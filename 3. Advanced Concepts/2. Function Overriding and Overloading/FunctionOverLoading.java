public class FunctionOverLoading {
    public static int product(int x, int y){
        return x*y;
    }
    public static int product(int x, int y, int z){
        return x*y*z;
    }
    public static float product(float x, float y){
        return x*y;
    }
    public static long product(int a[]){
        long value = 1;
        for (int i=0; i<a.length; i++){
            value *= a[i];
        }
        return value;
    }
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Product function with 2 integer arguments (6, 3) : " + product(6, 3));
        System.out.println("Product function with 2 integer arguments (6, 3, 9) : " + product(6, 3, 9));
        System.out.println("Product function with 2 float arguments (6.3, 3.6) : " + product(6.3f, 3.6f));
        System.out.println("Product function with array as parameter [1,2,3,4,5,6,7,8,9,10] : " + product(arr));
    }
}
