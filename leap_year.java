class leap_year
{
public static void main(String args[])
{
int y=Integer.parseInt(args[0]);
if(((y%4==0)||(y%400==0))&&(y%100!=0))
System.out.println(y+ "is a leap year");
else
System.out.println(y+ "is not a leap year");
}
}