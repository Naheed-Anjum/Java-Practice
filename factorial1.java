class factorial1
{
public static void main(String args[])
{
int i=1;
int n= Integer.parseInt(args[0]);
double f=1;
if(n==0)
System.out.println("The factorial value is 1");
else
if(n<0)
{
System.out.println("The factorial value cannot be found");
}
else
{
while(i<=n)
{
f=f*i;
i++;
}
System.out.println("The factorial value = " +f);
}
}
}