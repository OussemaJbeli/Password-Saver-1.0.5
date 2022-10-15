
package graph;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;



public class J_change_Image extends JFrame
{
    
    IMAGE I = new IMAGE();
    ImageIcon image1=new ImageIcon("image\\login\\Untitled-1.png");
    JLabel L1 = new JLabel(image1);

    JRadioButton R1 = new JRadioButton("image 1");
    JRadioButton R2 = new JRadioButton("image 2");
    JRadioButton R3 = new JRadioButton("image 3");
    JRadioButton R4 = new JRadioButton("image 4");
    JRadioButton R5 = new JRadioButton("image 5");
    JRadioButton R6 = new JRadioButton("image 6");
    JRadioButton R7 = new JRadioButton("image 7");
    JRadioButton R8 = new JRadioButton("image 8");
    ButtonGroup R = new ButtonGroup();
    
    
    
    public J_change_Image()
    {
        setLocation(200,200);
        setVisible(true);
        setSize(1200,400);
        setResizable(false);
        setIconImage();

        
        R1.setBounds(100, 150, 100,30);
        R1.setBackground(Color.darkGray);
        R1.setForeground(Color.white);
        R2.setBounds(400, 150, 100,30);
        R2.setBackground(Color.darkGray);
        R2.setForeground(Color.white);
        R3.setBounds(700, 150, 100,30);
        R3.setBackground(Color.darkGray);
        R3.setForeground(Color.white);
        R4.setBounds(1000,150, 100,30);
        R4.setBackground(Color.darkGray);
        R4.setForeground(Color.white);
        R5.setBounds(100, 325, 100,30);
        R5.setBackground(Color.darkGray);
        R5.setForeground(Color.white);
        R6.setBounds(400, 325, 100,30);
        R6.setBackground(Color.darkGray);
        R6.setForeground(Color.white);
        R7.setBounds(700, 325, 100,30);
        R7.setBackground(Color.darkGray);
        R7.setForeground(Color.white);
        R8.setBounds(1000, 325, 100,30);
        R8.setBackground(Color.darkGray);
        R8.setForeground(Color.white);
        
        
        R.add(R1);R.add(R2);R.add(R3);R.add(R4);R.add(R5);R.add(R6);R.add(R7);R.add(R8);
        
        this.add(R1);this.add(R2);this.add(R3);this.add(R4);this.add(R5);this.add(R6);this.add(R7);this.add(R8);

        this.add(L1);
        R1.addActionListener(I);
        R2.addActionListener(I);
        R3.addActionListener(I);
        R4.addActionListener(I);
        R5.addActionListener(I);
        R6.addActionListener(I);
        R7.addActionListener(I);
        R8.addActionListener(I);
        
        
    }
private void setIconImage() 
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("PasswordRecorder_logo.png")));
    }
    class IMAGE implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {   
            ImageIcon picture1;
            if(e.getSource()==R1)
            {
                String f ="image\\login\\cool-anime-wallpaper-hd22.jpg";
                B_Log_in_fram LO = new B_Log_in_fram();
                LO.frame(f);
                setVisible(false);
                
            }

            if(e.getSource()==R2)
            {
                String f ="image\\login\\3.jpg";
                B_Log_in_fram LO = new B_Log_in_fram();
                LO.frame(f);
                setVisible(false);
            }

            if(e.getSource()==R3)
            {
                String f ="image\\login\\4.jpg";
                B_Log_in_fram LO = new B_Log_in_fram();
                LO.frame(f);
                setVisible(false);
            }

            if(e.getSource()==R4)
            {
                String f ="image\\login\\104653112712.jpg";
                B_Log_in_fram LO = new B_Log_in_fram();
                LO.frame(f);
                setVisible(false);
            }

            if(e.getSource()==R5)
            {
                String f ="image\\login\\wallpaperflare.com_wallpaper (5)2.jpg";
                B_Log_in_fram LO = new B_Log_in_fram();
                LO.frame(f);
                setVisible(false);
            }

            if(e.getSource()==R6)
            {
                String f ="image\\login\\2.jpg";
                B_Log_in_fram LO = new B_Log_in_fram();
                LO.frame(f);
                setVisible(false);
            }

            if(e.getSource()==R7)
            {
                String f ="image\\login\\1.jpg";
                B_Log_in_fram LO = new B_Log_in_fram();
                LO.frame(f);
                setVisible(false);
            }
            if(e.getSource()==R8)
            {
                String f ="image\\login\\6063012.jpg";
                B_Log_in_fram LO = new B_Log_in_fram();
                LO.frame(f);
                setVisible(false);
            }
              
        }
    
    }
   
}
