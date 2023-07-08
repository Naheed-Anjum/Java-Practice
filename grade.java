class grade
{
public static void main(String args[])
{
float p=Float.parseFloat(args[0]);
if(p<35)
System.out.println("grade=F");
else
{
if(p<50)
System.out.println("grade=E");
else
{
if(p<60)
System.out.println("grade=D");
else
{
if(p<80)
System.out.println("grade=C");
else
{
if(p<90)
System.out.println("grade=B");
else
System.out.println("grade=A");
}
}
}
}
}
}
