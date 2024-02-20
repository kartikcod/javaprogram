import java.io.*;
import java.util.*;
class DigitCount
{
 public static void main(String argv[])
 {
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter a number");
  int n=sc.nextInt();
  int num=n;
  int dc=0;
  while(n!=0)
  {
    dc++;
    n=n/10;
  }
  System.out.println(num +"contains number of digits="+dc);
  if(dc%2==0)
  {
    System.out.println(num +"contains EVEN no of digits");
  }
  else
     System.out.println(num +"contains ODD no of digits");
  }
}