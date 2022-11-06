import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*;
import javax.swing.border.Border;
class MyFrame extends JFrame implements ActionListener
{
    JFrame j1=new JFrame(); 
    JButton b1=new JButton("SUBMIT"); 
    MyFrame()
    {
        j1.setVisible(true);
        j1.setLayout(null);
        j1.setSize(500,500); 
        j1.setDefaultCloseOperation(j1.EXIT_ON_CLOSE);
        j1.setTitle("NEW WINDOW");

b1.setBounds(250,250,150,60); 
b1.setForeground(Color.RED); 
        b1.addActionListener(this);
j1.add(b1); 
    }
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==b1)
        {
          j1.dispose(); 
          NewWindow w1=new NewWindow();
        }
    }
class NewWindow
{
    NewWindow()
    {
JFrame j2=new JFrame("NEW WINDOW 2"); 
j2.setSize(500,500); 
j2.setDefaultCloseOperation(j2.EXIT_ON_CLOSE);
j2.setVisible(true);
j2.setLayout(null);
    }
}
}
class newwindow_awt
{
    public static void main(String[] args) 
    {
        MyFrame f1=new MyFrame(); 
    }
}
