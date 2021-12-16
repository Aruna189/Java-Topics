class Display {
    private class InnerDisplay {
       public void display() {
          System.out.println("Private inner class method called");
       }
    }
  
    void display() {
       System.out.println("Outer class (Display) method called");
       InnerDisplay innerDisplay = new InnerDisplay();
       innerDisplay.display();
    }
 }
public class PrivateClass {
    public static void main(String args[]) {
        Display object = new Display();
        object.display();
     }
}
/*
Yes, we can declare a class as private but 
these classes can be only inner or nested 
classes. We can’t a top-level class as private 
because it would be completely useless as nothing would have access to it.
*/