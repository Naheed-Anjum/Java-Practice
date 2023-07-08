class sum2
{
public static void main(String args[])
{
int sum=0,i=1;
int n=Integer.parseInt(args[0]);
do
{
sum=sum+i;
i++;
}
while(i<=n);
System.out.println("the sum of n numbers = " +sum);
}
}