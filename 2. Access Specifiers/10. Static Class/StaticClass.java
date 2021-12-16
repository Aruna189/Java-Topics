class OuterClass{ 
      private static String messageToReaders = "Hello Readers!"; 
      public static class NestedStaticClass{ 
            public void myMessage() 
            { 
                  System.out.println("Message from nested static class: " + messageToReaders); 
            } 
      } 
      public class InnerClass{ 
            public void display(){ 
            System.out.println("Message from non-static nested class: "+ messageToReaders); 
            } 
      } 
} 
public class StaticClass {
      public static void main(String args[]){ 
      OuterClass.NestedStaticClass printer = new OuterClass.NestedStaticClass(); 
      printer.myMessage(); 
      OuterClass outer = new OuterClass(); 
      OuterClass.InnerClass inner = outer.new InnerClass(); 
      inner.display(); 
      OuterClass.InnerClass innerObject = new OuterClass().new InnerClass(); 
      innerObject.display(); 
      } 
}
