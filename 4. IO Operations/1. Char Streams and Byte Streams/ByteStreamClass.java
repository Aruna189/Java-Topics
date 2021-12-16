import java.io.*;
public class ByteStreamClass {
    public static void main(String[] args) throws IOException
    {
        FileInputStream input = null;
        FileOutputStream output = null;
  
        try 
        {
            input = new FileInputStream("E:/Java Topics/4. IO Operations/7. Student File/Classes/9.txt");
            int temp; //temp stores unicode values
            while ((temp = input.read()) != -1)
                System.out.println((char)(temp));            
        }
        finally 
        {
            if (input != null)
                input.close();                     
        }
    }
}
