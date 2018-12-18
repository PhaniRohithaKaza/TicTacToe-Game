import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class app2 extends Applet implements ActionListener
{
public static int c=0,d=0;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
Label p1;
public void init()
{
setLayout(null);
b1=new Button();
b2=new Button();
b3=new Button();
b4=new Button();
b5=new Button();
b6=new Button();
b7=new Button();
b8=new Button();
b9=new Button();
b1.setFont(new Font("Vedana",Font.BOLD,25));
b2.setFont(new Font("Vedana",Font.BOLD,25));
b3.setFont(new Font("Vedana",Font.BOLD,25));
b4.setFont(new Font("Vedana",Font.BOLD,25));
b5.setFont(new Font("Vedana",Font.BOLD,25));
b6.setFont(new Font("Vedana",Font.BOLD,25));
b7.setFont(new Font("Vedana",Font.BOLD,25));
b8.setFont(new Font("Vedana",Font.BOLD,25));
b9.setFont(new Font("Vedana",Font.BOLD,25));
b1.setBackground(Color.white);
b2.setBackground(Color.white);
b3.setBackground(Color.white);
b4.setBackground(Color.white);
b5.setBackground(Color.white);
b6.setBackground(Color.white);
b7.setBackground(Color.white);
b8.setBackground(Color.white);
b9.setBackground(Color.white);
p1=new Label();
p1.setFont(new Font("Verdana",Font.BOLD,20));
b1.setBounds(100,100,50,50);
b2.setBounds(160,100,50,50);
b3.setBounds(220,100,50,50);
b4.setBounds(100,160,50,50);
b5.setBounds(160,160,50,50);
b6.setBounds(220,160,50,50);
b7.setBounds(100,220,50,50);
b8.setBounds(160,220,50,50);
b9.setBounds(220,220,50,50);
//p2.setBounds(150,300,80,20);
p1.setBounds(80,350,300,20);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
add(b8);
add(b9);
add(p1);
//add(p2);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
//p1.addActionListener(this);
//p2.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{

if(b1==e.getSource())
{
d++;
if(d==9)
{
if(((b1.getLabel().equals(b2.getLabel()))&&(b2.getLabel().equals(b3.getLabel()))))
p1.setText("Congratulations!!"+b1.getLabel()+" won!!");
else if(((b4.getLabel().equals(b5.getLabel()))&&(b5.getLabel().equals(b6.getLabel()))))
p1.setText("Congratulations!!"+b4.getLabel()+" won!!");
else if(((b7.getLabel().equals(b8.getLabel()))&&(b8.getLabel().equals(b9.getLabel()))))
p1.setText("Congratulations!!"+b7.getLabel()+" won!!");
else if(((b1.getLabel().equals(b4.getLabel()))&&(b4.getLabel().equals(b7.getLabel()))))
p1.setText("Congratulations!!"+b1.getLabel()+" won!!");
else if(((b2.getLabel().equals(b5.getLabel()))&&(b5.getLabel().equals(b8.getLabel()))))
p1.setText("Congratulations!!"+b2.getLabel()+" won!!");
else if(((b3.getLabel().equals(b6.getLabel()))&&(b6.getLabel().equals(b9.getLabel()))))
p1.setText("Congratulations!!"+b3.getLabel()+" won!!");
else if(((b3.getLabel().equals(b5.getLabel()))&&(b5.getLabel().equals(b7.getLabel()))))
p1.setText("Congratulations!!"+b3.getLabel()+" won!!");
else if(((b1.getLabel().equals(b5.getLabel()))&&(b5.getLabel().equals(b9.getLabel()))))
p1.setText("Congratulations!!"+b1.getLabel()+" won!!");
else 
p1.setText("    Both Lost    ");
}
if(c==1||c==3||c==5||c==7||c==9)
{
b1.setLabel("O");
c++;
b1.setForeground(Color.pink);
System.out.println("c"+c+"D:"+d);

}
else if(c==0||c==2||c==4||c==6||c==8)
{
b1.setLabel("X");
c++;

b1.setForeground(Color.cyan);
System.out.println("c"+c+"D:"+d);

}
}
if(b2==e.getSource())
{
d++;
if(d==9)
{
if(((b1.getLabel().equals(b2.getLabel()))&&(b2.getLabel().equals(b3.getLabel()))))
p1.setText("Congratulations!!"+b1.getLabel()+" won!!");
else if(((b4.getLabel().equals(b5.getLabel()))&&(b5.getLabel().equals(b6.getLabel()))))
p1.setText("Congratulations!!"+b4.getLabel()+" won!!");
else if(((b7.getLabel().equals(b8.getLabel()))&&(b8.getLabel().equals(b9.getLabel()))))
p1.setText("Congratulations!!"+b7.getLabel()+" won!!");
else if(((b1.getLabel().equals(b4.getLabel()))&&(b4.getLabel().equals(b7.getLabel()))))
p1.setText("Congratulations!!"+b1.getLabel()+" won!!");
else if(((b2.getLabel().equals(b5.getLabel()))&&(b5.getLabel().equals(b8.getLabel()))))
p1.setText("Congratulations!!"+b2.getLabel()+" won!!");
else if(((b3.getLabel().equals(b6.getLabel()))&&(b6.getLabel().equals(b9.getLabel()))))
p1.setText("Congratulations!!"+b3.getLabel()+" won!!");
else if(((b3.getLabel().equals(b5.getLabel()))&&(b5.getLabel().equals(b7.getLabel()))))
p1.setText("Congratulations!!"+b3.getLabel()+" won!!");
else if(((b1.getLabel().equals(b5.getLabel()))&&(b5.getLabel().equals(b9.getLabel()))))
p1.setText("Congratulations!!"+b1.getLabel()+" won!!");
else 
p1.setText("    Both Lost    ");
}
if(c==1||c==3||c==5||c==7||c==9)
{
b2.setLabel("O");
c++;
b2.setForeground(Color.pink);

System.out.println("c"+c+"D:"+d);
}
else if(c==0||c==2||c==4||c==6||c==8)
{
b2.setLabel("X");
c++;
System.out.println("c"+c+"D:"+d);
b2.setForeground(Color.cyan);

}
}
if(b3==e.getSource())
{
d++;
if(d==9)
{
if(((b1.getLabel().equals(b2.getLabel()))&&(b2.getLabel().equals(b3.getLabel()))))
p1.setText("Congratulations!!"+b1.getLabel()+" won!!");
else if(((b4.getLabel().equals(b5.getLabel()))&&(b5.getLabel().equals(b6.getLabel()))))
p1.setText("Congratulations!!"+b4.getLabel()+" won!!");
else if(((b7.getLabel().equals(b8.getLabel()))&&(b8.getLabel().equals(b9.getLabel()))))
p1.setText("Congratulations!!"+b7.getLabel()+" won!!");
else if(((b1.getLabel().equals(b4.getLabel()))&&(b4.getLabel().equals(b7.getLabel()))))
p1.setText("Congratulations!!"+b1.getLabel()+" won!!");
else if(((b2.getLabel().equals(b5.getLabel()))&&(b5.getLabel().equals(b8.getLabel()))))
p1.setText("Congratulations!!"+b2.getLabel()+" won!!");
else if(((b3.getLabel().equals(b6.getLabel()))&&(b6.getLabel().equals(b9.getLabel()))))
p1.setText("Congratulations!!"+b3.getLabel()+" won!!");
else if(((b3.getLabel().equals(b5.getLabel()))&&(b5.getLabel().equals(b7.getLabel()))))
p1.setText("Congratulations!!"+b3.getLabel()+" won!!");
else if(((b1.getLabel().equals(b5.getLabel()))&&(b5.getLabel().equals(b9.getLabel()))))
p1.setText("Congratulations!!"+b1.getLabel()+" won!!");
else 
p1.setText("    Both Lost    ");
}
if(c==1||c==3||c==5||c==7||c==9)
{
b3.setLabel("O");
c++;
System.out.println("c"+c+"D:"+d);
b3.setForeground(Color.pink);

}
else if(c==0||c==2||c==4||c==6||c==8)
{
b3.setLabel("X");
c++;
System.out.println("c"+c+"D:"+d);
b3.setForeground(Color.cyan);

}
}
if(b4==e.getSource())
{
d++;
if(d==9)
{
if(((b1.getLabel().equals(b2.getLabel()))&&(b2.getLabel().equals(b3.getLabel()))))
p1.setText("Congratulations!!"+b1.getLabel()+" won!!");
else if(((b4.getLabel().equals(b5.getLabel()))&&(b5.getLabel().equals(b6.getLabel()))))
p1.setText("Congratulations!!"+b4.getLabel()+" won!!");
else if(((b7.getLabel().equals(b8.getLabel()))&&(b8.getLabel().equals(b9.getLabel()))))
p1.setText("Congratulations!!"+b7.getLabel()+" won!!");
else if(((b1.getLabel().equals(b4.getLabel()))&&(b4.getLabel().equals(b7.getLabel()))))
p1.setText("Congratulations!!"+b1.getLabel()+" won!!");
else if(((b2.getLabel().equals(b5.getLabel()))&&(b5.getLabel().equals(b8.getLabel()))))
p1.setText("Congratulations!!"+b2.getLabel()+" won!!");
else if(((b3.getLabel().equals(b6.getLabel()))&&(b6.getLabel().equals(b9.getLabel()))))
p1.setText("Congratulations!!"+b3.getLabel()+" won!!");
else if(((b3.getLabel().equals(b5.getLabel()))&&(b5.getLabel().equals(b7.getLabel()))))
p1.setText("Congratulations!!"+b3.getLabel()+" won!!");
else if(((b1.getLabel().equals(b5.getLabel()))&&(b5.getLabel().equals(b9.getLabel()))))
p1.setText("Congratulations!!"+b1.getLabel()+" won!!");
else 
p1.setText("    Both Lost    ");
}
if(c==1||c==3||c==5||c==7||c==9)
{
b4.setLabel("O");
c++;
b4.setForeground(Color.pink);

}
else if(c==0||c==2||c==4||c==6||c==8)
{
b4.setLabel("X");
c++;
b4.setForeground(Color.cyan);

}
}
if(b5==e.getSource())
{
d++;
if(d==9)
{
if(((b1.getLabel().equals(b2.getLabel()))&&(b2.getLabel().equals(b3.getLabel()))))
p1.setText("Congratulations!!"+b1.getLabel()+" won!!");
else if(((b4.getLabel().equals(b5.getLabel()))&&(b5.getLabel().equals(b6.getLabel()))))
p1.setText("Congratulations!!"+b4.getLabel()+" won!!");
else if(((b7.getLabel().equals(b8.getLabel()))&&(b8.getLabel().equals(b9.getLabel()))))
p1.setText("Congratulations!!"+b7.getLabel()+" won!!");
else if(((b1.getLabel().equals(b4.getLabel()))&&(b4.getLabel().equals(b7.getLabel()))))
p1.setText("Congratulations!!"+b1.getLabel()+" won!!");
else if(((b2.getLabel().equals(b5.getLabel()))&&(b5.getLabel().equals(b8.getLabel()))))
p1.setText("Congratulations!!"+b2.getLabel()+" won!!");
else if(((b3.getLabel().equals(b6.getLabel()))&&(b6.getLabel().equals(b9.getLabel()))))
p1.setText("Congratulations!!"+b3.getLabel()+" won!!");
else if(((b3.getLabel().equals(b5.getLabel()))&&(b5.getLabel().equals(b7.getLabel()))))
p1.setText("Congratulations!!"+b3.getLabel()+" won!!");
else if(((b1.getLabel().equals(b5.getLabel()))&&(b5.getLabel().equals(b9.getLabel()))))
p1.setText("Congratulations!!"+b1.getLabel()+" won!!");
else 
p1.setText("    Both Lost    ");
}

if(c==1||c==3||c==5||c==7||c==9)
{
b5.setLabel("O");
c++;
b5.setForeground(Color.pink);

}
else if(c==0||c==2||c==4||c==6||c==8)
{
b5.setLabel("X");
c++;
b5.setForeground(Color.cyan);

}
}
if(b6==e.getSource())
{
d++;
if(d==9)
{
if(((b1.getLabel().equals(b2.getLabel()))&&(b2.getLabel().equals(b3.getLabel()))))
p1.setText("Congratulations!!"+b1.getLabel()+" won!!");
else if(((b4.getLabel().equals(b5.getLabel()))&&(b5.getLabel().equals(b6.getLabel()))))
p1.setText("Congratulations!!"+b4.getLabel()+" won!!");
else if(((b7.getLabel().equals(b8.getLabel()))&&(b8.getLabel().equals(b9.getLabel()))))
p1.setText("Congratulations!!"+b7.getLabel()+" won!!");
else if(((b1.getLabel().equals(b4.getLabel()))&&(b4.getLabel().equals(b7.getLabel()))))
p1.setText("Congratulations!!"+b1.getLabel()+" won!!");
else if(((b2.getLabel().equals(b5.getLabel()))&&(b5.getLabel().equals(b8.getLabel()))))
p1.setText("Congratulations!!"+b2.getLabel()+" won!!");
else if(((b3.getLabel().equals(b6.getLabel()))&&(b6.getLabel().equals(b9.getLabel()))))
p1.setText("Congratulations!!"+b3.getLabel()+" won!!");
else if(((b3.getLabel().equals(b5.getLabel()))&&(b5.getLabel().equals(b7.getLabel()))))
p1.setText("Congratulations!!"+b3.getLabel()+" won!!");
else if(((b1.getLabel().equals(b5.getLabel()))&&(b5.getLabel().equals(b9.getLabel()))))
p1.setText("Congratulations!!"+b1.getLabel()+" won!!");
else 
p1.setText("    Both Lost    ");
}
if(c==1||c==3||c==5||c==7||c==9)
{
b6.setLabel("O");
c++;
b6.setForeground(Color.pink);

}
else if(c==0||c==2||c==4||c==6||c==8)
{
b6.setLabel("X");
c++;
b6.setForeground(Color.cyan);

}
}
if(b7==e.getSource())
{
d++;
if(d==9)
{
if(((b1.getLabel().equals(b2.getLabel()))&&(b2.getLabel().equals(b3.getLabel()))))
p1.setText("Congratulations!!"+b1.getLabel()+" won!!");
else if(((b4.getLabel().equals(b5.getLabel()))&&(b5.getLabel().equals(b6.getLabel()))))
p1.setText("Congratulations!!"+b4.getLabel()+" won!!");
else if(((b7.getLabel().equals(b8.getLabel()))&&(b8.getLabel().equals(b9.getLabel()))))
p1.setText("Congratulations!!"+b7.getLabel()+" won!!");
else if(((b1.getLabel().equals(b4.getLabel()))&&(b4.getLabel().equals(b7.getLabel()))))
p1.setText("Congratulations!!"+b1.getLabel()+" won!!");
else if(((b2.getLabel().equals(b5.getLabel()))&&(b5.getLabel().equals(b8.getLabel()))))
p1.setText("Congratulations!!"+b2.getLabel()+" won!!");
else if(((b3.getLabel().equals(b6.getLabel()))&&(b6.getLabel().equals(b9.getLabel()))))
p1.setText("Congratulations!!"+b3.getLabel()+" won!!");
else if(((b3.getLabel().equals(b5.getLabel()))&&(b5.getLabel().equals(b7.getLabel()))))
p1.setText("Congratulations!!"+b3.getLabel()+" won!!");
else if(((b1.getLabel().equals(b5.getLabel()))&&(b5.getLabel().equals(b9.getLabel()))))
p1.setText("Congratulations!!"+b1.getLabel()+" won!!");
else 
p1.setText("    Both Lost    ");
}

if(c==1||c==3||c==5||c==7||c==9)
{
b7.setLabel("O");
c++;
b7.setForeground(Color.pink);

}
else if(c==0||c==2||c==4||c==6||c==8)
{
b7.setLabel("X");
c++;
b7.setForeground(Color.cyan);

}
}
if(b8==e.getSource())
{
d++;
if(d==9)
{
if(((b1.getLabel().equals(b2.getLabel()))&&(b2.getLabel().equals(b3.getLabel()))))
p1.setText("Congratulations!!"+b1.getLabel()+" won!!");
else if(((b4.getLabel().equals(b5.getLabel()))&&(b5.getLabel().equals(b6.getLabel()))))
p1.setText("Congratulations!!"+b4.getLabel()+" won!!");
else if(((b7.getLabel().equals(b8.getLabel()))&&(b8.getLabel().equals(b9.getLabel()))))
p1.setText("Congratulations!!"+b7.getLabel()+" won!!");
else if(((b1.getLabel().equals(b4.getLabel()))&&(b4.getLabel().equals(b7.getLabel()))))
p1.setText("Congratulations!!"+b1.getLabel()+" won!!");
else if(((b2.getLabel().equals(b5.getLabel()))&&(b5.getLabel().equals(b8.getLabel()))))
p1.setText("Congratulations!!"+b2.getLabel()+" won!!");
else if(((b3.getLabel().equals(b6.getLabel()))&&(b6.getLabel().equals(b9.getLabel()))))
p1.setText("Congratulations!!"+b3.getLabel()+" won!!");
else if(((b3.getLabel().equals(b5.getLabel()))&&(b5.getLabel().equals(b7.getLabel()))))
p1.setText("Congratulations!!"+b3.getLabel()+" won!!");
else if(((b1.getLabel().equals(b5.getLabel()))&&(b5.getLabel().equals(b9.getLabel()))))
p1.setText("Congratulations!!"+b1.getLabel()+" won!!");
else 
p1.setText("    Both Lost    ");
}
if(c==1||c==3||c==5||c==7||c==9)
{
b8.setLabel("O");
c++;
b8.setForeground(Color.pink);

}
else if(c==0||c==2||c==4||c==6||c==8)
{
b8.setLabel("X");
c++;
b8.setForeground(Color.cyan);

}
}
if(b9==e.getSource())
{
d++;
if(d==9)
{
if(((b1.getLabel().equals(b2.getLabel()))&&(b2.getLabel().equals(b3.getLabel()))))
p1.setText("Congratulations!!"+b1.getLabel()+" won!!");
else if(((b4.getLabel().equals(b5.getLabel()))&&(b5.getLabel().equals(b6.getLabel()))))
p1.setText("Congratulations!!"+b4.getLabel()+" won!!");
else if(((b7.getLabel().equals(b8.getLabel()))&&(b8.getLabel().equals(b9.getLabel()))))
p1.setText("Congratulations!!"+b7.getLabel()+" won!!");
else if(((b1.getLabel().equals(b4.getLabel()))&&(b4.getLabel().equals(b7.getLabel()))))
p1.setText("Congratulations!!"+b1.getLabel()+" won!!");
else if(((b2.getLabel().equals(b5.getLabel()))&&(b5.getLabel().equals(b8.getLabel()))))
p1.setText("Congratulations!!"+b2.getLabel()+" won!!");
else if(((b3.getLabel().equals(b6.getLabel()))&&(b6.getLabel().equals(b9.getLabel()))))
p1.setText("Congratulations!!"+b3.getLabel()+" won!!");
else if(((b3.getLabel().equals(b5.getLabel()))&&(b5.getLabel().equals(b7.getLabel()))))
p1.setText("Congratulations!!"+b3.getLabel()+" won!!");
else if(((b1.getLabel().equals(b5.getLabel()))&&(b5.getLabel().equals(b9.getLabel()))))
p1.setText("Congratulations!!"+b1.getLabel()+" won!!");
else 
p1.setText("Both Lost");
}
if(c==1||c==3||c==5||c==7||c==9)
{
b9.setLabel("O");
c++;
b9.setForeground(Color.pink);

}
else  if(c==0||c==2||c==4||c==6||c==8)
{
b9.setLabel("X");
c++;
b9.setForeground(Color.cyan);

}
}
}
public void paint(Graphics g)
{
g.drawLine(155,90,155,280);
g.drawLine(215,90,215,280);
g.drawLine(90,155,280,155);
g.drawLine(90,215,280,215);
}
}

