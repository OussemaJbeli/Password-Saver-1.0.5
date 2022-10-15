
package graph;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileWriter;
import java.util.Base64;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class D_Creat_new extends JFrame 
{
    Creat C = new Creat();
    VISIT V = new VISIT();
    JButton B1 = new JButton("creat");
    JButton B2 = new JButton("cancel");
    JButton B3 = new JButton("Change Image");
    JButton B4 = new JButton("...");
    JButton B5 = new JButton("...");
    JButton B6 = new JButton("What is your father's name?");
    JButton B7 = new JButton("What is your mather's name?");
    JButton B8 = new JButton("What is your first school name?");
    JButton B9 = new JButton("Where are you borne?");
    JButton B10 = new JButton("What is your pet's name?");
    JButton B11= new JButton("What is the first film you watched?");
    JCheckBox C1 = new JCheckBox("View Password");
    JTextField T1 = new JTextField();
    JTextField T2 = new JTextField();
    JTextField T3 = new JTextField();
    JTextField T4 = new JTextField("shouse a question from the list");
    JTextField T5 = new JTextField();
    JTextField T6 = new JTextField("shouse a question from the list");
    JTextField T7 = new JTextField();
    JLabel L8 = new JLabel("                                                 Creat new");
    JLabel L1 = new JLabel("user name");
    JLabel L2 = new JLabel("password");
    JLabel L4 = new JLabel("(the password must contain at least 8 characters )");
    JLabel L3 = new JLabel("confirm password");
    JLabel L6 = new JLabel("                                     Password security question");
    JLabel L7 = new JLabel("Please remember the answer to your security question.\nit can helpe you retrieve your password in case \nyou forget it.");
    ImageIcon image=new ImageIcon("image\\creat new\\V3.jpg");
    JLabel L5= new JLabel(image);



    JPasswordField Pass2 = new JPasswordField();
    JPasswordField Pass3 = new JPasswordField();
    String LL1,LL2,LL3,PP2,PP3,K1,K2,K3,K4,K5,K6,R1,R2,R3,R4;
    String user,password;
    boolean chek = false;
    int i;
   
    public D_Creat_new()
    {
        setIconImage();
        setSize(700, 720);
        setTitle("Password_Recorder");
        setLocation(450,50);
        setResizable(false);
        setVisible(true);
        
        
        
        
        B1.setBounds(580,610,100,30);
        B1.setBackground(Color.black);
        B1.setForeground(Color.blue);
        
        B2.setBounds(10,610,100,30);
        B2.setBackground(Color.black);
        B2.setForeground(Color.blue);
        B4.setBounds(235,420,30,30);
        B4.setBackground(Color.black);
        B4.setForeground(Color.blue);
        B5.setBounds(235,500,30,30);
        B5.setBackground(Color.black);
        B5.setForeground(Color.blue);
        
        B3.setBackground(Color.darkGray);
        B3.setForeground(Color.white);
       
        B6.setBounds(235,420,250,30);
        B6.setVisible(false);
        B6.setBackground(Color.black);
        B6.setForeground(Color.blue);
        B7.setBounds(235,450,250,30);
        B7.setVisible(false);
        B7.setBackground(Color.black);
        B7.setForeground(Color.blue);
        B8.setBounds(235,480,250,30);
        B8.setVisible(false);
        B8.setBackground(Color.black);
        B8.setForeground(Color.blue);
        B9.setBounds(235,510,250,30);
        B9.setVisible(false);
        B9.setBackground(Color.black);
        B9.setForeground(Color.blue);
        B10.setBounds(235,540,250,30);
        B10.setVisible(false);
        B10.setBackground(Color.black);
        B10.setForeground(Color.blue);
        B11.setBounds(235,570,250,30);
        B11.setVisible(false);
        B11.setBackground(Color.black);
        B11.setForeground(Color.blue);
        
        Pass2.setBounds(10,160,225,30);
        Pass3.setBounds(10,220,225,30);
        
        T1.setBounds(10,100,225,30);
        T2.setBounds(10,160,225,30);
        T3.setBounds(10,220,225,30);
        T4.setBounds(10,420,225,30);
        T5.setBounds(10,460,225,30);
        T6.setBounds(10,500,225,30);
        T7.setBounds(10,540,225,30);
        
        L8.setBounds(10,40,500,30);
        L8.setForeground(Color.white);
        L8.setFont(new Font("atilic",Font.BOLD,20));
        L1.setBounds(10,70,225,30);
        L1.setForeground(Color.white);
        L2.setBounds(10,130,225,30);
        L2.setForeground(Color.white);
        L4.setBounds(70,130,400,30);
        L4.setForeground(Color.lightGray);
        L3.setBounds(10,190,225,30);
        L3.setForeground(Color.white);
        L6.setBounds(10,320,700,30);
        L6.setForeground(Color.white);
        L6.setFont(new Font("atilic",Font.BOLD,20));
        L7.setBounds(10,360,700,60);
        L7.setForeground(Color.white);

        C1.setBounds(10,250,225,20);
        C1.setBackground(Color.darkGray);
        C1.setForeground(Color.white);
        
        
        
        L5.add(Pass2);L5.add(Pass3);
        
        L5.add(C1);
        
        L5.add(B1);L5.add(B2);L5.add(B4);L5.add(B5);L5.add(B6);L5.add(B7);L5.add(B8);L5.add(B9);L5.add(B10);L5.add(B11);
        
        L5.add(T1);L5.add(T2);L5.add(T3);L5.add(T4);L5.add(T5);L5.add(T6);L5.add(T7);
        
        L5.add(L1);L5.add(L2);L5.add(L3);L5.add(L4);L5.add(L6);L5.add(L7);L5.add(L8);
        
        this.add(L5);
        
        B1.addActionListener(V);
        B2.addActionListener(V);
        B3.addActionListener(V);
        B4.addActionListener(V);
        B5.addActionListener(V);
        B6.addActionListener(V);
        B7.addActionListener(V);
        B8.addActionListener(V);
        B9.addActionListener(V);
        B10.addActionListener(V);
        B11.addActionListener(V);
        
        C1.addItemListener(C);
        
    }

    private void setIconImage() 
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("PasswordRecorder_logo.png")));
    }
       
        

    class Creat implements ItemListener
    {
        
        @Override
        public void itemStateChanged(ItemEvent e) 
        {

            if(C1.isSelected())
                {
                    char[] L2 = Pass2.getPassword();
                    String TT2="";
                    for(int i=0;i<L2.length;i++)
                    {
                        TT2 = TT2+""+L2[i]; 
                    }
                    T2.setText(TT2);
                    Pass2.setVisible(false);
                    T2.setVisible(true);
                    char[] L3 = Pass3.getPassword();
                    String TT3="";
                    for(int i=0;i<L2.length;i++)
                    {
                        TT3 = TT3+""+L3[i]; 
                    }
                    T2.setText(TT2);
                    
                    T3.setText(TT3);
                    Pass3.setVisible(false);
                    T3.setVisible(true);
                    chek=true;
                }
                else
                {
                    String L2 = T2.getText().toString();
                    Pass2.setText(L2);
                    Pass2.setVisible(true);
                    T2.setVisible(false);
                    String L3 = T3.getText().toString();
                    Pass3.setText(L3);
                    Pass3.setVisible(true);
                    T3.setVisible(false);
                    chek=false;
                }   
        }
    }

    class VISIT implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            K1=B6.getText();
            K2=B7.getText();
            K3=B8.getText();
            K4=B9.getText();
            K5=B10.getText();
            K6=B11.getText();
            R1=T4.getText();
            R2=T5.getText();
            R3=T6.getText();
            R4=T7.getText();
            //avatar
            
            

            //creat
            if(e.getSource()==B1)
            {
                LL1=T1.getText().toString();
                LL2=T2.getText().toString();
                LL3=T3.getText().toString();
                char[]PP2=Pass2.getPassword();
                char[]PP3=Pass3.getPassword();
                
                if(chek==true)
                {
                    if(LL2.equals(LL3))
                    {   if(LL1.length()==0 )
                        {
                            JOptionPane.showMessageDialog(null,"user impti\ncreat again");
                        }
                        else if(LL1.length()>12 )
                        {
                            JOptionPane.showMessageDialog(null,"user very lenge\ncreat again");
                        }
                        else if(LL2.length()==0 )
                        {
                            JOptionPane.showMessageDialog(null,"password impti\ncreat again");
                        }
                        else if(LL2.length()<8 )
                        {
                            JOptionPane.showMessageDialog(null,"the password must contain at least 8 characters \ncreat again");
                        }
                        else if(R1.equals("shouse a question from the list"))
                        {
                            JOptionPane.showMessageDialog(null,"plese select a question from the list \nand answer to the it");
                        }
                        else if(R2.length()==0 )
                        {
                            JOptionPane.showMessageDialog(null,"plese select a question from the list  \nand answer to the it");
                        }
                        
                        else if(R1.equals("shouse a question from the list"))
                        {
                            JOptionPane.showMessageDialog(null,"plese select a second question from the list \nand answer to the it");
                        }
                        else if(R4.length()==0 )
                        {
                            JOptionPane.showMessageDialog(null,"plese select a second question from the list \nand answer to the it");
                        }
                        else
                        {

                            setVisible(false);
                          
                                    
                            user=LL1;
                            password=LL2;
                            
                            
                            Base64.Encoder encod = Base64.getEncoder();
                            //coder pass
                            String password2 = encod.encodeToString(password.getBytes());
                            try 
                            {
                                FileWriter in = new FileWriter(user+".txt",true);
                                FileWriter f = new FileWriter(user+"facebockdata.txt",true);
                                FileWriter g = new FileWriter(user+"G-maildata.txt",true);
                                FileWriter other = new FileWriter(user+"otherdata.txt",true);
                                in.write(user+"\n"+password2+"\n"+R1+"\n"+R2+"\n"+R3+"\n"+R4+"\n");
                                in.close();
                                g.write("type\nuser\ne-mail\npassword\nphone Number\ndate of last modification \n");
                                g.close();
                                f.write("user\ne-mail\npassword\nemail saver\nphone Number\ndate of last modification \n");
                                f.close();
                                other.close();
                                
                                
                                
                            } 
                            catch (Exception ex) 
                            {
                                JOptionPane.showMessageDialog(null,"Error");
                            }
                            D_chouse_Pic_fornew ch = new D_chouse_Pic_fornew(user);
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"password incompatible\ncreat again");
                    }
                }
                if(chek==false)
                {
                    if(PP2.equals(PP3))
                    {   if(LL1.length()==0 )
                        {
                            JOptionPane.showMessageDialog(null,"user impti\ncreat again");
                        }
                        else if(LL1.length()>12 )
                        {
                            JOptionPane.showMessageDialog(null,"username very lenge\ncreat again");
                        }
                        else if( PP2.length==0)
                        {
                            JOptionPane.showMessageDialog(null,"password impti\ncreat again");
                        }
                        else if(PP2.length<8)
                        {
                            JOptionPane.showMessageDialog(null,"the password must contain at least 8 characters \ncreat again");
                        }
                       else if(R1.equals("shouse a question from the list"))
                        {
                            JOptionPane.showMessageDialog(null,"plese select a question from the list \nand answer to the it");
                        }
                        else if(R2.length()==0 )
                        {
                            JOptionPane.showMessageDialog(null,"plese select a question from the list  \nand answer to the it");
                        }
                        
                        else if(R1.equals("shouse a question from the list"))
                        {
                            JOptionPane.showMessageDialog(null,"plese select a second question from the list \nand answer to the it");
                        }
                        else if(R4.length()==0 )
                        {
                            JOptionPane.showMessageDialog(null,"plese select a second question from the list \nand answer to the it");
                        }

                        else
                        {
                            setVisible(false);
                            
                            user = LL1;
                            String TT2="";
                            for(int i=0;i<PP2.length;i++)
                            {
                                TT2 = TT2+""+PP2[i]; 
                            }
                            password = TT2;
                            Base64.Encoder encod = Base64.getEncoder();
                            //coder pass
                            String password2 = encod.encodeToString(password.getBytes());
                            try 
                            {
                                FileWriter in = new FileWriter(user+".txt",true);
                                FileWriter f = new FileWriter(user+"facebockdata.txt",true);
                                FileWriter g = new FileWriter(user+"G-maildata.txt",true);
                                FileWriter other = new FileWriter(user+"otherdata.txt",true);
                                in.write(user+"\n"+password2+"\n"+R1+"\n"+R2+"\n"+R3+"\n"+R4+"\n");
                                in.close();
                                g.write("type\nuser\ne-mail\npassword\nphone Number\ndate of last modification \n");
                                g.close();
                                f.write("user\ne-mail\npassword\nemail saver\nphone Number\ndate of last modification \n");
                                f.close();
                                other.close();
                                
                                
                                
                            } 
                            catch (Exception ex) 
                            {
                                JOptionPane.showMessageDialog(null,"Error");
                            }
                            D_chouse_Pic_fornew ch = new D_chouse_Pic_fornew(user);
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"password incompatible\ncreat again");
                    }
                }
                 
                
            }
            //cancel
            if(e.getSource()==B2)
            {
                setVisible(false);
                
                
            }
            if(e.getSource()==B3)
            {
                J_change_Image JC = new J_change_Image();
                
            }
            if(e.getSource()==B4)
            {
                B4.setVisible(false);
                B5.setVisible(false);
                B6.setBounds(235,420,250,30);
                B6.setVisible(true);
                B7.setBounds(235,450,250,30);
                B7.setVisible(true);
                B8.setBounds(235,480,250,30);
                B8.setVisible(true);
                B9.setBounds(235,510,250,30);
                B9.setVisible(true);
                B10.setBounds(235,540,250,30);
                B10.setVisible(true);
                B11.setBounds(235,570,250,30);
                B11.setVisible(true);
                i=1;
            }
            if(e.getSource()==B5)
            {

                B4.setVisible(false);
                B5.setVisible(false);
                B6.setBounds(235,500,250,30);
                B6.setVisible(true);
                B7.setBounds(235,530,250,30);
                B7.setVisible(true);
                B8.setBounds(235,560,250,30);
                B8.setVisible(true);
                B9.setBounds(235,590,250,30);
                B9.setVisible(true);
                B10.setBounds(235,620,250,30);
                B10.setVisible(true);
                B11.setBounds(235,650,250,30);
                B11.setVisible(true);
                i=2;
            }
            if(e.getSource()==B6)
            {
                
                B4.setVisible(true);
                B5.setVisible(true);
                B6.setBounds(235,500,250,30);
                B6.setVisible(false);
                B7.setBounds(235,530,250,30);
                B7.setVisible(false);
                B8.setBounds(235,560,250,30);
                B8.setVisible(false);
                B9.setBounds(235,590,250,30);
                B9.setVisible(false);
                B10.setBounds(235,620,250,30);
                B10.setVisible(false);
                B11.setBounds(235,650,250,30);
                B11.setVisible(false);
                if(i==1)
                {
                    T4.setText(K1);
                }
                else if(i==2)
                {
                    T6.setText(K1);
                }
            }
            if(e.getSource()==B7)
            {
                
                B4.setVisible(true);
                B5.setVisible(true);
                B6.setBounds(235,500,250,30);
                B6.setVisible(false);
                B7.setBounds(235,530,250,30);
                B7.setVisible(false);
                B8.setBounds(235,560,250,30);
                B8.setVisible(false);
                B9.setBounds(235,590,250,30);
                B9.setVisible(false);
                B10.setBounds(235,620,250,30);
                B10.setVisible(false);
                B11.setBounds(235,650,250,30);
                B11.setVisible(false);
                if(i==1)
                {
                    T4.setText(K2);
                }
                else if(i==2)
                {
                    T6.setText(K2);
                }
            }
            if(e.getSource()==B8)
            {
                
                B4.setVisible(true);
                B5.setVisible(true);
                B6.setBounds(235,500,250,30);
                B6.setVisible(false);
                B7.setBounds(235,530,250,30);
                B7.setVisible(false);
                B8.setBounds(235,560,250,30);
                B8.setVisible(false);
                B9.setBounds(235,590,250,30);
                B9.setVisible(false);
                B10.setBounds(235,620,250,30);
                B10.setVisible(false);
                B11.setBounds(235,650,250,30);
                B11.setVisible(false);
                if(i==1)
                {
                    T4.setText(K3);
                }
                else if(i==2)
                {
                    T6.setText(K3);
                }
            }
            if(e.getSource()==B9)
            {
                
                B4.setVisible(true);
                B5.setVisible(true);
                B6.setBounds(235,500,250,30);
                B6.setVisible(false);
                B7.setBounds(235,530,250,30);
                B7.setVisible(false);
                B8.setBounds(235,560,250,30);
                B8.setVisible(false);
                B9.setBounds(235,590,250,30);
                B9.setVisible(false);
                B10.setBounds(235,620,250,30);
                B10.setVisible(false);
                B11.setBounds(235,650,250,30);
                B11.setVisible(false);
                if(i==1)
                {
                    T4.setText(K4);
                }
                else if(i==2)
                {
                    T6.setText(K4);
                }
            }
            if(e.getSource()==B10)
            {
                
                B4.setVisible(true);
                B5.setVisible(true);
                B6.setBounds(235,500,250,30);
                B6.setVisible(false);
                B7.setBounds(235,530,250,30);
                B7.setVisible(false);
                B8.setBounds(235,560,250,30);
                B8.setVisible(false);
                B9.setBounds(235,590,250,30);
                B9.setVisible(false);
                B10.setBounds(235,620,250,30);
                B10.setVisible(false);
                B11.setBounds(235,650,250,30);
                B11.setVisible(false);
                if(i==1)
                {
                    T4.setText(K5);
                }
                else if(i==2)
                {
                    T6.setText(K5);
                }
            }
            if(e.getSource()==B11)
            {
                
                B4.setVisible(true);
                B5.setVisible(true);
                B6.setBounds(235,500,250,30);
                B6.setVisible(false);
                B7.setBounds(235,530,250,30);
                B7.setVisible(false);
                B8.setBounds(235,560,250,30);
                B8.setVisible(false);
                B9.setBounds(235,590,250,30);
                B9.setVisible(false);
                B10.setBounds(235,620,250,30);
                B10.setVisible(false);
                B11.setBounds(235,650,250,30);
                B11.setVisible(false);
                if(i==1)
                {
                    T4.setText(K6);
                }
                else if(i==2)
                {
                    T6.setText(K6);
                }
           
            }   
            
        }

    }
    
}
