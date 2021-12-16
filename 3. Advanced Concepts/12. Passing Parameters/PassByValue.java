public class PassByValue {
    public static void changeElement(int[] arr) {

        // If we change the content of arr.
        arr[0] = 10;  // Will change the content of array in main()
     }
     
     public static void changeReference(int[] arr) {
        // If we change the reference
        arr = new int[2];  // Will not change the array in main()
        arr[0] = 15;
     }
     
     public static void main(String[] args) {
         int [] arr = new int[2];
         arr[0] = 4;
         arr[1] = 5;
     
         changeElement(arr);
     
         System.out.println(arr[0]);  // Will print 10.. 
       
         changeReference(arr);
     
         System.out.println(arr[0]);  // Will still print 10.. 
                                      // Change the reference doesn't reflect change here..
     }
}
