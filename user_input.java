import java.awt.*;
import java.applet.*;
public class user_input extends Applet
{
Textfield t1,t2;
public void init()
{
t1=new Textfield(10);
t2=new Textfield(10);
add(t1);
add(t2);
}
public void paint(Graphics g)
{
int x=0;
x=Integer.parseInt(t1.getText());
t2.setText(String.valueOf(x*x));
}
}
/*
<Applet Code="user_input.class" WIDTH=500 HEIGHT=400>
</Applet>
*/