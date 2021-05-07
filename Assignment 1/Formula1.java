import java.util.*;
public class Formula1
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
float a,b,c,d,e,f,g,h,i,j,k,l;
System.out.println("a=");
 a=sc.nextFloat();
System.out.println("b=");
 b=sc.nextFloat();
System.out.println("c=");
 c=sc.nextFloat();
System.out.println("d=");
 d=sc.nextFloat();
System.out.println("e=");
 e=sc.nextFloat();
System.out.println("f=");
 f=sc.nextFloat();
System.out.println("g=");
 g=sc.nextFloat();                                               
System.out.println("h=");
 h=sc.nextFloat();
System.out.println("i=");
 i=sc.nextFloat();
System.out.println("j=");
j=sc.nextFloat();
System.out.println("k=");
 k=sc.nextFloat();
System.out.println("l=");
 l=sc.nextFloat();
float ans=a * (b - (c/d) + (e/f) - (g/h) + (i/j) - (k/l));
System.out.println(+ans);
}
}