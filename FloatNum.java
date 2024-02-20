import java.util.Scanner;
class FloatNum
   {
 public static void main(String args[])
   {
 float x,y,sum;
 Scanner sc=new Scanner(System.in);
 
 System.out.println("enter the first number");
 x=sc.nextFloat();

 System.out.println("enter the second number");
 y=sc.nextFloat();

 sum=x+y;

 System.out.println("Sum of the number x and y="+sum);
  }
  }