//WAP to illustrate condition operator to find maximum among 2 or 3 numbers

public class Condition
{
public static void main(String []args)
{
int num1=Integer.parseInt(args[0]);
int num2=Integer.parseInt(args[1]);
int num3=Integer.parseInt(args[2]);
if(num1>num2)
{
if(num1>num3)
System.out.println("Maximum ="+num1);
}
else if(num2>num3)
System.out.println("Maximum ="+num2);
else
System.out.println("Maximum ="+num3);
}
}































