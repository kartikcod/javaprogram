import java.io.*;
import java.util.*;

 public class ShowRoom
 {
 int mobileno;
 double discount;
 double cost;
 double amount;

 public void input()
 {
 System.out.println("enter mobileno", + mobileno);
 System.out.println("enter cost", + cost);
 Scanner sc= new Scanner(System.in);
 mobileno=sc.nextInt();
 cost =sc.nextDouble();
 }

 public void calculate()
 {
 if(cost<=10000)
 {
 discount=5/100*cost;
 amount =cost-discount;
 }
 else if(cost>10000 && cost<=20000)
 {
 discount=10/100*cost;
 amount=cost-discount;
 }
 else if(cost>=20000 && cost<=35000)
 {
 discout=15/100*cost;
 amount=cost-discount;
 }
 else
 {
 discount=20/100*cost;
 amount=cost-discount;
 }
 }

 public void display()
 {
 System.out.println("mobileno", + mobileno);
 System.out.println("cost of product",+ cost);
 System.out.println("amount the paid", + amount);
 }
 public static void main(String args[])
 {
 ShowRoom r1=new ShowRoom();
 r1.input();
 r1.calculate();
 r1.display();
 }
}
 
