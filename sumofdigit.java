class sumofdigit
{
public static void main(String args[])
{
int n,r,s;
System.out.println("enter the 5 numbers to find the sum of the digit");
n=Integer.parseInt(args[0]);
r=0;
s=0;
while(n>0)
{
r=n%10;
s=s+r;
n=n/10;
}
System.out.println("The sum of the digit is :" +s);
}
}