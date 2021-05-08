//WAP to accept 2 numbers from Command line argument and perform its addition and display

public class Addition
{
public static void main(String[] args)
{
int i=Integer.parseInt(args[0]);
int j=Integer.parseInt(args[1]);
int sum=i+j;
System.out.println("sum="+sum);
}
}
