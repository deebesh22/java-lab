package alchem;

import java.util.Scanner;

public class Employeedetails

{
    
 public void showdetails()
 
   {
    
    int option;

    Scanner sc=new Scanner(System.in);
    
    System.out.println("...menu...");
   
    System.out.println("enter data");
    
    System.out.println("update data");
 
    System.out.println("display data");
  
    System.out.println("exit");
     
    System.out.println("enter the option :");
  
    option=sc.nextint();
 
   }
    
     public static void main(String args[]);
  
  {
  
     Employeedetails emp=new employeedetails();
   
     emp.showdetails();
   
  }
 }