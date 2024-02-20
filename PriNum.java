import java.io.*;
import java.util.*;
class PriNum
{
public static void main(String args[])
{
int n,fact=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
n=sc.nextInt();
  for(int i=1;i<=n;i++)
  {
    if(n%i==0)
    { 
      fact++;
    }
  }
if(fact==2)
System.out.println("It is a Prime no");
else
 System.out.println("It is not a Prime no");
}

}
