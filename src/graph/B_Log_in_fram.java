
package graph;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Base64;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class B_Log_in_fram extends JFrame
{
    
    String user,password,p;
    JButton B1 =new JButton("log in");
    JButton B2 =new JButton("creat new");
    JButton B3 =new JButton("Forget Password");
    JButton B4 =new JButton("cancel");
    JButton B6 =new JButton("Change Image            ");
    JTextField T1 = new JTextField();
    JTextField T2 = new JTextField();
    JLabel L1 = new JLabel("user name");
    JLabel L2 = new JLabel("password");
    JLabel L3 = new JLabel("WELCOME !!");
    JLabel L4 = new JLabel();
    JCheckBox C1 = new JCheckBox("Show Password");
    JPasswordField Pass = new JPasswordField();
    JMenu m1 = new JMenu("view");
    JMenu m2 = new JMenu("help");
    JMenuBar M = new JMenuBar();
    act A = new act();
    itm I = new itm();

    public B_Log_in_fram() throws HeadlessException 
    {
        setIconImage();
    }
    
    
    public void frame (String hh)
    {
        //creat Frame
        setSize(600, 450);
        setTitle("Password_Recorder");
        setLocation(500,175);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);   
        
        
        
        this.p=hh;
        ImageIcon ph = new ImageIcon(p);
        L4 = new JLabel(ph);

        //composent
        
        
        B1.setBounds(250,270,100,30);
        B1.setBackground(Color.black);
        B1.setForeground(Color.blue);
        
        B2.setBounds(470,370,100,30);
        B2.setBackground(Color.blue);
        B2.setForeground(Color.white);

       
        B4.setBounds(10,370,100,30);
        B4.setBackground(Color.blue);
        B4.setForeground(Color.white);
        
        B3.setBackground(Color.darkGray);
        B3.setForeground(Color.white);

        B6.setBackground(Color.darkGray);
        B6.setForeground(Color.white);
        
        L1.setBounds(50,145,225,30);
        L1.setForeground(Color.white);
        L2.setBounds(325,145,225,30);
        L2.setForeground(Color.white);
        L3.setBounds(240,30,225,50);
        L3.setForeground(Color.white);
        L3.setFont(new Font("atilic",Font.BOLD,20));
        
        
        T1.setBounds(50,185,225,30);
        T1.setBackground(Color.darkGray);
        T1.setForeground(Color.white);
        T2.setBounds(325,185,225,30);
        T2.setBackground(Color.darkGray);
        T2.setForeground(Color.white);
        Pass.setBounds(325,185,225,30);
        Pass.setBackground(Color.darkGray);
        Pass.setForeground(Color.white);
        
        C1.setBounds(325,215,225,20);
        C1.setBackground(Color.darkGray);
        C1.setForeground(Color.white);
        
        M.setBounds(0,0,this.getWidth(),30); 
        M.setBackground(Color.darkGray);
        
        m1.setForeground(Color.white);
        m2.setForeground(Color.white);
        
        //show menu
        m1.add(B6);
        m2.add(B3);
        M.add(m1);M.add(m2);
        L4.add(M);
        
        
        //show composent
        L4.add(B1);L4.add(B2);L4.add(B4);
        
        L4.add(L1);L4.add(L2);L4.add(L3);
        
        L4.add(T1);L4.add(Pass);
        
        L4.add(T2);
        
        L4.add(C1);
         
        this.add(L4);

        //events
        C1.addItemListener(I);
        B1.addActionListener(A);
        B2.addActionListener(A);
        B3.addActionListener(A);
        B4.addActionListener(A);
        B6.addActionListener(A);

    }
    boolean check = false;

    private void setIconImage() 
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("PasswordRecorder_logo.png")));
    }
        
    //action
    private class act implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        {
            boolean g=true;
            //log in
            if(e.getSource()== B1)
            {
                String LL1 = T1.getText().toString();
                char[] LL2 = Pass.getPassword();
                String LL3 = T2.getText().toString();
                try 
                {
                    
                    //reads the file
                    File fis=new File(LL1+".txt");
                    Scanner sc=new Scanner(fis);   
                    String[] Tab = new String[2];
                    int i;
                    for(i=0;i<=1;i++)
                    {
                        Tab[i]=sc.nextLine();
                    }
                    user=Tab[0];
                    String password2=Tab[1];
                    Base64.Decoder decod = Base64.getDecoder();                    
                    byte[] pp = decod.decode(password2);
                    password = new String(pp);
                }
                catch (Exception ex) 
                {
                    System.out.print("file not found");
                }

                    //coder password

                    
                    if(check == true)
                    {
                        if(LL1.length()==0 )
                        {
                            JOptionPane.showMessageDialog(null,"user impti\ncreat again");
                        }
                        
                        else if(LL3.length()==0 )
                        {
                            JOptionPane.showMessageDialog(null,"password impti\ncreat again");
                        }
                        
                        else if((LL1.equals(user))&&(LL3.equals(password)))
                        {
                            
                            try {
                                
                                Data_fram Df = new Data_fram(user,password);
                                
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(B_Log_in_fram.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            setVisible(false);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"user or password incorrect\ncreat again");
                        }
                        
                        
                        
                    }   if(check == false)
                    {
                        if(LL1.length()==0 )
                        {
                            JOptionPane.showMessageDialog(null,"user impti\ncreat again");
                        }
                        
                        else if(LL2.length==0 )
                        {
                            JOptionPane.showMessageDialog(null,"password impti\ncreat again");
                        }
                        else if((LL1.equals(user))&&(LL2.equals(password)))
                        {

                            try {
                                
                                Data_fram Df = new Data_fram(user,password);
                                
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(B_Log_in_fram.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            setVisible(false);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"user or password incorrect\ncreat again");
                        }
                        
                        
                        
                    }
                  

            }
            //new user
            if(e.getSource()==B2)
            {
                D_Creat_new C = new D_Creat_new();
                
            }
            
            //help
            if(e.getSource()== B3)
            {
                C_Help_fram H = new C_Help_fram();
                
            }
            //exite
            if(e.getSource()== B4)
            {
                System.exit(0);
                
            }
            //image
             if(e.getSource()== B6)
            {
                J_change_Image JC = new J_change_Image();
                setVisible(false);
            }
        }
    }
    
    //items
     class itm implements ItemListener
    {

        @Override
        public void itemStateChanged(ItemEvent e) 
        {
            if(C1.isSelected())
            {
                String TT2="";
                char[] L = Pass.getPassword();
                for(int i=0;i<L.length;i++)
                {
                    TT2 = TT2+""+L[i]; 
                }
                T2.setText(TT2);
                Pass.setVisible(false);
                T2.setVisible(true);
                check = true;
            }
            else
            {
                String L = T2.getText().toString();
                Pass.setText(L);
                Pass.setVisible(true);
                T2.setVisible(false);
                check = false;
            }   
        }
    }   
}
    

