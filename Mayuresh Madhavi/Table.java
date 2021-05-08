//WAP to accept number from user(Scanner class) print table of it

import java.util.*;
public class Table
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("enter a number whose table is required");
int num=sc.nextInt();
for(int i=1;i<11;++i)
{
int ans=num*i;
System.out.println(+num+"*"+i+"="+ans);
}
}
}
