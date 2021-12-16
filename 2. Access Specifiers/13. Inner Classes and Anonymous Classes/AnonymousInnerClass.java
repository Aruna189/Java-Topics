interface Age {
    int x = 21;
    void getAge();
}
class MyClass implements Age {
    public void getAge()
    {
        System.out.print("Age is " + x);
    }
}
public class AnonymousInnerClass {
    public static void main(String[] args)
    {
        MyClass obj = new MyClass();
        obj.getAge();
    }
}
