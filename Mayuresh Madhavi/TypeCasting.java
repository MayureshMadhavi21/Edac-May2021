//WAP to illustrate example of typecasting 

import java.util.*;
public class TypeCasting
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter Integer no");
int a=sc.nextInt();
float b=a;
System.out.println("Widening Conversion "+b);
System.out.println("enter non Integer or Decimal no");
float c=sc.nextFloat();
int d=(int)c;
System.out.println("Narrowing Conversion "+d);
}
}