public class CommandLineInput {
    public static void main(String args[]){
        if(args.length>0){
            String name = args[0];
            int age = Integer.parseInt(args[1]);
            System.out.println(name + " is " + age + " years old.");
        }
        else{
            System.out.println("No arguments have been given.");
        }
    }
}
