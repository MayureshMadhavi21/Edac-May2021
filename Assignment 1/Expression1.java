import java.util.Scanner;
public class Expression1
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("enter 6 numbers=");
float a=sc.nextFloat();
float b=sc.nextFloat();
float c=sc.nextFloat();
float d=sc.nextFloat();
float e=sc.nextFloat();
float f=sc.nextFloat();
double ans= ((a * b - c * d) / (e - f));
System.out.println("ans="+ans);
}
}


