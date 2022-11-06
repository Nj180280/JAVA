import java.util.*; 
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
class myframe extends JFrame implements ActionListener
{
    JFrame j1; 
    JMenuBar mb1; 
    JMenu m1; 
    JMenu m2; 
    JMenu m3; 
    JMenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8,mi9,mi10; 
    JTextArea ta1; 
    myframe()
    {
        j1=new JFrame("MENUBAR"); 
        j1.setSize(800,900); 
        j1.setVisible(true); 
        j1.setLayout(null); 
        j1.setDefaultCloseOperation(j1.EXIT_ON_CLOSE); 

        mb1=new JMenuBar(); 
        j1.setJMenuBar(mb1); 
        j1.add(mb1); 

        m1=new JMenu("FILE"); 
        mb1.add(m1); 
        m2=new JMenu("EDIT"); 
        mb1.add(m2); 
        m3=new JMenu("HELP"); 
        mb1.add(m3);

        mi1=new JMenuItem("OPEN"); 
        m1.add(mi1); 
        mi2=new JMenuItem("SAVE"); 
        m1.add(mi2);
        mi3=new JMenuItem("NEW FILE"); 
        m1.add(mi3);
        mi4=new JMenuItem("CLOSE"); 
        m1.add(mi4);
        mi5=new JMenuItem("CUT"); 
        m2.add(mi5);    
        mi5.addActionListener(this); 
        mi6=new JMenuItem("COPY"); 
        m2.add(mi6);   
        mi6.addActionListener(this); 
        mi7=new JMenuItem("PASTE"); 
        m2.add(mi7);
        mi7.addActionListener(this);
        mi8=new JMenuItem("SELECT ALL"); 
        m2.add(mi8);
        mi9=new JMenuItem("FEEDBACK"); 
        m3.add(mi9);         
        mi10=new JMenuItem("EXIT"); 
        m3.add(mi10); 
        
        ta1=new JTextArea(); 
        ta1.setBounds(0,200,800,700);
        j1.add(ta1); 
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==mi5)
        {
            ta1.cut(); 
        }
        if(ae.getSource()==mi6)
        {
            ta1.copy(); 
        }
        if(ae.getSource()==mi7)
        {
            ta1.paste(); 
        }
        if(ae.getSource()==mi8)
        {
            ta1.selectAll(); 
        }
        if(ae.getSource()==mi10)
        {
            System.exit(0); 
        }
    }
} 
class menubar_awt
{
    public static void main(String[] args) 
    {
        myframe f1=new myframe(); 
    }
}