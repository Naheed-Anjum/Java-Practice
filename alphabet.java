class alphabet
{
public static void main(String args[])
{
char x=args[0].charAt(0);
switch(x)
{
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
System.out.println(" The char is vowel");
break;
default: System.out.println(" The char is consonant");
}
}
}

