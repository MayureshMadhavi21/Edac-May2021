//WAP to swap 2 numbers and display it before swap and after swap.

import java.util.Scanner;
public class Swap
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 2 numbers:");
int num1=sc.nextInt();
int num2=sc.nextInt();
System.out.println("The numbers before swapping are "+num1+" and "+num2);
int temp=num1;
num1=num2;
num2=temp;
System.out.println("The numbers before swapping are "+num1+" and "+num2);
}
}
