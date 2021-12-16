import java.util.*;
public class SystemProperties {
    public static void main(String args[]){
        System.out.println("Current Working Directory : " + System.getProperty("user.dir"));
        System.out.println("\n ----------System Properties------------\n");
        Properties p = new Properties(System.getProperties());
        Enumeration e = p.propertyNames();
        while (e.hasMoreElements())
        {
            String key = e.nextElement().toString();
            System.out.println(key + ": " + p.getProperty(key));
        }
    }
}
