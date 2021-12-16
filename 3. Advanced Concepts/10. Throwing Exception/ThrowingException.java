import java.util.Scanner;

public class ThrowingException {
    public static void check_eligibility(int n){
        if ((n<21) || (n>55)){
            throw new ArithmeticException("The Person is not eligible to be considered for the position.");
        }
        else{
            System.out.println("The Person is eligible for consideration.");
        }
    }
    public static void main(String args[]){
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age to check for eligibility : ");
        age = sc.nextInt();
        check_eligibility(age);
    }
}
