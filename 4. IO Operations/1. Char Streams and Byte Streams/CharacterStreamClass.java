import java.io.*;
public class CharacterStreamClass {
    public static void main(String[] args) throws IOException
    {
        FileReader input = null;
        try 
        {
            input = new FileReader("E:/Java Topics/4. IO Operations/7. Student File/Classes/9.txt");
            int temp;
            while ((temp = input.read()) != -1)
                 System.out.println((char)temp);
        }
        finally 
        {             
            if (input != null)            
                input.close();         
        }
    }
}
