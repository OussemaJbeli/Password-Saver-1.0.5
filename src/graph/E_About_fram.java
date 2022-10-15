
package graph;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class E_About_fram extends JFrame
{
    Hp P = new Hp();
    
    JButton B1 =new JButton("close");
    JLabel L1 = new JLabel("About");
    JLabel L2 = new JLabel("Password_Recorder");
    JLabel L3 = new JLabel("Software version 1.0.0");
    ImageIcon image=new ImageIcon("image\\logo\\PasswordRecorder_logo2.png");
    JLabel L4 = new JLabel(image);
   
    public E_About_fram()
    {
        setIconImage();
         //about fram
        setSize(450, 350);
        setTitle("Password_Recorder");
        setLocation(500,175);
        setResizable(false);
        setVisible(true);   

        B1.setBounds(175,270,100,30);
        B1.setBackground(Color.black);
        B1.setForeground(Color.green);
        
        L1.setBounds(190,50,225,30);
        L1.setFont(new Font("atilic",Font.BOLD,25));
        L2.setBounds(150,210,225,30);
        L2.setFont(new Font("atilic",Font.BOLD,15));
        L3.setBounds(170,240,225,30);
        L3.setFont(new Font("atilic",Font.BOLD,10));
        L3.setForeground(Color.DARK_GRAY);
        
        L4.add(B1);
        L4.add(L1);L4.add(L2);L4.add(L3);
        
        this.add(L4);
        
        B1.addActionListener(P);

        
       
    }
    private void setIconImage() 
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("PasswordRecorder_logo.png")));
    }
    private class Hp implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            if(e.getSource()==B1)
            {
                
                B_Log_in_fram L = new B_Log_in_fram();
                setVisible(false);
               
            }
    
        }

    }
   
}
