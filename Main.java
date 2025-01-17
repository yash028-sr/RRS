import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Main implements ActionListener
{
JFrame f;
JButton b1,b2,b3,b4;
Reservation r;
Enquiry q;
Cancellation c;
JLabel imgL;
ImageIcon img;
Main()
{
img=new ImageIcon("Indian-Railway-Network.jpg");
imgL=new JLabel(img);
imgL.setBounds(0,0,1826,2000);
f=new JFrame("Main");
f.getContentPane().setLayout(null);
f.getContentPane().setBackground(Color.green);
b1=new JButton("Reservation Form");
b1.addActionListener(this);
b1.setBounds(150,390,210,60);
b2=new JButton("PNR-enquiry");
b2.addActionListener(this);
b2.setBounds(150,490,210,60);
b3=new JButton("Cancellation Form");
b3.addActionListener(this);
b3.setBounds(580,390,210,60);
b4=new JButton("Exit");
b4.addActionListener(this);
b4.setBounds(580,490,210,60);

b1.setBackground(new Color(100,200,0));
b1.setForeground(new Color(255,255,255));
b2.setBackground(new Color(100,200,0));
b2.setForeground(new Color(255,255,255));
b3.setBackground(new Color(100,200,0));
b3.setForeground(new Color(255,255,255));
b4.setBackground(new Color(100,200,0));
b4.setForeground(new Color(255,255,255));

b1.setMnemonic('R');
b2.setMnemonic('P');
b3.setMnemonic('C');
b4.setMnemonic('E');

f.getContentPane().add(b1);
f.getContentPane().add(b2);
f.getContentPane().add(b3);
f.getContentPane().add(b4);
f.getContentPane().add(imgL);
f.setSize(1826,2000);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
f.setVisible(false);
r=new Reservation();
}
if(e.getSource()==b2)
{
f.setVisible(false);
q=new Enquiry();
}
if(e.getSource()==b3)
{
f.setVisible(false);
c=new Cancellation();
}
if(e.getSource()==b4)
{
f.setVisible(false);
System.exit(0);
}
}
public static void main(String args[])
{
new Main();
}
}
