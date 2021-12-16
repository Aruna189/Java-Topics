import java.io.*;
public class ReadingTextFile {
    public static void main( String[ ] args ) throws IOException 
    {
        FileInputStream in = new FileInputStream( "E:/Java Topics/4. IO Operations/7. Student File/Students.txt" );//Reading using Byte Stream
        FileWriter out = new FileWriter( "output.txt" );//Writing using Character Stream
        int c;
        while ((c = in.read()) != -1)
        {
           out.write(c);
        }

        in.close();
        out.close();
    }
}
