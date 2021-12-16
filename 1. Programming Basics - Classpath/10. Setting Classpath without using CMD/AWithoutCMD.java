import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.lang.String;
public class AWithoutCMD
{
	public static void main(String[] args) throws Exception 
	{
         
        URL[] classLoaderUrls = new URL[]{new URL("file:///E://Java Topics//1. Programming Basics - Classpath//10. Setting Classpath without using CMD//build//Bjar.jar")};
        URLClassLoader urlClassLoader = new URLClassLoader(classLoaderUrls);
        Class<?> beanClass = urlClassLoader.loadClass("B");
        Constructor<?> constructor = beanClass.getConstructor();
        Object beanObj = constructor.newInstance();
        Method method = beanClass.getMethod("message");
        method.invoke(beanObj);
 
    }
 
}