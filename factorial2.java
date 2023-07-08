class factorial2
{
public static void main(String args[])
{
int i=1;
int n=Integer.parseInt(args[0]);
double f=1;
if(n==0)
System.out.println("The factorial value = 1");
else
if(n<0)
{
System.out.println("The factorial value cannot be found");
}
else
{
do
{
f=f*i;
i++;
}
while(i<=n);
System.out.println("The factorial value = " +f);
}
}
}
