import java.util.Scanner;
public class Arithmetic
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("enter 2 nos to perform arithmetic operations");
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println("Addition="+(a+b));
System.out.println("Subtraction="+(a-b));
System.out.println("Multiplication="+(a*b));
System.out.println("Division="+(a/b));
System.out.println("Reminder after division="+(a%b));
}
}
