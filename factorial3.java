class factorial3
{
public static void main(String args[])
{
int i;
int n=Integer.parseInt(args[0]);
double f=1;
if(n==0)
System.out.println("The factorial is 1");
else
{
if(n<0)
System.out.println("The factorial cannot be found");
else
{
for(i=1;i<=n;i++)
{
f=f*i;
}
System.out.println("The factorial value = " +f);
}
}
}
}
