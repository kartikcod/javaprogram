//Java Program to find the Factorial of a Number
import java.util.*;
public class FactEx
{
     public static void main(String []args)
     {
        //Take input from the user
        //Create an instance of the Scanner Class

        Scanner sc=new Scanner(System.in);

        //Declare and Initialize the variable

        System.out.println("this is a fectorial number");
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int i=1,fact=1;
        while(i<=num)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of the number: "+fact);  
     }   
}