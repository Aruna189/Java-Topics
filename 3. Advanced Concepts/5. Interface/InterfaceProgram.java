interface professional{
    void work(String works);
    void tools(String tool);
}
class Doctor implements professional{
    String working;
    String toolItem;
    public void work(String works){
        working = works;
    }
    public void tools(String tool){
        toolItem = tool;
    }
    public void display(){
        System.out.println("A doctor " + working + " and uses " + toolItem);
    }
}
class Teacher implements professional{
    String working;
    String toolItem;
    public void work(String works){
        working = works;
    }
    public void tools(String tool){
        toolItem = tool;
    }
    public void display(){
        System.out.println("A teacher " + working + " and uses " + toolItem);
    }
}
public class InterfaceProgram {
    public static void main(String args[]){
        Doctor d = new Doctor();
        d.work("treats patients");
        d.tools("stethescope");

        Teacher t = new Teacher();
        t.work("teaches students");
        t.tools("books");

        d.display();
        t.display();
    }
}
