import java.io.*;
import java.util.*;
class Employee
{
int empno;
int phone;
public void getdata(int x,int y)
{
empno=x;
phone=y;
}
public void display()
{
System.out.println("Employee no="+empno);
System.out.println("Employer phone="+phone);
}
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
Employee obj= new Employee();

int a,b;
System.out.println("Enter the value");

a=sc.nextInt();
b=sc.nextInt();

obj.getdata(a,b);
obj.display();
}
}



