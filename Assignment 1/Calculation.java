import java.util.Scanner;
public class Calculation
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
float num1=sc.nextFloat();
float num2=sc.nextFloat();
float num3=sc.nextFloat();
float sum=num1+num2+num3;
float avg=sum/3;
System.out.println("The average of the numbers="+avg);
}
}
