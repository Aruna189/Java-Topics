import java.util.Properties;
import java.io.*;
public class PropertiesProgram {
    public static void main(String args[]) throws IOException{
        Properties p = new Properties();
        p.setProperty("Name", "Aruna");
        p.setProperty("Age", "21");
        String path = "E://Java Topics//3. Advanced Concepts//6. Hashtables and Properties//me.properties";
        FileOutputStream outputStream = new FileOutputStream(path);
        p.store(outputStream, "This is my properties file");
        System.out.println(p);
    }
}
