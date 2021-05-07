public class Swap
{
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
System.out.println("numbers before swapping are "+a+" and " +b);
int temp=a;
a=b;
b=temp;
System.out.println("numbers after swapping are "+a+" and " +b);
}
}