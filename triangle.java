class triangle
{
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);
if((a<b+c)&&(b<a+c)&&(c<a+b))
{
System.out.println("it is a triangle");
if((a*a+b*b==c*c)||(b*b+c*c==a*a)||(a*a+c*c==b*b))
System.out.println("triangle is right angled");
else
{
if((a*a+b*b>c*c)||(b*b+c*c>a*a)||(a*a+c*c>b*b))
System.out.println("triangle is acute");
else
System.out.println("triangle is obtuse");
}
if((a==b)&&(b==c)&&(a==c))
System.out.println("triangle is equilateral");
else
{
if((a==b)||(b==c)||(a==c))
System.out.println("triangle is isosceles");
else
System.out.println("triangle is scalene");
}
}
else
System.out.println("it is not a triangle");
}
}
