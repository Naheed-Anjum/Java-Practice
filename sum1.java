class sum1
{
public static void main(String args[])
{
int sum=0, i=1;
int n=Integer.parseInt(args[0]);
while(i<=n)
{
sum=sum+i;
i++;
}
System.out.println("The sum of n values = " +sum);
}
}