import java.io.*;
public class CharToByteStream{
    public static void main( String[ ] args ) throws IOException 
    {
        FileReader in = new FileReader( "E:/Java Topics/4. IO Operations/7. Student File/Students.txt" );
        FileOutputStream out = new FileOutputStream( "test.txt" );
        int c;

        while ((c = in.read()) != -1)
        {
           out.write(c);
        }

        in.close();
        out.close();
    }

}