public class Java8
{
public static void main(String args[])
{
for(int i=1;i<=4;i++)
{
for(int a=1;a<=25;a++)
{
if(i==3 && a==1 || i==4 && a==2 || i==4 && a==3 || i==1 && a==4 || i==2 && a==4 || i==3 && a==4)
System.out.print("J");
else
if(i==4 && a==5 || i==3 && a==6 || i==3 && a==1 || i==2 && a==7 || i==3 && a==7 || i==1 && a==8 || i==3 && a==8 || i==2 && a==9 || i==3 && a==9 || i==3 && a==10 || i==4 && a==11 || i==4 && a==19 || i==3 && a==20 || i==2 && a==21 || i==3 && a==21 || i==3 && a==22 || i==1 && a==22 || i==3 && a==1 || i==2 && a==23 || i==3 && a==23 || i==3 && a==24|| i==4 && a==25)
System.out.print("A");
else 
if(i==1 && a==12 || i==2 && a==13 || i==3 && a==14 || i==4 && a==15 || i==3 && a==16 || i==2 && a==17 || i==1 && a==18)
System.out.print("V");
else
System.out.print(" ");
}

}
}
}