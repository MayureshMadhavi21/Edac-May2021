//WAP to illustrate condition operator to find maximum among 2 or 3 numbers

import java.util.Scanner;
class Max
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int []arr=new int[3];
System.out.println("enter 3 nos");
for (int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
int large=arr[0];
for(int j=1;j<arr.length;j++)
{
if(arr[j]>large)
large = arr[j];
}
System.out.println("Maximum among 3 numbers is "+large);
}
}

