public class StringBufferProgram{
    public static void main(String args[]){
        StringBuffer sb=new StringBuffer("Hello ");  
        sb.append("Java");
        System.out.println(sb);
        sb.insert(6,"Cool ");
        System.out.println(sb);
        sb.reverse();  
        System.out.println(sb);
    }
}