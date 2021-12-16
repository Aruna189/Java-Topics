import java.io.*;
import java.util.*;
public class StringReverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer(str);
        System.out.println("Original String : " + str);
        System.out.println("Reversed String : " + sb.reverse());
    }
}
/*
Input            : aruna chermadurai
Output :-
Original String  : aruna chermadurai
Reversed String  : iarudamrehc anura
*/ 