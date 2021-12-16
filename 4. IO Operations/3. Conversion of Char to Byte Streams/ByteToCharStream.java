import java.io.*;
public class ByteToCharStream {
    public static void main( String[ ] args ) throws IOException 
    {
        FileInputStream in = new FileInputStream( "E:/Java Topics/4. IO Operations/3. Conversion of Char to Byte Streams/Pizza.jpg" );
        FileWriter out = new FileWriter( "pizza.txt" );
        int c;
        while ((c = in.read()) != -1)
        {
           out.write(c);
        }

        in.close();
        out.close();
    }
}