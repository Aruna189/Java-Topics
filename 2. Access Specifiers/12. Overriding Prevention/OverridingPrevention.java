public class Dog {
    public static final void eat(){
        System.out.print("Dog eats the Bread and Flesh.");
    }
}
public class OverridingPrevention extends Dog{
    public static void eat(){
        System.out.println("My Dog eats Icecreams and Veggies.");
    }
    public static void main(String args[]){
        eat();
    }
}
/*
Compile Time Error:

OverridingPrevention.java:1: error: class Dog is public, should be declared in a file named Dog.java
public class Dog {
       ^
OverridingPrevention.java:7: error: eat() in OverridingPrevention cannot override eat() in Dog
    public static void eat(){
                       ^
  overridden method is static,final

*/