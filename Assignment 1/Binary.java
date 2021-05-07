import java.util.*;
public class Binary
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("a=");
int a=sc.nextInt();
System.out.println("b=");
int b=sc.nextInt();
int num1=Integer.parseInt(a,2);
int num2=Integer.parseInt(b,2);
int ans=num1+num2;
System.out.println(+ans);
}
}