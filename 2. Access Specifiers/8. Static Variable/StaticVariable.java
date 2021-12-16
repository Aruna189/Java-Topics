class Employee
 { 
   int empId; 
   String empName; 
   static String companyName = "XYZ";  
   Employee(int id, String name){ 
      empId = id; 
      empName = name; 
   } 
   void display()
   {
      System.out.println(empId+" "+empName+" "+companyName);
   } 
} 

public class StaticVariable 
{ 
      public static void main(String args[])
      { 
         Employee EmployeeObj = new Employee(218,"Kushal"); 
         Employee EmployeeObj1 = new Employee(635,"Bhumika"); 
         Employee EmployeeObj2 = new Employee(147,"Renuka"); 
         EmployeeObj.display(); 
         EmployeeObj1.display(); 
         EmployeeObj2.display(); 
      } 
}