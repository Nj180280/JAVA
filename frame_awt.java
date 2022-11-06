import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 
class frame_awt
{
    public static void main(String[] args) 
    {
JFrame j1=new JFrame("FRAME 1"); 
j1.setVisible(true); 
j1.setSize(700,600); 
j1.setResizable(false); 
j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
j1.getContentPane().setBackground(Color.BLUE);

//ImageIcon img=new ImageIcon("logo.png"); adds image 
//j1.setImageIcon(img.getImage()); 
    }
}