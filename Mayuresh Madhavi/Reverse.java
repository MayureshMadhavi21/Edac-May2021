//WAP to accept an array and display it in reverse form

import java.util.*;
public class Reverse
{
public static void main(String []args)
{
Scanner sc = new Scanner(System.in);
int []arr=new int[5];
System.out.println("enter 5 elements");
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
System.out.println();
for(int j=4;j>=0;--j)
{
System.out.println(+arr[j]);
}
}
}
