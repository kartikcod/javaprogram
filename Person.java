import java.io.*;
import java.util.*;

class Person {
  String firstname;
  String secondname;
  int rollno;
  int regno;
  int Mobileno;

  public void display() {
    System.out.println("firstname:" + firstname);
    System.out.println("secondname:" + secondname);
    System.out.println("rollno:" + rollno);
    System.out.println("regno:" + Mobileno);
  }

  public static void main(String[] args) 
  {
    Person s1 = new Person();
    Scanner sc = new Scanner(System.in);

    System.out.println("enter your firstname:");
    s1.firstname = sc.nextLine();

    System.out.println("Enter your secondname:");
    s1.secondname = sc.nextLine();

    System.out.println("enter your rollno");
    s1.rollno = sc.nextInt();

    System.out.println("enter your regno:");
    s1.regno = sc.nextInt();

    System.out.println("enter your mobile no:");
    s1.Mobileno = sc.nextInt();

    s1.display();

  }
}
