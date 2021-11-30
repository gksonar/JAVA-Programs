/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
class Main {

    Main(String name, String address, String contact, String DOB)
    {
        
        System.out.println("*******Patient Information*******");    
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Contact: "+contact);
        System.out.println("Date Of Birth: "+DOB);

    }
    Main(String test_report, String blood_group)
    {
        System.out.println("Test Report: "+test_report);
        System.out.println("Blood Group: "+blood_group);
    }
    Main(String adhar_no)
    {
        System.out.println("Adhar No: "+adhar_no);
    }

  public static void main(String[] args) {

    String name, address,contact, dob, test, bg, adhar;
    Scanner s= new Scanner(System.in);
    System.out.println("Enter the Patient Information");

    System.out.print("Name:");
    name=s.nextLine();
    System.out.print("Address:");
    address=s.nextLine();
    System.out.print("Mobile no:");
    contact=s.nextLine();
    System.out.print("Date of Birth:");
    dob=s.nextLine();
    System.out.print("Test Report:");
    test=s.nextLine();
    System.out.print("Blood Group:");
    bg=s.nextLine();
    System.out.print("Adhar No:");
    adhar=s.nextLine();
    
    
    Main obj1 = new Main(name,address,contact,DOB);
    Main obj2 = new Main(test,bg);
    Main obj3 = new Main(adhar);
  }
}




Enter the Patient Information
Name:Gaurav 
Address:Nashik
Mobile no:9988899989
Test Report:Negative
Blood Group:O+
Adhar No:789878980909
*******Patient Information*******
Name: Gaurav 
Address: Nashik
Contact: 9988899989
Test Report: Negative
Blood Group: O+
Adhar No: 789878980909


