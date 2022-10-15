
package graph;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Base64;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class C_Help_fram extends JFrame
{
    Ab P1 = new Ab();
    JPanel P = new JPanel();
    JButton B1 =new JButton("Done ");
    JButton B2 =new JButton("Cancel");
    JButton B4 =new JButton("Verifier");
    JLabel L1 = new JLabel("Verify security question");
    JLabel L2 = new JLabel("Verify security question");
    JLabel L3 = new JLabel("Verify security question");
    JLabel L5 = new JLabel("enter user name");
    ImageIcon image=new ImageIcon("image\\login\\6063012.jpg");
    JLabel L4= new JLabel(image);
    JTextField T1 = new JTextField();
    JTextField T2 = new JTextField();
    JTextField T3 = new JTextField();
    String u,user,password,q1,q2,e1,e2;
    
    C_Help_fram()
    {

        setIconImage();
        //help frame
        setSize(600, 450);
        setTitle("Password_Recorder");
        setLocation(500,175);
        setResizable(false);
        setVisible(true);   
           
        
        P.setBackground(Color.darkGray);
        P.setLayout(null);
        
        B1.setBounds(375,370,100,30);
        B1.setBackground(Color.black);
        B1.setForeground(Color.blue);
        B1.setVisible(false);
        
        B2.setBounds(125,370,100,30);
        B2.setBackground(Color.black);
        B2.setForeground(Color.blue);
        B2.setVisible(false);
        
        B4.setBounds(340,80,100,30);
        B4.setBackground(Color.black);
        B4.setForeground(Color.blue);
        

        L5.setBounds(225,40,225,30);
        L5.setForeground(Color.white);
        L5.setFont(new Font("atilic",Font.BOLD,20));
        L1.setBounds(175,140,225,30);
        L1.setForeground(Color.white);
        L1.setFont(new Font("atilic",Font.BOLD,20));
        L1.setVisible(false);
        
        T3.setBounds(110,80,225,30);
        T1.setBounds(10,230,225,30);
        T1.setVisible(false);
        T2.setBounds(10,300,225,30);
        T2.setVisible(false);
        
        
        L4.add(B1);L4.add(B2);L4.add(B4);        
        L4.add(L1);L4.add(L2);L4.add(L3);L4.add(L5);        
        L4.add(T1);L4.add(T2);L4.add(T3);
        this.add(L4);
        
        B1.addActionListener(P1);
        B2.addActionListener(P1);
        B4.addActionListener(P1);
        
    }
    private void setIconImage() 
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("PasswordRecorder_logo.png")));
    }
    private class Ab implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)  
        {

            //verification
            if(e.getSource()==B1)
            {
                String L1 = T1.getText().toString();
                String L2 = T2.getText().toString();
                if((L1.equals(e1))&&(L2.equals(e2)))
                {
                    JOptionPane.showMessageDialog(null,user+"\nyour password :: "+password);
                    T1.setText("");
                    T2.setText("");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"    incorrect answers");
                    T1.setText("");
                    T2.setText("");
                }   
               
            }
            //close
            if(e.getSource()==B2)
            {
                B_Log_in_fram L = new B_Log_in_fram();
                setVisible(false); 
               
            }
            //change image
            if(e.getSource()==B4)
                
            {
                u=T3.getText();
                try 
                {

                    //reads the file
                    File fis=new File(u+".txt");
                    Scanner sc=new Scanner(fis);   
                    String[] Tab = new String[6];
                    int i;
                    for(i=0;i<=5;i++)
                    {
                        Tab[i]=sc.nextLine();
                    }
                    user=Tab[0];
                    String password2=Tab[1];
                    Base64.Decoder decod = Base64.getDecoder();                    
                    byte[] pp = decod.decode(password2);
                    password = new String(pp);
                    q1=Tab[2];
                    e1=Tab[3];
                    q2=Tab[4];
                    e2=Tab[5];
                    L2.setText(q1);
                    L3.setText(q2);
                    L2.setBounds(10,200,225,30);
                    L2.setForeground(Color.white);
                    L2.setVisible(true);
                    L3.setBounds(10,260,225,50);
                    L3.setForeground(Color.white);
                    L3.setVisible(true);
                    B1.setVisible(true);
                    B2.setVisible(true);
                    T1.setVisible(true);
                    T2.setVisible(true);
                    L1.setVisible(true);
                    
                }
                catch (FileNotFoundException ex) 
                {
                    JOptionPane.showMessageDialog(null,"user no found");
                }
                
                
            }
        }

    } 
       
}
