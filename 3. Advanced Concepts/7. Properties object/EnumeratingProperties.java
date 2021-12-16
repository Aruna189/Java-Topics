import java.util.Enumeration;
import java.util.Properties;
public class EnumeratingProperties {
    public static void printProperties(Properties prop)
    {
        Enumeration e = prop.propertyNames();
        while (e.hasMoreElements())
        {
            String key = e.nextElement().toString();
            System.out.println(key + ": " + prop.getProperty(key));
        }
    }
    public static void main(String[] args)
    {
        Properties prop = System.getProperties();
        printProperties(prop);
    }
}
