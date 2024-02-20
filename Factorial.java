import java.io.*;
import java.util.*;
public class Factorial
{
 public static void main(String args[])
 {
   float num;
   int i;
   float fact=1;
   Scanner sc= new Scanner(System.in);
   System.out.println("Input the number to find its factorial");
   num=sc.nextFloat();
   for(i=1;i<=num;i++)
   {
     fact=fact*i; //fact*=i
   }
  System.out.println("Factorial of \t"+num+"="+fact);
 }
}