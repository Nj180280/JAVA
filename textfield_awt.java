import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*;
import javax.swing.border.Border;
class MyFrame extends JFrame implements ActionListener
{
    JFrame j1=new JFrame(); 
    JTextField t1=new JTextField(); 
    JButton b1=new JButton("SUBMIT"); 
    MyFrame()
    {
        j1.setVisible(true);
        j1.setLayout(new FlowLayout());
        j1.setSize(500,500); 
        j1.setDefaultCloseOperation(j1.EXIT_ON_CLOSE);
        j1.setTitle("TEXT FIELD");

        t1.setPreferredSize(new Dimension(250,40));
        j1.add(t1); 

        j1.add(b1); 
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==b1)
        {
            System.out.println("HELLO "+t1.getText()); 
            b1.setEnabled(true); //allow button to be used 
            t1.setEditable(false);
        }
    }

}
public class textfield_awt
{
    public static void main(String[] args) 
    {
        MyFrame f1=new MyFrame(); 
    }
}
