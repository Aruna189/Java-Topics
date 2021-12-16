import java.io.*;
import java.util.*;

public class RemovalOfProperty {
    public static void main(String args[]) throws IOException{
        Properties p = new Properties();
        FileReader reader = new FileReader("me.properties");
        p.load(reader);
        Enumeration e = p.propertyNames();

        while (e.hasMoreElements()) {
            String key = e.nextElement().toString();
            if (key=="Age"){
                System.out.println(key + ": " + p.getProperty(key));
                p.remove(key);
            }
        }
        String path = "E://Java Topics//3. Advanced Concepts//8. Removal of element while Enumerating//me.properties";
        FileOutputStream outputStream = new FileOutputStream(path);
        p.store(outputStream, "Age property has been deleted.");
    }
}
