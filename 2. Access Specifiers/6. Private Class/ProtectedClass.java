class Display {
    protected class InnerDisplay {
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
public class ProtectedClass {
    public static void main(String args[]) {
        Display object = new Display();
        object.display();
     }
}