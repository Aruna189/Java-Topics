public class ExceptionHandling {
    public static void main(String args[]){
        String a = null;
        try
        {
            if("Anura".equals(a)){
                System.out.print("Same\n");
            }
            else {
                System.out.print("Not Same on Anura\n");
            }
            if (a.equals("Aruna")){
                System.out.print("Same\n");
            }
            else {
                System.out.print("Not Same on Aruna\n");
            }
        }
        catch(NullPointerException e)
        {
            System.out.println("NullPointerException Caught");
        }
    }
}
