public class ConcatenationDifference {
    public static String concatingUsingString()    {  
        String s = "Hi";  
        for (int i=0; i<100000; i++){  
            s = s + "Java";  
        }  
        return s;  
    }  
    public static String concatingUsingStringBuffer(){  
        StringBuffer sb = new StringBuffer("Hi");  
        for (int i=0; i<100000; i++){  
            sb.append("Java");  
        }  
        return sb.toString();  
    }  
    public static void main(String[] args){  
        double start = System.currentTimeMillis();  
        concatingUsingString();  
        System.out.println("Time taken for Concatenation using String Class : "+ (System.currentTimeMillis()-start)+"ms");  
        start = System.currentTimeMillis();  
        concatingUsingStringBuffer();  
        System.out.println("Time taken for Concatenation using StringBuffer Class : "+(System.currentTimeMillis()-start)+"ms");  
    }  
}
