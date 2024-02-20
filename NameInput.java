import java.util.Scanner;
class  NameInput
{
public static void main(String args[])
{
String firstname,secondname,sum;
Scanner sc=new Scanner(System.in);

System.out.println("Enter the first name");
firstname=sc.nextLine();

System.out.println("Enter the second name");
secondname=sc.nextLine(); 

sum=firstname+secondname;
System.out.println("your full name="+sum);
}
}