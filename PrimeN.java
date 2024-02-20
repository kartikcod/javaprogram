import java.io.*;
import java.util.*;
class PrimeN 
 {
public  static void main(String args[])
 {
int n,fact=0;
Scanner sc=new Scanner(System.in);

System.out.println("Enter the Number");
n=sc.nextInt();
 for(int i=1;i<=n;i++)
 {
    if(n%i==0)
 {
   fact++;
 }
 }
if(fact==2)
System.out.println("This is a prime no");
else
System.out.println("This is no prime no");
}
}