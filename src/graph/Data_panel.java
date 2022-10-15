package graph;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import static java.lang.String.format;
import static java.lang.System.currentTimeMillis;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Base64;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.Timer;




public class Data_panel extends JPanel 
{
    JCheckBox C1 = new JCheckBox("1");
    JCheckBox C2 = new JCheckBox("2");
    JCheckBox C3 = new JCheckBox("3");
    JCheckBox C4 = new JCheckBox("4");
    JCheckBox C5 = new JCheckBox("5");
    JCheckBox C6 = new JCheckBox("6");
    JCheckBox C7 = new JCheckBox("7");
    JCheckBox C8 = new JCheckBox("8");
    JCheckBox C9 = new JCheckBox("9");
    JCheckBox C10 = new JCheckBox("10");
    JCheckBox C11 = new JCheckBox("11");
    JCheckBox C12 = new JCheckBox("12");
    JCheckBox C01 = new JCheckBox("1");
    JCheckBox C20 = new JCheckBox("2");
    JCheckBox C30 = new JCheckBox("3");
    JCheckBox C40 = new JCheckBox("4");
    JCheckBox C50 = new JCheckBox("5");
    JCheckBox C60 = new JCheckBox("6");
    JCheckBox C70 = new JCheckBox("7");
    JCheckBox C80 = new JCheckBox("8");
    JCheckBox C90 = new JCheckBox("9");
    JCheckBox C100 = new JCheckBox("10");
    JCheckBox C110 = new JCheckBox("11");
    JCheckBox C120 = new JCheckBox("12");
    JCheckBox C001 = new JCheckBox("1");
    JCheckBox C200 = new JCheckBox("2");
    JCheckBox C300 = new JCheckBox("3");
    JCheckBox C400 = new JCheckBox("4");
    JCheckBox C500 = new JCheckBox("5");
    JCheckBox C600 = new JCheckBox("6");
    JCheckBox C700 = new JCheckBox("7");
    JCheckBox C800 = new JCheckBox("8");
    JCheckBox C900 = new JCheckBox("9");
    JCheckBox C1000 = new JCheckBox("10");
    JCheckBox C1100 = new JCheckBox("11");
    JCheckBox C1200 = new JCheckBox("12");
    item I = new item();
    Pan P = new Pan();
    google m = new google();
    face f = new face();
    other o = new other();
    String user,password,a,type;
    JButton sel =new JButton("Select All ");
    JButton can =new JButton("cancel ");
    JButton B1 =new JButton("add.. ");
    JButton B3 =new JButton("delet ");
    JButton B2 =new JButton("edite ");
    
    
    
    //edite
    JCheckBox edite =new JCheckBox();
    JLabel edi= new JLabel("edite");
    JLabel ediph;
    ball ball = new ball();
    Timer tt = new Timer(1,ball);
    edite E = new edite();
    JButton B9 =new JButton ("change username   ");
    JButton B10 =new JButton("change password   ");
    JButton B11 =new JButton("change your avatar");
    
    //user
    JButton B1u = new JButton("change");
    JButton B2u = new JButton("cancel");
    JTextField T2u = new JTextField();
    JLabel L2u = new JLabel("new name");
    //password
    JButton B1p = new JButton("change");
    JButton B2p = new JButton("cancel");
    JButton B3p = new JButton("forget Password?");
    JCheckBox C1p = new JCheckBox("View Password");
    JTextField T1p = new JTextField();
    JTextField T2p = new JTextField();
    JTextField T3p = new JTextField();
    JLabel L1p = new JLabel("old password");
    JLabel L2p = new JLabel("new password");
    JLabel L4p = new JLabel("(the password must contain at least 8 characters )");
    JLabel L3p = new JLabel("confirm password");
    JPasswordField Pass1p = new JPasswordField();
    JPasswordField Pass2p = new JPasswordField();
    JPasswordField Pass3p = new JPasswordField();
    String LL1p,LL2p,LL3p,PP1p,PP2p,PP3p;
    //avatar
    JLabel L1a;
    JLabel L2a;
    JLabel L3a;
    JLabel L4a;
    JLabel L5a;
    JLabel L6a;
    JLabel L7a;
    JLabel L8a;
    JLabel L9a;
    JLabel L10a;
    JLabel L11a;
    JLabel L12a;
    JLabel L13a;
    JLabel L14a;
    JLabel L15a;
    JLabel L16a;
    JButton ba = new JButton("Change");
    JRadioButton a1a = new JRadioButton();
    JRadioButton a2a = new JRadioButton();
    JRadioButton a3a = new JRadioButton();
    JRadioButton a4a = new JRadioButton();
    JRadioButton a5a = new JRadioButton();
    JRadioButton a6a = new JRadioButton();
    JRadioButton a7a = new JRadioButton();
    JRadioButton a8a = new JRadioButton();
    JRadioButton a9a = new JRadioButton();
    JRadioButton a10a = new JRadioButton();
    JRadioButton a11a = new JRadioButton();
    JRadioButton a12a = new JRadioButton();
    JRadioButton a13a = new JRadioButton();
    JRadioButton a14a = new JRadioButton();
    JRadioButton a15a = new JRadioButton();
    JRadioButton a16a = new JRadioButton();
    ButtonGroup Ra = new ButtonGroup();
    JLabel la = new JLabel("pleas select an avatar");
    
    
    
    
    JButton B5 =new JButton("About                    ");
    JButton B6 =new JButton("dark theme            ");
    JButton B7 =new JButton("light theme            ");
    
    JLabel L1= new JLabel("user");
    JLabel L2;
    JLabel L3 = new JLabel("Categoris ::");
    JLabel L4 = new JLabel();
    JLabel L5 ;JLabel L5v ;
    JLabel L6 ;
    JLabel L7 ;
    JLabel cL6 ;
    JLabel cL7 ;
    JLabel cL8 ;
    JLabel cL9 ;
    JLabel L10 = new JLabel("other..");
    JTable table1 ;
    JTable table2 ;
    JTable table3 ;
    JTable table4 ;
    JTable table5 ;
    JTable table6 ;
    JButton T70 = new JButton() ;
    JButton T71 = new JButton() ;
    JButton T72 = new JButton() ;
    String[] columnNames2,photo=new String[7];
    String[][] first;
    String[][] first1;
    String[][] da2,da3,da4;
    JMenu m1 = new JMenu("view");
    JMenu m2 = new JMenu("help");
    JMenuBar M1 = new JMenuBar();
    int x=225,y=150,j=0,i,line2=0,line3=0,line4=0,c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0,c10=0,c11=0,c12=0,depass=0;
    int c01=0,c20=0,c30=0,c40=0,c50=0,c60=0,c70=0,c80=0,c90=0,c100=0,c110=0,c120=0;
    int c001=0,c200=0,c300=0,c400=0,c500=0,c600=0,c700=0,c800=0,c900=0,c1000=0,c1100=0,c1200=0;
    JButton aB1 = new JButton("creat");
    JButton aB2 = new JButton("reset");
    JButton aB3 = new JButton("save");
    JButton aB4 = new JButton("delet");
    JRadioButton a1 = new JRadioButton();
    JRadioButton a2 = new JRadioButton();
    JRadioButton a3 = new JRadioButton();
    ButtonGroup R = new ButtonGroup();
    JLabel aL1 = new JLabel("Type (EX :: Gmail,Facebock...)");
    JLabel aL2 = new JLabel("Username");
    JLabel aL3 = new JLabel("e-mail");
    JLabel aL4 = new JLabel("password");
    JLabel aL5 = new JLabel("phone Number");
    JLabel abL1 = new JLabel("line 1");
    JLabel abL2 = new JLabel("line 2");
    JLabel abL3 = new JLabel("line 3");
    JLabel abL4 = new JLabel("line 4");
    JLabel abL5 = new JLabel("line 5");
    JLabel abL6 = new JLabel("line 6");
    JLabel abL7 = new JLabel("line 7");
    JLabel abL8 = new JLabel("line 8");
    JLabel abL9 = new JLabel("line 9");
    JLabel abL10 = new JLabel("line 10");
    JLabel abL11 = new JLabel("line 11");
    JLabel abL12 = new JLabel("line 12");
    JLabel bbL1 = new JLabel("line 1");
    JLabel bbL2 = new JLabel("line 2");
    JLabel bbL3 = new JLabel("line 3");
    JLabel bbL4 = new JLabel("line 4");
    JLabel bbL5 = new JLabel("line 5");
    JLabel bbL6 = new JLabel("line 6");
    JLabel bbL7 = new JLabel("line 7");
    JLabel bbL8 = new JLabel("line 8");
    JLabel bbL9 = new JLabel("line 9");
    JLabel bbL10 = new JLabel("line 10");
    JLabel bbL11 = new JLabel("line 11");
    JLabel bbL12 = new JLabel("line 12");
    JLabel cbL1 = new JLabel("line 1");
    JLabel cbL2 = new JLabel("line 2");
    JLabel cbL3 = new JLabel("line 3");
    JLabel cbL4 = new JLabel("line 4");
    JLabel cbL5 = new JLabel("line 5");
    JLabel cbL6 = new JLabel("line 6");
    JLabel cbL7 = new JLabel("line 7");
    JLabel cbL8 = new JLabel("line 8");
    JLabel cbL9 = new JLabel("line 9");
    JLabel cbL10 = new JLabel("line 10");
    JLabel cbL11 = new JLabel("line 11");
    JLabel cbL12 = new JLabel("line 12");
    
    JLabel aL10 = new JLabel("");
    JLabel aL20 = new JLabel("");
    JLabel aL30 = new JLabel("");
    JLabel aL40 = new JLabel("");
    JLabel aL50 = new JLabel("");
    JTextField aT1 = new JTextField();
    JTextField aT2 = new JTextField();
    JTextField aT3 = new JTextField();
    JTextField aT4 = new JTextField();
    JTextField aT5 = new JTextField();
    int row2,row3,row4,len,l,select=1,lim10= 170,lim20 = 600,lim11= 170,lim21 = 600,lim12= 170,lim22 = 600;
    int k1,k2,k3,tx1,ty1,tx2,ty2,tx3,ty3,edx1=120,edx2=40,edx3=40,edx4=40,edx5=40,edx6=0,edx7=200,edx8=200,edx9=200,edx10=10,edx11=10,edx12=10,edx13=10,edx14=10;
    int diference1=0,diference2=0,diference3=5,diference4=5,diference5=5,diference6=5,diference7=5,diference8=5,diference9=5,diference10=0,diference11=5,diference12=5,diference13=5,diference14=5;
    File gdata,fdata,odata,admin;
    String color = "blue",C="google";
    String lis2[] = new String[10000];
    String lis3[] = new String[10000];
    String lis4[] = new String[10000];
    String choix="add";
    String avv;
    boolean v1,v2,v3,v4,v5,v6,ed=false,us=false,pa=false,av=false,chek=false;;
    public Data_panel(String u,String p) throws FileNotFoundException  
    {
        this.user=u;
        this.password=p;
        
    }
    
    public void google(boolean t1,boolean t2,int xx1,int yy1) throws FileNotFoundException
    {
            this.v1=t1;
            this.v2=t2;
            this.tx1=xx1;
            this.ty1=yy1;
            
            gdata=new File(user+"G-maildata.txt");
            Scanner sc=new Scanner(gdata);
            int i,j,x=6,y;
            line2 = 0;
            while(sc.hasNextLine())
            {
                lis2[line2] = sc.nextLine();
                line2++;
                
            }
            first = new String[1][6];
            for (i=0;i<6;i++)
            {
                first[0][i]=lis2[i];
            }
            columnNames2 = new String[6];
            for (i=0;i<6;i++)
            {
                columnNames2[i]=lis2[i];
            }
            k1=(line2-1)/6;
            da2 =new String[k1][6];
            for (i=0;i<k1;i++)
            {
                for (j=0;j<6;j++)
                {
                    y=x+j;

                    {
                        da2[i][j]=lis2[y];   
                    }
                    
                    
                }
                x+=6;
            }
                table1 = new JTable(first, columnNames2);
                table1.setVisible(true);
                table1.setRowHeight(50);
                table1.setForeground(Color.black);
                table1.setBackground(Color.yellow);
                table1.setFont(new Font("atilic",Font.BOLD,12));
                table1.setBounds(tx1,120,ty1,50);
                
                table2 = new JTable(da2, columnNames2);
                table2.setVisible(true);
                table2.setRowHeight(50);
                table2.setForeground(Color.white);
                table2.setBackground(Color.black);
                table2.setFont(new Font("atilic",Font.BOLD,12));
                table2.setBounds(tx1,170,ty1,635);
                this.add(table1);this.add(table2);
                table1.setVisible(v1);
                table2.setVisible(v2);
                table2.addMouseListener(m);
                

    }
        public void facebock(boolean t3,boolean t5,int xx1,int yy1) throws FileNotFoundException
        {
            this.v3=t3;
            this.v5=t5;
            this.tx2=xx1;
            this.ty2=yy1;
            
            fdata=new File(user+"facebockdata.txt");
            Scanner fC=new Scanner(fdata);
            int i,j,x=6,y;
            line3 = 0;
            while(fC.hasNextLine())
            {
                lis3[line3] = fC.nextLine();
                line3++;

            }
            first1 = new String[1][6];
            for (i=0;i<6;i++)
            {
                first1[0][i]=lis3[i];
            }
            k2=(line3-1)/6;
            da3 =new String[k2][6];
            for (i=0;i<k2;i++)
            {
                for (j=0;j<6;j++)
                {
                    y=x+j;

                    {
                        da3[i][j]=lis3[y];   
                    }
                }
                x+=6;
            }
                table5 = new JTable(first1, columnNames2);
                table5.setVisible(true);
                table5.setRowHeight(50);
                table5.setForeground(Color.black);
                table5.setBackground(Color.cyan);
                table5.setFont(new Font("atilic",Font.BOLD,12));
                table5.setBounds(tx2,120,ty2,50);
                table5.setVisible(v5);
                table3 = new JTable(da3, columnNames2);
                table3.setVisible(true);
                table3.setRowHeight(50);
                table3.setForeground(Color.white);
                table3.setBackground(Color.black);
                table3.setFont(new Font("atilic",Font.BOLD,12));
                table3.setBounds(tx2,170,ty2,635);
                this.add(table3);this.add(table5);
                table3.setVisible(v3);
    
                table3.addMouseListener(f);
                
                
        }
            public void other(boolean t4,boolean t6,int xx1,int yy1) throws FileNotFoundException
            {
            this.v4=t4;
            this.v6=t6;
            this.tx3=xx1;
            this.ty3=yy1;
                odata=new File(user+"otherdata.txt");
                Scanner sc=new Scanner(odata);
                int i,j,x=0,y;
                line4 = 0;
                while(sc.hasNextLine())
                {
                    lis4[line4] = sc.nextLine();
                    line4++;
                    
                }

                k3=(line4)/6;
                da4 =new String[k3][6];
                for (i=0;i<k3;i++)
                {
                    for (j=0;j<6;j++)
                    {
                        y=x+j;
 
                        {
                            da4[i][j]=lis4[y];   
                        }
                    }
                    x+=6;
                }
                    table6 = new JTable(first, columnNames2);
                    table6.setVisible(v6);
                    table6.setRowHeight(50);
                    table6.setForeground(Color.white);
                    table6.setBackground(Color.blue);
                    table6.setFont(new Font("atilic",Font.BOLD,12));
                    table6.setBounds(tx3,120,ty3,50);
                    
                    table4 = new JTable(da4, columnNames2);
                    table4.setVisible(v4);
                    table4.setRowHeight(50);
                    table4.setForeground(Color.white);
                    table4.setBackground(Color.black);
                    table4.setFont(new Font("atilic",Font.BOLD,12));
                    table4.setBounds(tx3,170,ty3,635);
                    this.add(table4);
                    this.add(table6);

                    table4.addMouseListener(o);

                
            }
    public void changeuser(boolean t1) 
    {
        this.us=t1;
                
        B1u.setBounds(880,400,100,30);
        B1u.setBackground(Color.blue);
        B1u.setForeground(Color.white);
        B1u.setVisible(us);
        
        B2u.setBounds(620,400,100,30);
        B2u.setBackground(Color.blue);
        B2u.setForeground(Color.white);
        B2u.setVisible(us);
        
        T2u.setBounds(700,260,200,30);
        T2u.setForeground(Color.black);
        T2u.setVisible(us);
        
        L2u.setBounds(700,230,200,30);
        L2u.setForeground(Color.white);
        L2u.setVisible(us);
        
        this.add(B1u);this.add(B2u);
        
        this.add(T2u);
        
        this.add(L2u);
        
        
    }
    public void changepass(boolean t1) 
    {
        this.pa=t1;

        B1p.setBounds(620,570,100,30);
        B1p.setBackground(Color.blue);
        B1p.setForeground(Color.white);
        B1p.setVisible(pa);
        
        B2p.setBounds(880,570,100,30);
        B2p.setBackground(Color.blue);
        B2p.setForeground(Color.white);
        B2p.setVisible(pa);
        
        B3p.setBounds(680,450,200,30);
        B3p.setBackground(Color.darkGray);
        B3p.setForeground(Color.MAGENTA);
        B3p.setVisible(pa);
        
        L1p.setBounds(680,270,225,30);
        L1p.setForeground(Color.white);
        L1p.setVisible(pa);
        L2p.setBounds(680,330,225,30);
        L2p.setForeground(Color.white);
        L2p.setVisible(pa);
        L4p.setBounds(770,330,400,30);
        L4p.setForeground(Color.white);
        L4p.setVisible(pa);
        L3p.setBounds(680,390,225,30);
        L3p.setForeground(Color.white);
        L3p.setVisible(pa);

        C1p.setBounds(950,300,225,30);
        C1p.setBackground(Color.gray);
        C1p.setForeground(Color.white);
        C1p.setVisible(pa);
        
       
        
        this.add(C1p);
        
        this.add(B1p);this.add(B2p);this.add(B3p);
        
        this.add(L1p);this.add(L2p);this.add(L3p);this.add(L4p);
        

        
        
    }
    public void changeav(boolean t1) 
    {
        this.av=t1;
 
        
        
       
        ba.setBounds(750,680,100,50);
        ba.setBackground(Color.black);
        ba.setForeground(Color.blue);
        ba.setVisible(av);
        a1a.setBounds(550,380,17,15);
        a1a.setBackground(Color.gray);
        a1a.setVisible(av);
        a2a.setBounds(670,380,17,15);
        a2a.setBackground(Color.gray);
        a2a.setVisible(av);
        a3a.setBounds(790,380,17,15);
        a3a.setBackground(Color.gray);
        a3a.setVisible(av);
        a4a.setBounds(910,380,17,15);
        a4a.setBackground(Color.gray);
        a4a.setVisible(av);
        a5a.setBounds(1030,380,17,15);
        a5a.setBackground(Color.gray);
        a5a.setVisible(av);
        a6a.setBounds(490,510,17,15);
        a6a.setBackground(Color.gray);
        a6a.setVisible(av);
        a7a.setBounds(610,510,17,15);
        a7a.setBackground(Color.gray);
        a7a.setVisible(av);
        a8a.setBounds(730,510,17,15);
        a8a.setBackground(Color.gray);
        a8a.setVisible(av);
        a9a.setBounds(850,510,17,15);
        a9a.setBackground(Color.gray);
        a9a.setVisible(av);
        a10a.setBounds(970,510,17,15);
        a10a.setBackground(Color.gray);
        a10a.setVisible(av);
        a11a.setBounds(1090,510,17,15);
        a11a.setBackground(Color.gray);
        a11a.setVisible(av);
        a12a.setBounds(550,640,17,15);
        a12a.setBackground(Color.gray);
        a12a.setVisible(av);
        a13a.setBounds(670,640,17,15);
        a13a.setBackground(Color.gray);
        a13a.setVisible(av);
        a14a.setBounds(790,640,17,15);
        a14a.setBackground(Color.gray);
        a14a.setVisible(av);
        a15a.setBounds(910,640,17,15);
        a15a.setBackground(Color.gray);
        a15a.setVisible(av);
        a16a.setBounds(1030,640,17,15);
        a16a.setBackground(Color.gray);
        a16a.setVisible(av);
        
        la.setBounds(700,200,500,30);
        la.setForeground(Color.black);
        la.setFont(new Font("atilic",Font.BOLD,20));
        la.setVisible(av);
        
        Ra.add(a1a);Ra.add(a2a);Ra.add(a3a);Ra.add(a4a);Ra.add(a5a);Ra.add(a6a);Ra.add(a7a);Ra.add(a8a);
        Ra.add(a9a);Ra.add(a10a);Ra.add(a11a);Ra.add(a12a);Ra.add(a13a);Ra.add(a14a);Ra.add(a15a);Ra.add(a16a);
        this.add(ba);
        
        this.add(a1a);this.add(a2a);this.add(a3a);this.add(a4a);this.add(a5a);this.add(a6a);this.add(a7a);this.add(a8a);
        this.add(a10a);this.add(a12a);this.add(a13a);this.add(a14a);this.add(a15a);this.add(a16a);this.add(a9a);this.add(a11a);
        this.add(la);

        
    }
    public void photo () throws FileNotFoundException
    {
        admin=new File(user+".txt");
        Scanner sc=new Scanner(admin);
        for(i=0;i<7;i++)
        {
            photo[i] = sc.nextLine();
        }
        ImageIcon ii = new ImageIcon(photo[6]);
        L5 = new JLabel(ii);
        L5.setBounds(25,75,100, 100);
        this.add(L5);
    }
    public void bb() throws FileNotFoundException 
    {
        admin=new File(user+".txt");
        Scanner sc=new Scanner(admin);
        for(i=0;i<7;i++)
        {
            photo[i] = sc.nextLine();
        }
        L2=new JLabel(user);
        l=user.length();
        len=60-((l/2)*10);
        google(true,true,160,1105);facebock(false,false,160,1105);other(false,false,160,1105); photo();
                    
        ImageIcon gg = new ImageIcon("image\\panel\\google.png");
        L6 = new JLabel(gg);
        L6.setBounds(435,15,200, 100);
        ImageIcon ff = new ImageIcon("image\\panel\\facebook1.png");
        L7 = new JLabel(ff);
        L7.setBounds(730,15,200, 100);
        
        ImageIcon pob = new ImageIcon("image\\panel\\delete\\pob.png");
        cL6 = new JLabel(pob);
        cL6.setBounds(1350,320,200,200);
        cL6.setVisible(false);
        
        ImageIcon dia1 = new ImageIcon("image\\panel\\delete\\dialog1.png");
        cL7 = new JLabel(dia1);
        cL7.setBounds(1280,120,250,250);
        cL7.setVisible(false);
        ImageIcon dia2 = new ImageIcon("image\\panel\\delete\\dialog2.png");
        cL8 = new JLabel(dia2);
        cL8.setBounds(1280,120,250,250);
        cL8.setVisible(false);
        ImageIcon dia3 = new ImageIcon("image\\panel\\delete\\dialog3.png");
        cL9 = new JLabel(dia3);
        cL9.setBounds(1280,120,250,250);
        cL9.setVisible(false);

        
        
        L10.setBounds(1100,50,150,30);
        L10.setForeground(Color.lightGray);
        L10.setFont(new Font("atilic",Font.BOLD,20));
        
        setBackground(Color.darkGray);
        setLayout(null);
        //pass
        Pass1p.setBounds(680,300,225,30);
        Pass2p.setBounds(680,360,225,30);
        Pass3p.setBounds(680,420,225,30);
                
        T1p.setBounds(680,300,225,30);
        T2p.setBounds(680,360,225,30);
        T3p.setBounds(680,420,225,30);
        //avatar
        ImageIcon ph = new ImageIcon(a);
        L4.setBounds(50,75,100,100);
        L4.setIcon(ph);
        
        ImageIcon image1=new ImageIcon("image\\creat new\\avatar\\avatars\\1.png");
        L1a= new JLabel(image1);
        L1a.setBounds(210,250,700,150);
   
        ImageIcon image2=new ImageIcon("image\\creat new\\avatar\\avatars\\2.png");
        L2a= new JLabel(image2);
        L2a.setBounds(330,250,700,150);
   
        ImageIcon image3=new ImageIcon("image\\creat new\\avatar\\avatars\\3.png");
        L3a= new JLabel(image3);
        L3a.setBounds(450,250,700,150);
      
        ImageIcon image4=new ImageIcon("image\\creat new\\avatar\\avatars\\4.png");
        L4a= new JLabel(image4);
        L4a.setBounds(570,250,700,150);
        
        ImageIcon image5=new ImageIcon("image\\creat new\\avatar\\avatars\\5.png");
        L5a= new JLabel(image5);
        L5a.setBounds(690,250,700,150);
        
        ImageIcon image6=new ImageIcon("image\\creat new\\avatar\\avatars\\6.png");
        L6a= new JLabel(image6);
        L6a.setBounds(150,375,700,150);
      
        ImageIcon image7=new ImageIcon("image\\creat new\\avatar\\avatars\\7.png");
        L7a= new JLabel(image7);
        L7a.setBounds(270,375,700,150);
      
        ImageIcon image8=new ImageIcon("image\\creat new\\avatar\\avatars\\8.png");
        L8a= new JLabel(image8);
        L8a.setBounds(390,375,700,150);

        ImageIcon image9=new ImageIcon("image\\creat new\\avatar\\avatars\\9.png");
        L9a= new JLabel(image9);
        L9a.setBounds(510,375,700,150);
      
        ImageIcon image10=new ImageIcon("image\\creat new\\avatar\\avatars\\10.png");
        L10a= new JLabel(image10);
        L10a.setBounds(630,375,700,150);
     
        ImageIcon image11=new ImageIcon("image\\creat new\\avatar\\avatars\\11.png");
        L11a= new JLabel(image11);
        L11a.setBounds(750,375,700,150);
   
        ImageIcon image12=new ImageIcon("image\\creat new\\avatar\\avatars\\12.png");
        L12a= new JLabel(image12);
        L12a.setBounds(210,500,700,150);
     
        ImageIcon image13=new ImageIcon("image\\creat new\\avatar\\avatars\\13.png");
        L13a= new JLabel(image13);
        L13a.setBounds(330,500,700,150);

        ImageIcon image14=new ImageIcon("image\\creat new\\avatar\\avatars\\14.png");
        L14a= new JLabel(image14);
        L14a.setBounds(450,500,700,150);
  
        ImageIcon image15=new ImageIcon("image\\creat new\\avatar\\avatars\\15.png");
        L15a= new JLabel(image15);
        L15a.setBounds(570,500,700,150);
      
        ImageIcon image16=new ImageIcon("image\\creat new\\avatar\\avatars\\16.png");
        L16a= new JLabel(image16);
        L16a.setBounds(690,500,700,150);
        
                        L1a.setVisible(false);
                        L2a.setVisible(false);
                        L3a.setVisible(false);
                        L4a.setVisible(false);
                        L5a.setVisible(false);
                        L6a.setVisible(false);
                        L7a.setVisible(false);
                        L8a.setVisible(false);
                        L9a.setVisible(false);
                        L10a.setVisible(false);
                        L11a.setVisible(false);
                        L12a.setVisible(false);
                        L13a.setVisible(false);
                        L14a.setVisible(false);
                        L15a.setVisible(false);
                        L16a.setVisible(false);
                        
        B1.setBounds(1275,30,90,30);
        B1.setBackground(Color.blue);
        B1.setForeground(Color.white);
        B2.setBounds(1365,30,90,30);
        B2.setBackground(Color.darkGray);
        B2.setForeground(Color.lightGray);
        B3.setBounds(1455,30,100,30);
        B3.setBackground(Color.darkGray);
        B3.setForeground(Color.lightGray);

        B5.setBackground(Color.darkGray);
        B5.setForeground(Color.lightGray);
        B6.setBackground(Color.darkGray);
        B6.setForeground(Color.gray);
        B7.setBackground(Color.darkGray);
        B7.setForeground(Color.white);
        
        
        aB1.setBounds(1425,500,100,50);
        aB1.setBackground(Color.blue);
        aB1.setForeground(Color.white);
        aB1.setVisible(true);
        aB2.setBounds(1285,500,100,50);
        aB2.setBackground(Color.black);
        aB2.setForeground(Color.blue);
        aB2.setVisible(false);
        aB3.setBounds(1425,500,100,50);
        aB3.setBackground(Color.green);
        aB3.setForeground(Color.white);
        aB3.setVisible(false);
        can.setBounds(1285,500,100,50);
        can.setBackground(Color.black);
        can.setForeground(Color.blue);
        can.setVisible(false);
        sel.setBounds(1300,100,100,30);
        sel.setVisible(false);
        aB4.setBounds(1425,500,100,50);
        aB4.setBackground(Color.red);
        aB4.setForeground(Color.white);
        aB4.setVisible(false);
       

        aL10.setBounds(1400,130,250,30);
        aL10.setVisible(false);
        aL10.setForeground(Color.red);
        aL10.setFont(new Font("atilic",Font.BOLD,20));
        aL20.setBounds(1400,200,250,30);
        aL20.setVisible(false);
        aL20.setForeground(Color.red);
        aL20.setFont(new Font("atilic",Font.BOLD,20));
        aL30.setBounds(1400,270,250,30);
        aL30.setVisible(false);
        aL30.setForeground(Color.red);
        aL30.setFont(new Font("atilic",Font.BOLD,20));
        aL40.setBounds(1400,340,250,30);
        aL40.setVisible(false);
        aL40.setForeground(Color.red);
        aL40.setFont(new Font("atilic",Font.BOLD,20));
        aL50.setBounds(1400,410,250,30);
        aL50.setVisible(false);
        aL50.setForeground(Color.red);
        aL50.setFont(new Font("atilic",Font.BOLD,20));
        
        aT1.setBounds(1280,130,250,30);
        aT1.setVisible(false);
        aT2.setBounds(1280,200,250,30);
        aT2.setVisible(false);
        aT3.setBounds(1280,270,250,30);
        aT3.setVisible(false);
        aT4.setBounds(1280,340,250,30);
        aT4.setVisible(false);
        aT5.setBounds(1280,410,250,30);
        aT5.setVisible(false);
        
        L1.setBounds(40,175,100,50);
        L1.setForeground(Color.lightGray);
        L1.setFont(new Font("atilic",Font.BOLD,30));
        L2.setBounds(len,210,150,50);
        L2.setForeground(Color.white);
        L2.setFont(new Font("atilic",Font.BOLD,20));
        L3.setBounds(200,40,350,50);
        L3.setForeground(Color.white);
        L3.setFont(new Font("atilic",Font.BOLD,30));

        aL1.setBounds(1275,100,250,30);
        aL1.setForeground(Color.white);
        aL1.setFont(new Font("atilic",Font.BOLD,15));
        aL1.setVisible(false);
        aL2.setBounds(1275,170,250,30);
        aL2.setForeground(Color.white);
        aL2.setFont(new Font("atilic",Font.BOLD,15));
        aL2.setVisible(false);
        aL3.setBounds(1275,240,250,30);
        aL3.setForeground(Color.white);
        aL3.setFont(new Font("atilic",Font.BOLD,15));
        aL3.setVisible(false);
        aL4.setBounds(1275,310,250,30);
        aL4.setForeground(Color.white);
        aL4.setFont(new Font("atilic",Font.BOLD,15));
        aL4.setVisible(false);
        aL5.setBounds(1275,370,250,30);
        aL5.setForeground(Color.white);
        aL5.setFont(new Font("atilic",Font.BOLD,15));
        aL5.setVisible(false);
        
        
        abL1.setBounds(30,30,50,30);
        abL1.setForeground(Color.black);
        abL1.setFont(new Font("atilic",Font.BOLD,15));
        abL1.setVisible(false);
        abL2.setBounds(90,30,50,30);
        abL2.setForeground(Color.black);
        abL2.setFont(new Font("atilic",Font.BOLD,15));
        abL2.setVisible(false);
        abL3.setBounds(150,30,50,30);
        abL3.setForeground(Color.black);
        abL3.setFont(new Font("atilic",Font.BOLD,15));
        abL3.setVisible(false);
        abL4.setBounds(30,60,50,30);
        abL4.setForeground(Color.black);
        abL4.setFont(new Font("atilic",Font.BOLD,15));
        abL4.setVisible(false);
        abL5.setBounds(90,60,50,30);
        abL5.setForeground(Color.black);
        abL5.setFont(new Font("atilic",Font.BOLD,15));
        abL5.setVisible(false);
        abL6.setBounds(150,60,50,30);
        abL6.setForeground(Color.black);
        abL6.setFont(new Font("atilic",Font.BOLD,15));
        abL6.setVisible(false);
        abL7.setBounds(30,90,50,30);
        abL7.setForeground(Color.black);
        abL7.setFont(new Font("atilic",Font.BOLD,15));
        abL7.setVisible(false);
        abL8.setBounds(90,90,50,30);
        abL8.setForeground(Color.black);
        abL8.setFont(new Font("atilic",Font.BOLD,15));
        abL8.setVisible(false);
        abL9.setBounds(150,90,50,30);
        abL9.setForeground(Color.black);
        abL9.setFont(new Font("atilic",Font.BOLD,15));
        abL9.setVisible(false);
        abL10.setBounds(30,120,50,30);
        abL10.setForeground(Color.black);
        abL10.setFont(new Font("atilic",Font.BOLD,15));
        abL10.setVisible(false);
        abL11.setBounds(90,120,50,30);
        abL11.setForeground(Color.black);
        abL11.setFont(new Font("atilic",Font.BOLD,15));
        abL11.setVisible(false);
        abL12.setBounds(150,120,50,30);
        abL12.setForeground(Color.black);
        abL12.setFont(new Font("atilic",Font.BOLD,15));
        abL12.setVisible(false);
        bbL1.setBounds(30,30,50,30);
        bbL1.setForeground(Color.black);
        bbL1.setFont(new Font("atilic",Font.BOLD,15));
        bbL1.setVisible(false);
        bbL2.setBounds(90,30,50,30);
        bbL2.setForeground(Color.black);
        bbL2.setFont(new Font("atilic",Font.BOLD,15));
        bbL2.setVisible(false);
        bbL3.setBounds(150,30,50,30);
        bbL3.setForeground(Color.black);
        bbL3.setFont(new Font("atilic",Font.BOLD,15));
        bbL3.setVisible(false);
        bbL4.setBounds(30,60,50,30);
        bbL4.setForeground(Color.black);
        bbL4.setFont(new Font("atilic",Font.BOLD,15));
        bbL4.setVisible(false);
        bbL5.setBounds(90,60,50,30);
        bbL5.setForeground(Color.black);
        bbL5.setFont(new Font("atilic",Font.BOLD,15));
        bbL5.setVisible(false);
        bbL6.setBounds(150,60,50,30);
        bbL6.setForeground(Color.black);
        bbL6.setFont(new Font("atilic",Font.BOLD,15));
        bbL6.setVisible(false);
        bbL7.setBounds(30,90,50,30);
        bbL7.setForeground(Color.black);
        bbL7.setFont(new Font("atilic",Font.BOLD,15));
        bbL7.setVisible(false);
        bbL8.setBounds(90,90,50,30);
        bbL8.setForeground(Color.black);
        bbL8.setFont(new Font("atilic",Font.BOLD,15));
        bbL8.setVisible(false);
        bbL9.setBounds(150,90,50,30);
        bbL9.setForeground(Color.black);
        bbL9.setFont(new Font("atilic",Font.BOLD,15));
        bbL9.setVisible(false);
        bbL10.setBounds(30,120,50,30);
        bbL10.setForeground(Color.black);
        bbL10.setFont(new Font("atilic",Font.BOLD,15));
        bbL10.setVisible(false);
        bbL11.setBounds(90,120,50,30);
        bbL11.setForeground(Color.black);
        bbL11.setFont(new Font("atilic",Font.BOLD,15));
        bbL11.setVisible(false);
        bbL12.setBounds(150,120,50,30);
        bbL12.setForeground(Color.black);
        bbL12.setFont(new Font("atilic",Font.BOLD,15));
        bbL12.setVisible(false);
        cbL1.setBounds(30,30,50,30);
        cbL1.setForeground(Color.black);
        cbL1.setFont(new Font("atilic",Font.BOLD,15));
        cbL1.setVisible(false);
        cbL2.setBounds(90,30,50,30);
        cbL2.setForeground(Color.black);
        cbL2.setFont(new Font("atilic",Font.BOLD,15));
        cbL2.setVisible(false);
        cbL3.setBounds(150,30,50,30);
        cbL3.setForeground(Color.black);
        cbL3.setFont(new Font("atilic",Font.BOLD,15));
        cbL3.setVisible(false);
        cbL4.setBounds(30,60,50,30);
        cbL4.setForeground(Color.black);
        cbL4.setFont(new Font("atilic",Font.BOLD,15));
        cbL4.setVisible(false);
        cbL5.setBounds(90,60,50,30);
        cbL5.setForeground(Color.black);
        cbL5.setFont(new Font("atilic",Font.BOLD,15));
        cbL5.setVisible(false);
        cbL6.setBounds(150,60,50,30);
        cbL6.setForeground(Color.black);
        cbL6.setFont(new Font("atilic",Font.BOLD,15));
        cbL6.setVisible(false);
        cbL7.setBounds(30,90,50,30);
        cbL7.setForeground(Color.black);
        cbL7.setFont(new Font("atilic",Font.BOLD,15));
        cbL7.setVisible(false);
        cbL8.setBounds(90,90,50,30);
        cbL8.setForeground(Color.black);
        cbL8.setFont(new Font("atilic",Font.BOLD,15));
        cbL8.setVisible(false);
        cbL9.setBounds(150,90,50,30);
        cbL9.setForeground(Color.black);
        cbL9.setFont(new Font("atilic",Font.BOLD,15));
        cbL9.setVisible(false);
        cbL10.setBounds(30,120,50,30);
        cbL10.setForeground(Color.black);
        cbL10.setFont(new Font("atilic",Font.BOLD,15));
        cbL10.setVisible(false);
        cbL11.setBounds(90,120,50,30);
        cbL11.setForeground(Color.black);
        cbL11.setFont(new Font("atilic",Font.BOLD,15));
        cbL11.setVisible(false);
        cbL12.setBounds(150,120,50,30);
        cbL12.setForeground(Color.black);
        cbL12.setFont(new Font("atilic",Font.BOLD,15));
        cbL12.setVisible(false);
       
        aL1.setVisible(true);
        aL2.setVisible(true);
        aL3.setVisible(true);
        aL4.setVisible(true);
        aL5.setVisible(true);
        aT1.setVisible(true);
        aT2.setVisible(true);
        aT3.setVisible(true);
        aT4.setVisible(true);
        aT5.setVisible(true);
        aB1.setVisible(true);
        m1.setForeground(Color.lightGray);
        m2.setForeground(Color.lightGray);


        M1.setBounds(0,0,1555,30);
        M1.setBackground(Color.darkGray);

        m1.add(B6);m1.add(B7);
        m2.add(B5);
        M1.add(m1);M1.add(m2);
        
        
        //edite
        ImageIcon ed = new ImageIcon("image\\panel\\delete\\edite.png");
        ediph = new JLabel(ed);
        ediph.setBounds(80,275,50,30);
        ediph.setVisible(true);
        
        edi.setBounds(50,265,50,50);
        edi.setFont(new Font("atilic",Font.BOLD,15));
        edi.setVisible(true);
        edi.setForeground(Color.white);
        
        edite.setVisible(true);
        edite.setBackground(Color.blue);
        edite.setBounds(20,275,20,30);
        
        B9.setBounds(170,150,edx6,50);
        B9.setBackground(Color.gray);
        B9.setForeground(Color.white);
        B9.setVisible(false);
        
        B10.setBounds(170,250,edx6,50);
        B10.setBackground(Color.gray);
        B10.setForeground(Color.white);
        B10.setVisible(false);
        
        B11.setBounds(170,350,edx6,50);
        B11.setBackground(Color.gray);
        B11.setForeground(Color.white);
        B11.setVisible(false);

                
        a1.setBounds(580,60,17,15);
        a1.setBackground(Color.darkGray);
        a1.setBackground(Color.yellow);
        a2.setBounds(880,60,17,15);
        a2.setBackground(Color.darkGray);
        a3.setBounds(1180,60,17,15);      
        a3.setBackground(Color.darkGray);

        R.add(a1);R.add(a2);R.add(a3);

        this.add(Pass1p);this.add(Pass2p);this.add(Pass3p);
        this.add(T1p);this.add(T2p);this.add(T3p);
        this.add(a1);this.add(a2);this.add(a3);
        this.add(aB1);this.add(aB2);this.add(aB3);this.add(aB4);
        this.add(B1);this.add(B2);this.add(B3);
        this.add(L1);this.add(L2);this.add(L3);this.add(L5);
        this.add(aL10);this.add(aL20);this.add(aL30);this.add(aL40);this.add(aL50);
        this.add(aL1);this.add(aL2);this.add(aL3);this.add(aL4);this.add(aL5);this.add(L6);this.add(L7);this.add(L10);
        this.add(aT1);this.add(aT2);this.add(aT3);this.add(aT4);this.add(aT5);
        this.add(M1);this.add(edite);this.add(ediph);this.add(edi);
        this.add(sel);this.add(can);
        this.add(cL6);this.add(cL7);this.add(cL8);this.add(cL9);
        this.add(B9);this.add(B10);this.add(B11);
        this.add(L1a);this.add(L2a);this.add(L3a);this.add(L4a);this.add(L5a);this.add(L6a);this.add(L7a);this.add(L8a);
        this.add(L9a);this.add(L10a);this.add(L11a);this.add(L12a);this.add(L13a);this.add(L14a);this.add(L15a);this.add(L16a);
        cL7.add(abL1);cL7.add(abL2);cL7.add(abL3);cL7.add(abL4);cL7.add(abL5);cL7.add(abL6);cL7.add(abL7);cL7.add(abL8);cL7.add(abL9);cL7.add(abL10);cL7.add(abL11);cL7.add(abL12);
        cL8.add(bbL1);cL8.add(bbL2);cL8.add(bbL3);cL8.add(bbL4);cL8.add(bbL5);cL8.add(bbL6);cL8.add(bbL7);cL8.add(bbL8);cL8.add(bbL9);cL8.add(bbL10);cL8.add(bbL11);cL8.add(bbL12);
        cL9.add(cbL1);cL9.add(cbL2);cL9.add(cbL3);cL9.add(cbL4);cL9.add(cbL5);cL9.add(cbL6);cL9.add(cbL7);cL9.add(cbL8);cL9.add(cbL9);cL9.add(cbL10);cL9.add(cbL11);cL9.add(cbL12);
        
        //edite
        B1u.addActionListener(P);
        B2u.addActionListener(P);
        C1p.addItemListener(I);
        B1p.addActionListener(P);
        B2p.addActionListener(P);
        B3p.addActionListener(P);
        ba.addActionListener(P);
        a1a.addActionListener(P);
        a2a.addActionListener(P);
        a3a.addActionListener(P);
        a4a.addActionListener(P);
        a5a.addActionListener(P);
        a6a.addActionListener(P);
        a7a.addActionListener(P);
        a8a.addActionListener(P);
        a10a.addActionListener(P);
        a12a.addActionListener(P);
        a13a.addActionListener(P);
        a14a.addActionListener(P);
        a15a.addActionListener(P);
        a16a.addActionListener(P);
        a9a.addActionListener(P);
        a11a.addActionListener(P);
        
        can.addActionListener(P);
        sel.addActionListener(P);
        a1.addActionListener(P);
        a2.addActionListener(P);
        a3.addActionListener(P);
        aB1.addActionListener(P);
        aB2.addActionListener(P);
        aB3.addActionListener(P);
        aB4.addActionListener(P);
        B1.addActionListener(P);
        B2.addActionListener(P);
        B3.addActionListener(P);
        B5.addActionListener(P);
        B6.addActionListener(P);
        B7.addActionListener(P);
        B9.addActionListener(P);
        B10.addActionListener(P);
        B11.addActionListener(P);
        table2.addMouseListener(m);
        table3.addMouseListener(f);
        table4.addMouseListener(o);
        C1.addItemListener(I);
        C2.addItemListener(I);
        C3.addItemListener(I);
        C4.addItemListener(I);
        C5.addItemListener(I);
        C6.addItemListener(I);
        C7.addItemListener(I);
        C8.addItemListener(I);
        C9.addItemListener(I);
        C10.addItemListener(I);
        C11.addItemListener(I);
        C12.addItemListener(I);
        C01.addItemListener(I);
        C20.addItemListener(I);
        C30.addItemListener(I);
        C40.addItemListener(I);
        C50.addItemListener(I);
        C60.addItemListener(I);
        C70.addItemListener(I);
        C80.addItemListener(I);
        C90.addItemListener(I);
        C100.addItemListener(I);
        C110.addItemListener(I);
        C120.addItemListener(I);
        C001.addItemListener(I);
        C200.addItemListener(I);
        C300.addItemListener(I);
        C400.addItemListener(I);
        C500.addItemListener(I);
        C600.addItemListener(I);
        C700.addItemListener(I);
        C800.addItemListener(I);
        C900.addItemListener(I);
        C1000.addItemListener(I);
        C1100.addItemListener(I);
        C1200.addItemListener(I);
        
        //edite
        edite.addItemListener(E);
    }
    

    @Override
    protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g); 
        g.setColor(Color.white);
        g.fill3DRect(155,810,1500,40, true);
        g.fill3DRect(155,0,1500,105, true);
        g.fill3DRect(0, 0, 155,this.getHeight(), true);
        g.fill3DRect(1270, 0,395,this.getHeight(), true);
        
        
        if(C.equals("google"))
        {
            g.setColor(Color.yellow);
            g.fill3DRect(155,810,1500,40, true);
            g.fill3DRect(155,0,1500,105, true);
            g.fill3DRect(0, 0, 155,this.getHeight(), true);
            g.fill3DRect(1270, 0,395,this.getHeight(), true);
            
        }
        if(C.equals("oth"))
        {
            g.setColor(Color.blue);
            g.fill3DRect(155,810,1500,40, true);
            g.fill3DRect(155,0,1500,105, true);
            g.fill3DRect(0, 0, 155,this.getHeight(), true);
            g.fill3DRect(1270, 0,395,this.getHeight(), true);
        }
        if(C.equals("face"))
        {
            g.setColor(Color.cyan);
            g.fill3DRect(155,810,1500,40, true);
            g.fill3DRect(155,0,1500,105, true);
            g.fill3DRect(0, 0, 155,this.getHeight(), true);
            g.fill3DRect(1270, 0,395,this.getHeight(), true);
        }
        if(color.equals("blue"))
        {
            g.setColor(Color.blue);
            g.fill3DRect(1275, 0,500,65, true);
        }
        if(color.equals("green"))
        {
            g.setColor(Color.green);
            g.fill3DRect(1275, 0,500,65, true);
        }
        if(color.equals("red"))
        {
            g.setColor(Color.red);
            g.fill3DRect(1275, 0,500,65, true);
        }
        g.setColor(Color.darkGray);
        g.fill3DRect(155,815,1115,40, true);
        g.fill3DRect(155,0,1115 ,100, true);
        g.fill3DRect(0, 0, 150,this.getHeight(), true);
        g.setColor(Color.blue);
        g.fill3DRect(0, 0, this.getWidth(),30, true);
        g.setColor(Color.darkGray);
        g.fill3DRect(1275,65, 390,this.getHeight(), true);
        g.setColor(Color.white);
        g.fillOval(20,70,110,110);
        if(C.equals("google"))
        {
            g.setColor(Color.yellow);
            g.fill3DRect(450,0,200,100, true);
           
        }
        if(C.equals("oth"))
        {
            g.setColor(Color.blue);
            g.fill3DRect(1050,0,200,100, true);
            
        }
        
        if(C.equals("face"))
        {
            g.setColor(Color.cyan);
            g.fill3DRect(730,0,200,100, true);
            
            
        }
        
            tt.start();
            g.setColor(Color.blue);
            g.fill3DRect(15,275,edx1,40, true);
            if(edx2 >40)
            {
            g.fill3DRect(165,120,10,edx2, true);
            }
            if(edx3 >40)
            {
            g.fill3DRect(1255-edx3,120,edx3,10, true);
            }
            if(edx4 >40)
            {
            g.fill3DRect(1245,785-edx4,10,edx4, true);
            }
            if(edx5 >40)
            {
            g.fill3DRect(165,785,edx5,10, true);
            }
            if(edx6 >0)
            {
                B9.setVisible(true);
                B10.setVisible(true);
                B11.setVisible(true);

            B9.setBounds(175,150,edx6,50);
            B10.setBounds(175,250,edx6,50);
            B11.setBounds(175,350,edx6,50);
            }
            if(edx10>0)
            {
                g.setColor(Color.blue);
                g.fill3DRect(425,150,edx10,600, true);
                g.setColor(Color.gray);
                g.fill3DRect(435,160,edx11,580, true);
            }
            if(us == true)
            {
                B9.setBackground(Color.blue);
                B10.setBackground(Color.gray);
                B11.setBackground(Color.gray);
                B9.setBounds(175,150,edx7,50);
                

                
            }
            if(pa == true)
            {
                g.setColor(Color.blue);
                B9.setBackground(Color.gray);
                B10.setBackground(Color.blue);
                B11.setBackground(Color.gray);
                B10.setBounds(175,250,edx8,50);
            }
            if(av == true)
            {
                g.setColor(Color.blue);
                B9.setBackground(Color.gray);
                B10.setBackground(Color.gray);
                B11.setBackground(Color.blue);
                B11.setBounds(175,350,edx9,50);
            }
            
            
        

        
    this.repaint();
        
    }
    
    public class google implements MouseListener
    {

        @Override
        public void mouseClicked(MouseEvent e) 
        {
            row2 = table2.getSelectedRow();
            
        }
        
        @Override
        public void mousePressed(MouseEvent e) 
        {
            
        }
        @Override
        public void mouseReleased(MouseEvent e) 
        {
            
        }
        @Override
        public void mouseEntered(MouseEvent e) 
        {
                
        }
        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
            
        
    }
    public class face implements MouseListener
    {

        @Override
        public void mouseClicked(MouseEvent e) 
        {
            row3 = table3.getSelectedRow();
            
        }
        
        @Override
        public void mousePressed(MouseEvent e) 
        {
            
        }
        @Override
        public void mouseReleased(MouseEvent e) 
        {
            
        }
        @Override
        public void mouseEntered(MouseEvent e) 
        {
                
        }
        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
            
        
    }
    public class other implements MouseListener
    {

        @Override
        public void mouseClicked(MouseEvent e) 
        {
            row4 = table4.getSelectedRow();
            
        }
        
        @Override
        public void mousePressed(MouseEvent e) 
        {
            
        }
        @Override
        public void mouseReleased(MouseEvent e) 
        {
            
        }
        @Override
        public void mouseEntered(MouseEvent e) 
        {
                
        }
        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
            
        
    }
    public void dis1(boolean v1,boolean v)
    {
        lim10 = (k1*50)+170;
        lim20 = 640-(k1*50);
        T70.setBounds(155,lim10,200,lim20);
        C1.setBounds(160,170,40,50);
        C2.setBounds(160,220,40,50);
        C3.setBounds(160,270,40,50);
        C4.setBounds(160,320,40,50);
        C5.setBounds(160,370,40,50);
        C6.setBounds(160,420,40,50);
        C7.setBounds(160,470,40,50);
        C8.setBounds(160,520,40,50);
        C9.setBounds(160,570,40,50);
        C10.setBounds(160,620,40,50);
        C11.setBounds(160,670,40,50);
        C12.setBounds(160,720,40,50);
        C1.setBackground(Color.yellow);
        C2.setBackground(Color.yellow);
        C3.setBackground(Color.yellow);
        C4.setBackground(Color.yellow);
        C5.setBackground(Color.yellow);
        C6.setBackground(Color.yellow);
        C7.setBackground(Color.yellow);
        C8.setBackground(Color.yellow);
        C9.setBackground(Color.yellow);
        C10.setBackground(Color.yellow);
        C11.setBackground(Color.yellow);
        C12.setBackground(Color.yellow);
        T70.setBackground(Color.darkGray);
        T70.setVisible(v1);
        C1.setVisible(v);
        C2.setVisible(v);
        C3.setVisible(v);
        C4.setVisible(v);
        C5.setVisible(v);
        C6.setVisible(v);
        C7.setVisible(v);
        C8.setVisible(v);
        C9.setVisible(v);
        C10.setVisible(v);
        C11.setVisible(v);
        C12.setVisible(v);
        this.add(T70);
        this.add(C1);this.add(C2);this.add(C3);this.add(C4);
        this.add(C5);this.add(C6);this.add(C7);this.add(C8);
        this.add(C9);this.add(C10);this.add(C11);this.add(C12);
        
    }
    public void dis2(boolean v2,boolean v)
    {
        lim11 = (k2*50)+170;
        lim21 = 640-(k2*50);
        T71.setBounds(155,lim11,200,lim21);
        T71.setVisible(v2);
        C01.setBounds(160,170,40,50);
        C20.setBounds(160,220,40,50);
        C30.setBounds(160,270,40,50);
        C40.setBounds(160,320,40,50);
        C50.setBounds(160,370,40,50);
        C60.setBounds(160,420,40,50);
        C70.setBounds(160,470,40,50);
        C80.setBounds(160,520,40,50);
        C90.setBounds(160,570,40,50);
        C100.setBounds(160,620,40,50);
        C110.setBounds(160,670,40,50);
        C120.setBounds(160,720,40,50);
        C01.setBackground(Color.cyan);
        C20.setBackground(Color.cyan);
        C30.setBackground(Color.cyan);
        C40.setBackground(Color.cyan);
        C50.setBackground(Color.cyan);
        C60.setBackground(Color.cyan);
        C70.setBackground(Color.cyan);
        C80.setBackground(Color.cyan);
        C90.setBackground(Color.cyan);
        C100.setBackground(Color.cyan);
        C110.setBackground(Color.cyan);
        C120.setBackground(Color.cyan);
        T71.setBackground(Color.darkGray);


        C01.setVisible(v);
        C20.setVisible(v);
        C30.setVisible(v);
        C40.setVisible(v);
        C50.setVisible(v);
        C60.setVisible(v);
        C70.setVisible(v);
        C80.setVisible(v);
        C90.setVisible(v);
        C100.setVisible(v);
        C110.setVisible(v);
        C120.setVisible(v);
        this.add(T71);
        this.add(C01);this.add(C20);this.add(C30);this.add(C40);
        this.add(C50);this.add(C60);this.add(C70);this.add(C80);
        this.add(C90);this.add(C100);this.add(C110);this.add(C120);
    }
    public void dis3(boolean v3,boolean v)
    {
        lim12 = (k3*50)+170;
        lim22 = 640-(k3*50);
        T72.setBounds(155,lim12,200,lim22);
        T72.setVisible(v3);
        C001.setBounds(160,170,40,50);
        C200.setBounds(160,220,40,50);
        C300.setBounds(160,270,40,50);
        C400.setBounds(160,320,40,50);
        C500.setBounds(160,370,40,50);
        C600.setBounds(160,420,40,50);
        C700.setBounds(160,470,40,50);
        C800.setBounds(160,520,40,50);
        C900.setBounds(160,570,40,50);
        C1000.setBounds(160,620,40,50);
        C1100.setBounds(160,670,40,50);
        C1200.setBounds(160,720,40,50);
        C001.setBackground(Color.blue);
        C200.setBackground(Color.blue);
        C300.setBackground(Color.blue);
        C400.setBackground(Color.blue);
        C500.setBackground(Color.blue);
        C600.setBackground(Color.blue);
        C700.setBackground(Color.blue);
        C800.setBackground(Color.blue);
        C900.setBackground(Color.blue);
        C1000.setBackground(Color.blue);
        C1100.setBackground(Color.blue);
        C1200.setBackground(Color.blue);
        T72.setBackground(Color.darkGray);

        C001.setVisible(v);
        C200.setVisible(v);
        C300.setVisible(v);
        C400.setVisible(v);
        C500.setVisible(v);
        C600.setVisible(v);
        C700.setVisible(v);
        C800.setVisible(v);
        C900.setVisible(v);
        C1000.setVisible(v);
        C1100.setVisible(v);
        C1200.setVisible(v);
        this.add(T72);
        this.add(C001);this.add(C200);this.add(C300);this.add(C400);
        this.add(C500);this.add(C600);this.add(C700);this.add(C800);
        this.add(C900);this.add(C1000);this.add(C1100);this.add(C1200);
    }
    private class item implements ItemListener
    {

        @Override
        public void itemStateChanged(ItemEvent e) 
        {
            if(C1p.isSelected())
                {
                    char[] PP1 = Pass1p.getPassword();
                    String TT1="";
                    for(int i=0;i<PP1.length;i++)
                    {
                        TT1 = TT1+""+PP1[i]; 
                    }
                    T1p.setText(TT1);
                    Pass1p.setVisible(false);
                    T1p.setVisible(true);
                    char[] PP2 = Pass2p.getPassword();
                    String TT2="";
                    for(int i=0;i<PP2.length;i++)
                    {
                        TT2 = TT2+""+PP2[i]; 
                    }
                    T2p.setText(TT2);
                    Pass2p.setVisible(false);
                    T2p.setVisible(true);
                    char[] PP3 = Pass3p.getPassword();
                    String TT3="";
                    for(int i=0;i<PP3.length;i++)
                    {
                        TT3 = TT3+""+PP3[i]; 
                    }
                    T3p.setText(TT3);
                    Pass3p.setVisible(false);
                    T3p.setVisible(true);
                    chek=true;
                }
                else
                {
                    String PP1 = T1p.getText().toString();
                    Pass1p.setText(PP1);
                    Pass1p.setVisible(true);
                    T2p.setVisible(false);
                    PP2p = T2p.getText().toString();
                    Pass2p.setText(PP2p);
                    Pass2p.setVisible(true);
                    T2p.setVisible(false);
                    PP3p = T3p.getText().toString();
                    Pass3p.setText(PP3p);
                    Pass3p.setVisible(true);
                    T3p.setVisible(false);
                    chek=false;
                }   
            if(C1.isSelected())
            {
                c1=1;
                abL1.setVisible(true);

            }
            else
            {
                c1=0;
                abL1.setVisible(false);
                

            }
            if(C2.isSelected())
            {
                c2=2;
                abL2.setVisible(true);
                

            }
            else
            {
                c2=0;
               abL2.setVisible(false);

            }
            if(C3.isSelected())
            {
                c3=3;
                abL3.setVisible(true);
 
            }
            else
            {
                c3=0;
                abL3.setVisible(false);

            }
            if(C4.isSelected())
            {
                c4=4;
                abL4.setVisible(true);

            }
            else
            {
                c4=0;
                abL4.setVisible(false);

            }
            if(C5.isSelected())
            {
                c5=5;
                abL5.setVisible(true);
            }
            else
            {
                c5=0;
                abL5.setVisible(false);
            }
            if(C6.isSelected())
            {
                c6=6;

                        abL6.setVisible(true);

            }
            else
            {
                c6=0;
                abL6.setVisible(false);
            }
            if(C7.isSelected())
            {
                c7=7;
                abL7.setVisible(true);
            }
            else
            {
                c7=0;
               abL7.setVisible(false);
            }
            if(C8.isSelected())
            {
                c8=8;
                abL8.setVisible(true);
            }
            else
            {
                c8=0;
               abL8.setVisible(false);
            }
            if(C9.isSelected())
            {
                c9=9;
               abL9.setVisible(true);
            }
            else
            {
                c9=0;
               abL9.setVisible(false);
            }
            if(C10.isSelected())
            {
                c10=10;
               abL10.setVisible(true);
            }
            else
            {
                c10=0;

                abL10.setVisible(false);
            }
            if(C11.isSelected())
            {
                c11=11;
                 abL11.setVisible(true);
            }
            else
            {
                c11=0;
                abL11.setVisible(false);
            }
            if(C12.isSelected())
            {
                c12=12;

                        abL12.setVisible(true);
            }
            else
            {
                c12=0;
                        abL12.setVisible(false);
            }
            if(C01.isSelected())
            {
                c01=1;
                bbL1.setVisible(true);

            }
            else
            {
                c01=0;
                bbL1.setVisible(false);

            }
            if(C20.isSelected())
            {
                c20=2;
                        bbL2.setVisible(true);


            }
            else
            {
                c20=0;

                        bbL2.setVisible(false);

            }
            if(C30.isSelected())
            {
                c30=3;
                        bbL3.setVisible(true);
        
 
            }
            else
            {
                c30=0;
                        bbL3.setVisible(false);

            }
            if(C40.isSelected())
            {
                c40=4;
                        bbL4.setVisible(true);


            }
            else
            {
                c40=0;
                        bbL4.setVisible(false);

            }
            if(C50.isSelected())
            {
                c50=5;
                        bbL5.setVisible(true);
            }
            else
            {
                c50=0;
                bbL5.setVisible(false);
            }
            if(C60.isSelected())
            {
                c60=6;
                        bbL6.setVisible(true);

            }
            else
            {
                c60=0;
                        bbL6.setVisible(false);

            }
            if(C70.isSelected())
            {
                c70=7;
                        bbL7.setVisible(true);

            }
            else
            {
                c70=0;
                        bbL7.setVisible(false);
            }
            if(C80.isSelected())
            {
                c80=8;
                        bbL8.setVisible(true);
            }
            else
            {
                c80=0;
                        bbL8.setVisible(false);
            }
            if(C90.isSelected())
            {
                c90=9;
                        bbL9.setVisible(true);

            }
            else
            {
                c90=0;

                        bbL9.setVisible(false);

            }
            if(C100.isSelected())
            {
                c100=10;
                        bbL10.setVisible(true);

            }
            else
            {
                c100=0;
                        bbL10.setVisible(false);

            }
            if(C110.isSelected())
            {
                c110=11;
                        bbL11.setVisible(true);

            }
            else
            {
                c110=0;
                        bbL11.setVisible(false);

            }
            if(C120.isSelected())
            {
                c120=12;

                        bbL12.setVisible(true);
            }
            else
            {
                c120=0;
                        bbL12.setVisible(false);
            }
            if(C001.isSelected())
            {
                c001=1;
                cbL1.setVisible(true);

            }
            else
            {
                c001=0;
                cbL1.setVisible(false);

            }
            if(C200.isSelected())
            {
                c200=1;
                cbL2.setVisible(true);

            }
            else
            {
                c200=0;
                cbL2.setVisible(false);

            }
            if(C300.isSelected())
            {
                c300=2;
                cbL3.setVisible(true);
 
            }
            else
            {
                c300=0;
                cbL3.setVisible(false);

            }
            if(C400.isSelected())
            {
                c400=3;
                cbL4.setVisible(true);

            }
            else
            {
                c400=0;
                cbL4.setVisible(false);

            }
            if(C500.isSelected())
            {
                c500=4;
                cbL5.setVisible(true);
            }
            else
            {
                c500=0;
                cbL5.setVisible(false);
            }
            if(C600.isSelected())
            {
                c600=5;
                cbL6.setVisible(true);
            }
            else
            {
                c600=0;
                cbL6.setVisible(false);
            }
            if(C700.isSelected())
            {
                c700=6;
                cbL7.setVisible(true);
            }
            else
            {
                c700=0;
                cbL7.setVisible(false);
            }
            if(C800.isSelected())
            {
                c800=7;
                cbL8.setVisible(true);
            }
            else
            {
                c800=0;
                cbL8.setVisible(false);
            }
            if(C900.isSelected())
            {
                c900=8;
                cbL9.setVisible(true);
            }
            else
            {
                c900=0;
                cbL9.setVisible(false);
            }
            if(C1000.isSelected())
            {
                c1000=9;
                cbL10.setVisible(true);
            }
            else
            {
                c1000=0;
                cbL10.setVisible(false);
            }
            if(C1100.isSelected())
            {
                c1100=10;
                cbL11.setVisible(true);
            }
            else
            {
                c1100=0;
                cbL11.setVisible(false);
            }
            if(C1200.isSelected())
            {
                c1200=11;
                cbL12.setVisible(true);
            }
            else
            {
                c1200=0;
                cbL12.setVisible(false);
                
            }
            
        }
        
        
    }
    
    private class ball implements ActionListener
    {
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(ed == true)
        { 
                    table1.setVisible(false);
                    table2.setVisible(false);
                    table3.setVisible(false);
                    table4.setVisible(false);
                    table5.setVisible(false);
                    table6.setVisible(false);
                    T70.setVisible(false);
                    T70.setVisible(false);
                    T70.setVisible(false);
                    C1.setVisible(false);
                    C2.setVisible(false);
                    C3.setVisible(false);
                    C4.setVisible(false);
                    C5.setVisible(false);
                    C6.setVisible(false);
                    C7.setVisible(false);
                    C8.setVisible(false);
                    C9.setVisible(false);
                    C10.setVisible(false);
                    C11.setVisible(false);
                    C12.setVisible(false);

                    C01.setVisible(false);
                    C20.setVisible(false);
                    C30.setVisible(false);
                    C40.setVisible(false);
                    C50.setVisible(false);
                    C60.setVisible(false);
                    C70.setVisible(false);
                    C80.setVisible(false);
                    C90.setVisible(false);
                    C100.setVisible(false);
                    C110.setVisible(false);
                    C120.setVisible(false);

                    C001.setVisible(false);
                    C200.setVisible(false);
                    C300.setVisible(false);
                    C400.setVisible(false);
                    C500.setVisible(false);
                    C600.setVisible(false);
                    C700.setVisible(false);
                    C800.setVisible(false);
                    C900.setVisible(false);
                    C1000.setVisible(false);
                    C1100.setVisible(false);
                    C1200.setVisible(false);
                    
                   /* Pass1p.setVisible(false);
                    Pass2p.setVisible(false);
                    Pass3p.setVisible(false);
                    T1p.setVisible(false);
                    T2p.setVisible(false);
                    T3p.setVisible(false);*/
                    
            if (edx1<=145)
            {
                diference1=15;   
            }
            else
            {
                diference1=0;   
            }
            if (edx2 <= 670)
            {
                diference2=15;   
            }
            else
            {
                diference2=0;   
            }
            if (edx3 <= 1080)
            {
                diference3=15;   
            }
            else
            {
                diference3=0;   
            }
            if (edx4<=650)
            {
                diference4=15;   
            }
            else
            {
                diference4=0;   
            }
            if (edx5<=1085)
            {
                diference5=15;   
            }
            else
            {
                diference5=0;   
            }
            if (edx6<=200)
            {
                diference6=15;   
            }
            else
            {
                diference6=0;   
            }
            if(edx10 <= 760)
            {
                diference10=15;
            }
            else
            {
                diference10=0;
            }
            if(edx11 <= 740)
            {
                diference11=15;
            }
            else
            {
                diference11=0;
            }
            if(us == true)
            {
                if(edx7<=245)
                {
                    diference7=5; 
                    
                }
                else
                {
                    diference7=0;
                }
                
            }
            else
            {
                if(edx7>=200)
                {
                    diference7=-5;
                }
                else
                {
                    diference7=0;
                }
            }
            if(pa == true)
            {
                    if(edx8<=245)
                {
                    diference8=5;
                }
                else
                {
                    diference8=0;
                }
            }
            else
            {
                if(edx8>=200)
                {
                    diference8=-5;
                }
                else
                {
                    diference8=0;
                }
            }

            if(av == true)
            {
                if(edx9<=245)
                {
                    diference9=5;
                }
                else
                {
                    diference9=0;
                }
            }
            else
            {
                if(edx9>=200)
                {
                    diference9=-5;
                }
                else
                {
                    diference9=0;
                }
            }
           
            
        
        }
        if(ed == false)
        {
            

            if (edx1>=120)
            {
                diference1=-15;   
            }
            else
            {
                diference1=0;   
            }
            if (edx2 >= 40)
            {
                diference2=-25;
                changeuser(false);
                changepass(false);
                changeav(false);
                
                Pass1p.setVisible(false);
                Pass2p.setVisible(false);
                Pass3p.setVisible(false);
                T1p.setVisible(false);
                T2p.setVisible(false);
                T3p.setVisible(false);
                
                L1a.setVisible(false);
                        L2a.setVisible(false);
                        L3a.setVisible(false);
                        L4a.setVisible(false);
                        L5a.setVisible(false);
                        L6a.setVisible(false);
                        L7a.setVisible(false);
                        L8a.setVisible(false);
                        L9a.setVisible(false);
                        L10a.setVisible(false);
                        L11a.setVisible(false);
                        L12a.setVisible(false);
                        L13a.setVisible(false);
                        L14a.setVisible(false);
                        L15a.setVisible(false);
                        L16a.setVisible(false);
            }
            else
            {
                diference2=0; 
               
            }
            if (edx3 >= 40)
            {
                diference3=-25; 
                
            }
            else
            {
                B9.setVisible(false);
                B10.setVisible(false);
                B11.setVisible(false);
                diference3=0; 
                if(select == 1)
                {
                    table1.setVisible(true);
                    table2.setVisible(true);
                    
                    C1.setVisible(true);
                    C2.setVisible(true);
                    C3.setVisible(true);
                    C4.setVisible(true);
                    C5.setVisible(true);
                    C6.setVisible(true);
                    C7.setVisible(true);
                    C8.setVisible(true);
                    C9.setVisible(true);
                    C10.setVisible(true);
                    C11.setVisible(true);
                    C12.setVisible(true);
                    T70.setVisible(true);
                }
                else if(select == 2)
                {
                    table3.setVisible(true);
                    table5.setVisible(true);
                    C01.setVisible(true);
                    C20.setVisible(true);
                    C30.setVisible(true);
                    C40.setVisible(true);
                    C50.setVisible(true);
                    C60.setVisible(true);
                    C70.setVisible(true);
                    C80.setVisible(true);
                    C90.setVisible(true);
                    C100.setVisible(true);
                    C110.setVisible(true);
                    C120.setVisible(true);
                    T71.setVisible(true);
                }
                else if(select == 3)
                {
                    table4.setVisible(true);
                    table6.setVisible(true);
                    C001.setVisible(true);
                    C200.setVisible(true);
                    C300.setVisible(true);
                    C400.setVisible(true);
                    C500.setVisible(true);
                    C600.setVisible(true);
                    C700.setVisible(true);
                    C800.setVisible(true);
                    C900.setVisible(true);
                    C1000.setVisible(true);
                    C1100.setVisible(true);
                    C1200.setVisible(true);
                    T72.setVisible(true);
                }
            }
            if (edx4>=40)
            {
                diference4=-25;   
            }
            else
            {
                diference4=0;   
            }
            if (edx5>=40)
            {
                diference5=-25;   
            }
            else
            {
                diference5=0;   
            }
            if (edx6>=0)
            {
                diference6=-5;   
            }
            else
            {
                diference6=0;   
            }
            if(edx10 >= 0)
            {
                diference10=-25;
                
            }
            else
            {
                diference10=0;
            }
            if(edx11 >= 0)
            {
                diference11=-25;
            }
            else
            {
                diference11=0;
            }
            
            
        
        }
        edx1+=diference1;
        edx2+=diference2;
        edx3+=diference3;
        edx4+=diference4;
        edx5+=diference5;
        edx6+=diference6;
        edx7+=diference7;
        edx8+=diference8;
        edx9+=diference9;
        edx10+=diference10;
        edx11+=diference11;
        repaint();

    }
    }
    private class edite implements ItemListener
    {

        @Override
        public void itemStateChanged(ItemEvent e) 
        {
             if(edite.isSelected())
            {
                ed = true;
            }
            else
            {
                ed = false;
                
            }
            
        }
        
        
    }
    public class Pan implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            
        try 
        {
            
            if(e.getSource() == sel)
            {
                if(select == 1)
                {
                   
                    switch (k1) 
                    {
                        case 1:C1.setSelected(true);break;
                        case 2:C1.setSelected(true);C2.setSelected(true);break;
                        case 3:C1.setSelected(true);C2.setSelected(true);C3.setSelected(true);break;
                        case 4:C1.setSelected(true);C2.setSelected(true);C3.setSelected(true);C4.setSelected(true);break;
                        case 5:C1.setSelected(true);C2.setSelected(true);C3.setSelected(true);C4.setSelected(true);C5.setSelected(true);break;
                        case 6:C1.setSelected(true);C2.setSelected(true);C3.setSelected(true);C4.setSelected(true);C5.setSelected(true);C6.setSelected(true);break;
                        case 7:C1.setSelected(true);C2.setSelected(true);C3.setSelected(true);C4.setSelected(true);C5.setSelected(true);C6.setSelected(true);C7.setSelected(true);break;
                        case 8:C1.setSelected(true);C2.setSelected(true);C3.setSelected(true);C4.setSelected(true);C5.setSelected(true);C6.setSelected(true);C7.setSelected(true);C8.setSelected(true);break;
                        case 9:C1.setSelected(true);C2.setSelected(true);C3.setSelected(true);C4.setSelected(true);C5.setSelected(true);C6.setSelected(true);C7.setSelected(true);C8.setSelected(true);C9.setSelected(true);break;
                        case 10:C1.setSelected(true);C2.setSelected(true);C3.setSelected(true);C4.setSelected(true);C5.setSelected(true);C6.setSelected(true);C7.setSelected(true);C8.setSelected(true);C9.setSelected(true);C10.setSelected(true);break;
                        case 11:C1.setSelected(true);C2.setSelected(true);C3.setSelected(true);C4.setSelected(true);C5.setSelected(true);C6.setSelected(true);C7.setSelected(true);C8.setSelected(true);C9.setSelected(true);C10.setSelected(true);C11.setSelected(true);break;
                        case 12:C1.setSelected(true);C2.setSelected(true);C3.setSelected(true);C4.setSelected(true);C5.setSelected(true);C6.setSelected(true);C7.setSelected(true);C8.setSelected(true);C9.setSelected(true);C10.setSelected(true);C11.setSelected(true);C12.setSelected(true);break;
                    }
   
                }
                if(select == 2)
                {
                    System.out.print(k2);
                    switch (k2) 
                    {
                        case 1:C01.setSelected(true);break;
                        case 2:C01.setSelected(true);C20.setSelected(true);break;
                        case 3:C01.setSelected(true);C20.setSelected(true);C30.setSelected(true);break;
                        case 4:C01.setSelected(true);C20.setSelected(true);C30.setSelected(true);C40.setSelected(true);break;
                        case 5:C01.setSelected(true);C20.setSelected(true);C30.setSelected(true);C40.setSelected(true);C50.setSelected(true);break;
                        case 6:C01.setSelected(true);C20.setSelected(true);C30.setSelected(true);C40.setSelected(true);C50.setSelected(true);C60.setSelected(true);break;
                        case 7:C01.setSelected(true);C20.setSelected(true);C30.setSelected(true);C40.setSelected(true);C50.setSelected(true);C60.setSelected(true);C70.setSelected(true);break;
                        case 8:C01.setSelected(true);C20.setSelected(true);C30.setSelected(true);C40.setSelected(true);C50.setSelected(true);C60.setSelected(true);C70.setSelected(true);C80.setSelected(true);break;
                        case 9:C01.setSelected(true);C20.setSelected(true);C30.setSelected(true);C40.setSelected(true);C50.setSelected(true);C60.setSelected(true);C70.setSelected(true);C80.setSelected(true);C90.setSelected(true);break;
                        case 10:C01.setSelected(true);C20.setSelected(true);C30.setSelected(true);C40.setSelected(true);C50.setSelected(true);C60.setSelected(true);C70.setSelected(true);C80.setSelected(true);C90.setSelected(true);C100.setSelected(true);break;
                        case 11:C01.setSelected(true);C20.setSelected(true);C30.setSelected(true);C40.setSelected(true);C50.setSelected(true);C60.setSelected(true);C70.setSelected(true);C80.setSelected(true);C90.setSelected(true);C100.setSelected(true);C110.setSelected(true);break;
                        case 12:C01.setSelected(true);C20.setSelected(true);C30.setSelected(true);C40.setSelected(true);C50.setSelected(true);C60.setSelected(true);C70.setSelected(true);C80.setSelected(true);C90.setSelected(true);C100.setSelected(true);C110.setSelected(true);C120.setSelected(true);break;
                    }
                }
                if(select == 3)
                {
                    switch (k3) 
                    {
                        case 1:C001.setSelected(true);break;
                        case 2:C001.setSelected(true);C200.setSelected(true);break;
                        case 3:C001.setSelected(true);C200.setSelected(true);C300.setSelected(true);break;
                        case 4:C001.setSelected(true);C200.setSelected(true);C300.setSelected(true);C400.setSelected(true);break;
                        case 5:C001.setSelected(true);C200.setSelected(true);C300.setSelected(true);C400.setSelected(true);C500.setSelected(true);break;
                        case 6:C001.setSelected(true);C200.setSelected(true);C300.setSelected(true);C400.setSelected(true);C500.setSelected(true);C600.setSelected(true);break;
                        case 7:C001.setSelected(true);C200.setSelected(true);C300.setSelected(true);C400.setSelected(true);C500.setSelected(true);C600.setSelected(true);C700.setSelected(true);break;
                        case 8:C001.setSelected(true);C200.setSelected(true);C300.setSelected(true);C400.setSelected(true);C500.setSelected(true);C600.setSelected(true);C700.setSelected(true);C800.setSelected(true);break;
                        case 9:C001.setSelected(true);C200.setSelected(true);C300.setSelected(true);C400.setSelected(true);C500.setSelected(true);C600.setSelected(true);C700.setSelected(true);C800.setSelected(true);C900.setSelected(true);break;
                        case 10:C001.setSelected(true);C200.setSelected(true);C300.setSelected(true);C400.setSelected(true);C500.setSelected(true);C600.setSelected(true);C700.setSelected(true);C800.setSelected(true);C900.setSelected(true);C1000.setSelected(true);break;
                        case 11:C001.setSelected(true);C200.setSelected(true);C300.setSelected(true);C400.setSelected(true);C500.setSelected(true);C600.setSelected(true);C700.setSelected(true);C800.setSelected(true);C900.setSelected(true);C1000.setSelected(true);C1100.setSelected(true);break;
                        case 12:C001.setSelected(true);C200.setSelected(true);C300.setSelected(true);C400.setSelected(true);C500.setSelected(true);C600.setSelected(true);C700.setSelected(true);C800.setSelected(true);C900.setSelected(true);C1000.setSelected(true);C1100.setSelected(true);C1200.setSelected(true);break;
                    }
                }
                Pass1p.setVisible(false);
                Pass2p.setVisible(false);
                Pass3p.setVisible(false);
                T1p.setVisible(false);
                T2p.setVisible(false);
                T3p.setVisible(false);
            }
            if(e.getSource() == can)
            {
                if(select == 1)
                {
                    C1.setSelected(false);
                    C2.setSelected(false);
                    C3.setSelected(false);
                    C4.setSelected(false);
                    C5.setSelected(false);
                    C6.setSelected(false);
                    C7.setSelected(false);
                    C8.setSelected(false);
                    C9.setSelected(false);
                    C10.setSelected(false);
                    C11.setSelected(false);
                    C12.setSelected(false);
                    
                }
                if(select == 2)
                {
                    C01.setSelected(false);
                    C20.setSelected(false);
                    C30.setSelected(false);
                    C40.setSelected(false);
                    C50.setSelected(false);
                    C60.setSelected(false);
                    C70.setSelected(false);
                    C80.setSelected(false);
                    C90.setSelected(false);
                    C100.setSelected(false);
                    C110.setSelected(false);
                    C120.setSelected(false);
                }
                if(select == 3)
                {
                    C001.setSelected(false);
                    C200.setSelected(false);
                    C300.setSelected(false);
                    C400.setSelected(false);
                    C500.setSelected(false);
                    C600.setSelected(false);
                    C700.setSelected(false);
                    C800.setSelected(false);
                    C900.setSelected(false);
                    C1000.setSelected(false);
                    C1100.setSelected(false);
                    C1200.setSelected(false);
                }
                Pass1p.setVisible(false);
                Pass2p.setVisible(false);
                Pass3p.setVisible(false);
                T1p.setVisible(false);
                T2p.setVisible(false);
                T3p.setVisible(false);
            }
            //categorie
            if(e.getSource()==a1)
                {
                    type="G-maile";
                    table1.setVisible(true);
                    table2.setVisible(true);
                    table3.setVisible(false);
                    table4.setVisible(false);
                    table5.setVisible(false);
                    table6.setVisible(false);
                    C = "google";
                    a1.setBackground(Color.yellow);
                    a2.setBackground(Color.darkGray);
                    a3.setBackground(Color.darkGray);
                    select = 1;
                    aL1.setText("Type (EX :: Gmail,Facebock...)");
                    aL2.setText("Username");
                    aL3.setText("e-mail");
                    aL4.setText("password");
                    aL5.setText("phone Number");
                    abL1.setVisible(false);
                    abL2.setVisible(false);
                    abL3.setVisible(false);
                    abL4.setVisible(false);
                    abL5.setVisible(false);
                    abL6.setVisible(false);
                    abL7.setVisible(false);
                    abL8.setVisible(false);
                    abL9.setVisible(false);
                    abL10.setVisible(false);
                    abL11.setVisible(false);
                    abL12.setVisible(false);
                    bbL1.setVisible(false);
                    bbL2.setVisible(false);
                    bbL3.setVisible(false);
                    bbL4.setVisible(false);
                    bbL5.setVisible(false);
                    bbL6.setVisible(false);
                    bbL7.setVisible(false);
                    bbL8.setVisible(false);
                    bbL9.setVisible(false);
                    bbL10.setVisible(false);
                    bbL11.setVisible(false);
                    bbL12.setVisible(false);
                    cbL1.setVisible(false);
                    cbL2.setVisible(false);
                    cbL3.setVisible(false);
                    cbL4.setVisible(false);
                    cbL5.setVisible(false);
                    cbL6.setVisible(false);
                    cbL7.setVisible(false);
                    cbL8.setVisible(false);
                    cbL9.setVisible(false);
                    cbL10.setVisible(false);
                    cbL11.setVisible(false);
                    cbL12.setVisible(false);
                    C1.setSelected(false);
                    C2.setSelected(false);
                    C3.setSelected(false);
                    C4.setSelected(false);
                    C5.setSelected(false);
                    C6.setSelected(false);
                    C7.setSelected(false);
                    C8.setSelected(false);
                    C9.setSelected(false);
                    C10.setSelected(false);
                    C11.setSelected(false);
                    C12.setSelected(false);

                    C01.setSelected(false);
                    C20.setSelected(false);
                    C30.setSelected(false);
                    C40.setSelected(false);
                    C50.setSelected(false);
                    C60.setSelected(false);
                    C70.setSelected(false);
                    C80.setSelected(false);
                    C90.setSelected(false);
                    C100.setSelected(false);
                    C110.setSelected(false);
                    C120.setSelected(false);

                    C001.setSelected(false);
                    C200.setSelected(false);
                    C300.setSelected(false);
                    C400.setSelected(false);
                    C500.setSelected(false);
                    C600.setSelected(false);
                    C700.setSelected(false);
                    C800.setSelected(false);
                    C900.setSelected(false);
                    C1000.setSelected(false);
                    C1100.setSelected(false);
                    C1200.setSelected(false);
                    if(choix == "delete")
                    {
                        cL7.setVisible(true);
                        cL8.setVisible(false);
                        cL9.setVisible(false);
                        table3.setBounds(160,170,1105,635);
                        table5.setBounds(160,120,1105,50);
                        table6.setBounds(160,120,1105,50);
                        table4.setBounds(160,170,1105,635);
                        table1.setBounds(200,120,1065,50);
                        table2.setBounds(200,170,1065,635);
                            dis1(true,true);
                            dis2(false,false);
                            dis3(false,false);
                            sel.setBackground(Color.yellow);
                    }
                    
                }
                if(e.getSource()==a2)
                {
                    type="facebok";
                    table1.setVisible(false);
                    table2.setVisible(false);
                    table3.setVisible(true);
                    table4.setVisible(false);
                    table5.setVisible(true);
                    table6.setVisible(false);
                    C = "face";
                    a2.setBackground(Color.cyan);;
                    a1.setBackground(Color.darkGray);
                    a3.setBackground(Color.darkGray);
                    select = 2;
                    aL1.setText("user");
                    aL2.setText("e-mail");
                    aL3.setText("password");
                    aL4.setText("e-mail saver");
                    aL5.setText("phone Number");
                    abL1.setVisible(false);
                    abL2.setVisible(false);
                    abL3.setVisible(false);
                    abL4.setVisible(false);
                    abL5.setVisible(false);
                    abL6.setVisible(false);
                    abL7.setVisible(false);
                    abL8.setVisible(false);
                    abL9.setVisible(false);
                    abL10.setVisible(false);
                    abL11.setVisible(false);
                    abL12.setVisible(false);
                    bbL1.setVisible(false);
                    bbL2.setVisible(false);
                    bbL3.setVisible(false);
                    bbL4.setVisible(false);
                    bbL5.setVisible(false);
                    bbL6.setVisible(false);
                    bbL7.setVisible(false);
                    bbL8.setVisible(false);
                    bbL9.setVisible(false);
                    bbL10.setVisible(false);
                    bbL11.setVisible(false);
                    bbL12.setVisible(false);
                    cbL1.setVisible(false);
                    cbL2.setVisible(false);
                    cbL3.setVisible(false);
                    cbL4.setVisible(false);
                    cbL5.setVisible(false);
                    cbL6.setVisible(false);
                    cbL7.setVisible(false);
                    cbL8.setVisible(false);
                    cbL9.setVisible(false);
                    cbL10.setVisible(false);
                    cbL11.setVisible(false);
                    cbL12.setVisible(false);
                    C1.setSelected(false);
                    C2.setSelected(false);
                    C3.setSelected(false);
                    C4.setSelected(false);
                    C5.setSelected(false);
                    C6.setSelected(false);
                    C7.setSelected(false);
                    C8.setSelected(false);
                    C9.setSelected(false);
                    C10.setSelected(false);
                    C11.setSelected(false);
                    C12.setSelected(false);

                    C01.setSelected(false);
                    C20.setSelected(false);
                    C30.setSelected(false);
                    C40.setSelected(false);
                    C50.setSelected(false);
                    C60.setSelected(false);
                    C70.setSelected(false);
                    C80.setSelected(false);
                    C90.setSelected(false);
                    C100.setSelected(false);
                    C110.setSelected(false);
                    C120.setSelected(false);

                    C001.setSelected(false);
                    C200.setSelected(false);
                    C300.setSelected(false);
                    C400.setSelected(false);
                    C500.setSelected(false);
                    C600.setSelected(false);
                    C700.setSelected(false);
                    C800.setSelected(false);
                    C900.setSelected(false);
                    C1000.setSelected(false);
                    C1100.setSelected(false);
                    C1200.setSelected(false);
                    if(choix == "delete")
                    {
                            cL7.setVisible(false);
                            cL8.setVisible(true);
                            cL9.setVisible(false);
                            table3.setBounds(200,170,1065,635);
                            table5.setBounds(200,120,1065,50);
                            table2.setBounds(160,170,1105,635);
                            table1.setBounds(160,120,1105,50);
                            table6.setBounds(160,120,1105,50);
                            table4.setBounds(160,170,1105,635);
                            dis1(false,false);
                            dis2(true,true);
                            dis3(false,false);
                            sel.setBackground(Color.cyan);
                    }
                }
                if(e.getSource()==a3)
                {

                    type="other";
                    table1.setVisible(false);
                    table2.setVisible(false);
                    table3.setVisible(false);
                    table4.setVisible(true);
                    table5.setVisible(false);
                    table6.setVisible(true);
                    C = "oth";
                    a3.setBackground(Color.blue);
                    a1.setBackground(Color.darkGray);
                    a2.setBackground(Color.darkGray);
                    select = 3;
                    aL1.setText("Type (EX :: Gmail,Facebock...)");
                    aL2.setText("Username");
                    aL3.setText("e-mail");
                    aL4.setText("password");
                    aL5.setText("phone Number");
                    abL1.setVisible(false);
                    abL2.setVisible(false);
                    abL3.setVisible(false);
                    abL4.setVisible(false);
                    abL5.setVisible(false);
                    abL6.setVisible(false);
                    abL7.setVisible(false);
                    abL8.setVisible(false);
                    abL9.setVisible(false);
                    abL10.setVisible(false);
                    abL11.setVisible(false);
                    abL12.setVisible(false);
                    bbL1.setVisible(false);
                    bbL2.setVisible(false);
                    bbL3.setVisible(false);
                    bbL4.setVisible(false);
                    bbL5.setVisible(false);
                    bbL6.setVisible(false);
                    bbL7.setVisible(false);
                    bbL8.setVisible(false);
                    bbL9.setVisible(false);
                    bbL10.setVisible(false);
                    bbL11.setVisible(false);
                    bbL12.setVisible(false);
                    cbL1.setVisible(false);
                    cbL2.setVisible(false);
                    cbL3.setVisible(false);
                    cbL4.setVisible(false);
                    cbL5.setVisible(false);
                    cbL6.setVisible(false);
                    cbL7.setVisible(false);
                    cbL8.setVisible(false);
                    cbL9.setVisible(false);
                    cbL10.setVisible(false);
                    cbL11.setVisible(false);
                    cbL12.setVisible(false);
                    C1.setSelected(false);
                    C2.setSelected(false);
                    C3.setSelected(false);
                    C4.setSelected(false);
                    C5.setSelected(false);
                    C6.setSelected(false);
                    C7.setSelected(false);
                    C8.setSelected(false);
                    C9.setSelected(false);
                    C10.setSelected(false);
                    C11.setSelected(false);
                    C12.setSelected(false);

                    C01.setSelected(false);
                    C20.setSelected(false);
                    C30.setSelected(false);
                    C40.setSelected(false);
                    C50.setSelected(false);
                    C60.setSelected(false);
                    C70.setSelected(false);
                    C80.setSelected(false);
                    C90.setSelected(false);
                    C100.setSelected(false);
                    C110.setSelected(false);
                    C120.setSelected(false);

                    C001.setSelected(false);
                    C200.setSelected(false);
                    C300.setSelected(false);
                    C400.setSelected(false);
                    C500.setSelected(false);
                    C600.setSelected(false);
                    C700.setSelected(false);
                    C800.setSelected(false);
                    C900.setSelected(false);
                    C1000.setSelected(false);
                    C1100.setSelected(false);
                    C1200.setSelected(false);
                    if(choix == "delete")
                    {
                            cL7.setVisible(false);
                            cL8.setVisible(false);
                            cL9.setVisible(true);
                            table3.setBounds(160,170,1105,635);
                            table5.setBounds(160,120,1105,50);
                            table2.setBounds(160,170,1105,635);
                            table1.setBounds(160,120,1105,50);
                            table6.setBounds(200,120,1065,50);
                            table4.setBounds(200,170,1065,635);
                            dis1(false,false);
                            dis2(false,false);
                            dis3(true,true);
                            sel.setBackground(Color.blue);
                    }
                }
                
                
                    //add
                    if(e.getSource()==B1)
                    {
                        can.setVisible(false);
                        choix="add";
                        sel.setVisible(false);
                        dis1(false,false);
                        dis2(false,false);
                        dis3(false,false);
                        cL6.setVisible(false);
                        cL7.setVisible(false);
                        cL8.setVisible(false);
                        cL9.setVisible(false);
                        table5.setBounds(160,120,1105,50);
                        table2.setBounds(160,170,1105,635);
                        table3.setBounds(160,170,1105,635);
                        table1.setBounds(160,120,1105,50);
                        table4.setBounds(160,170,1105,635);
                        color = "blue";
                        B1.setBackground(Color.blue);
                        B1.setForeground(Color.white);
                        B2.setBackground(Color.darkGray);
                        B2.setForeground(Color.lightGray);
                        B3.setBackground(Color.darkGray);
                        B3.setForeground(Color.lightGray);
                        aB1.setVisible(true);
                        aB2.setVisible(false);
                        aB3.setVisible(false);
                        aB4.setVisible(false);
                        if(select == 1)
                        {
                            aL1.setText("Type (EX :: Gmail,Facebock...)");
                            aL2.setText("Username");
                            aL3.setText("e-mail");
                            aL4.setText("password");
                            aL5.setText("phone Number");
                            aL1.setVisible(true);
                            aL2.setVisible(true);
                            aL3.setVisible(true);
                            aL4.setVisible(true);
                            aL5.setVisible(true);
                        }
                        else if(select == 2)
                        {
                            aL1.setText("user");
                            aL2.setText("e-mail");
                            aL3.setText("password");
                            aL4.setText("e-mail saver");
                            aL5.setText("phone Number");
                            aL1.setVisible(true);
                            aL2.setVisible(true);
                            aL3.setVisible(true);
                            aL4.setVisible(true);
                            aL5.setVisible(true);
                        }
                        else if(select == 3)
                        {
                            aL1.setText("Type (EX :: Gmail,Facebock...)");
                            aL2.setText("Username");
                            aL3.setText("e-mail");
                            aL4.setText("password");
                            aL5.setText("phone Number");
                            aL1.setVisible(true);
                            aL2.setVisible(true);
                            aL3.setVisible(true);
                            aL4.setVisible(true);
                            aL5.setVisible(true);
                        }
                        
                        aT1.setVisible(true);
                        aT2.setVisible(true);
                        aT3.setVisible(true);
                        aT4.setVisible(true);
                        aT5.setVisible(true);

                            aT1.setText("");
                            aT2.setVisible(true);
                            aT2.setText("");
                            aT3.setVisible(true);
                            aT3.setText("");
                            aT4.setVisible(true);
                            aT4.setText("");
                            aT5.setVisible(true);
                            aT5.setText("");
                            aB1.setVisible(true);
                        aL1.setBounds(1275,100,250,30);
                        aL2.setBounds(1275,170,250,30);
                        aL3.setBounds(1275,240,250,30);
                        aL4.setBounds(1275,310,250,30);
                        aL5.setBounds(1275,380,250,30);
                        aL10.setVisible(false);
                        aL20.setVisible(false);
                        aL30.setVisible(false);
                        aL40.setVisible(false);
                        aL50.setVisible(false);
                    }
                    //edite

                    if(e.getSource()==B2)
                    {
                        can.setVisible(false);
                        choix = "edite";
                        sel.setVisible(false);
                        dis1(false,false);
                        dis2(false,false);
                        dis3(false,false);
                        cL6.setVisible(false);
                        cL7.setVisible(false);
                        cL8.setVisible(false);
                        cL9.setVisible(false);
                            color = "green";
                            table5.setBounds(160,120,1105,50);
                            table2.setBounds(160,170,1105,635);
                            table3.setBounds(160,170,1105,635);
                            table1.setBounds(160,120,1105,50);
                            table4.setBounds(160,170,1105,635);

                            B1.setBackground(Color.darkGray);
                            B1.setForeground(Color.lightGray);
                            B2.setBackground(Color.green);
                            B2.setForeground(Color.white);
                            B3.setBackground(Color.darkGray);
                            B3.setForeground(Color.lightGray);
                            aB1.setVisible(false);
                            aB2.setVisible(true);
                            aB3.setVisible(true);
                            aB4.setVisible(false);
                             if(select == 1)
                            {
                           
                            table2.setSelectionBackground(Color.green);
                            aL1.setText("Type");
                            aL2.setText("Username");
                            aL3.setText("e-mail");
                            aL4.setText("password");
                            aL5.setText("phone Number");
                            aL1.setVisible(true);
                            aL2.setVisible(true);
                            aL3.setVisible(true);
                            aL4.setVisible(true);
                            aL5.setVisible(true);
                            aT1.setText(table2.getValueAt(row2,0).toString());
                            aT2.setText(table2.getValueAt(row2,1).toString());
                            aT3.setText(table2.getValueAt(row2,2).toString());
                            aT4.setText(table2.getValueAt(row2,3).toString());
                            aT5.setText(table2.getValueAt(row2,4).toString());
                            }
                            else if(select == 2)
                            {
                            
                            table3.setSelectionBackground(Color.green);
                            aL1.setText("user");
                            aL2.setText("e-mail");
                            aL3.setText("password");
                            aL4.setText("e-mail saver");
                            aL5.setText("phone Number");
                            aL1.setVisible(true);
                            aL2.setVisible(true);
                            aL3.setVisible(true);
                            aL4.setVisible(true);
                            aL5.setVisible(true);
                            aT1.setText(table3.getValueAt(row3,0).toString());
                            aT2.setText(table3.getValueAt(row3,1).toString());
                            aT3.setText(table3.getValueAt(row3,2).toString());
                            aT4.setText(table3.getValueAt(row3,3).toString());
                            aT5.setText(table3.getValueAt(row3,4).toString());
                            }
                            else if(select == 3)
                            {
                               
                            table4.setSelectionBackground(Color.green);
                            aL1.setText("Type");
                            aL2.setText("Username");
                            aL3.setText("e-mail");
                            aL4.setText("password");
                            aL5.setText("phone Number");
                            aL1.setVisible(true);
                            aL2.setVisible(true);
                            aL3.setVisible(true);
                            aL4.setVisible(true);
                            aL5.setVisible(true);
                            aT1.setText(table4.getValueAt(row4,0).toString());
                            aT2.setText(table4.getValueAt(row4,1).toString());
                            aT3.setText(table4.getValueAt(row4,2).toString());
                            aT4.setText(table4.getValueAt(row4,3).toString());
                            aT5.setText(table4.getValueAt(row4,4).toString());
                            }
                            aT1.setVisible(true);
                            aT2.setVisible(true);
                            aT3.setVisible(true);
                            aT4.setVisible(true);
                            aT5.setVisible(true);
                       
                            aL1.setBounds(1275,100,250,30);
                            aL2.setBounds(1275,170,250,30);
                            aL3.setBounds(1275,240,250,30);
                            aL4.setBounds(1275,310,250,30);
                            aL5.setBounds(1275,380,250,30);
                            aL10.setVisible(false);
                            aL20.setVisible(false);
                            aL30.setVisible(false);
                            aL40.setVisible(false);
                            aL50.setVisible(false);


                    }
                    //delete
                    if(e.getSource()==B3)
                    {
                        
                        choix = "delete";
                        color = "red";
                        B1.setBackground(Color.darkGray);
                        B1.setForeground(Color.lightGray);
                        B2.setBackground(Color.darkGray);
                        B2.setForeground(Color.lightGray);
                        B3.setBackground(Color.red);
                        B3.setForeground(Color.white);
                        aT1.setVisible(false);
                        aT2.setVisible(false);
                        aT3.setVisible(false);
                        aT4.setVisible(false);
                        aT5.setVisible(false);
                        aB1.setVisible(false);
                        aB2.setVisible(false);
                        aB3.setVisible(false);
                        aB4.setVisible(true);
                        cL6.setVisible(true);
                        
                        aL1.setVisible(false);
                        aL2.setVisible(false);
                        aL3.setVisible(false);
                        aL4.setVisible(false);
                        aL5.setVisible(false);
                        C1.setVisible(true);
                        C2.setVisible(true);
                        C3.setVisible(true);
                        C4.setVisible(true);
                        C5.setVisible(true);
                        C6.setVisible(true);
                        C7.setVisible(true);
                        C8.setVisible(true);
                        C9.setVisible(true);
                        C10.setVisible(true);
                        C11.setVisible(true);
                        C12.setVisible(true);
                        sel.setVisible(true);
                        can.setVisible(true);
                        
                        if(select == 1)
                        {
                            sel.setBackground(Color.yellow);
                            dis1(true,true);
                            dis2(false,false);
                            dis3(false,false);
                            cL7.setVisible(true);
                            cL8.setVisible(false);
                            cL9.setVisible(false);
                            table3.setBounds(160,170,1105,635);
                            table5.setBounds(160,120,1105,50);
                            table6.setBounds(160,120,1105,50);
                            table4.setBounds(160,170,1105,635);
                            table1.setBounds(200,120,1065,50);
                            table2.setBounds(200,170,1065,635);
                            
                        }
                        else if(select == 2)
                        {
                            sel.setBackground(Color.cyan);
                            dis1(false,false);
                            dis2(true,true);
                            dis3(false,false);
                            cL7.setVisible(false);
                            cL8.setVisible(true);
                            cL9.setVisible(false);
                            table3.setBounds(200,170,1065,635);
                            table5.setBounds(200,120,1065,50);
                            table2.setBounds(160,170,1105,635);
                            table1.setBounds(160,120,1105,50);
                            table6.setBounds(160,120,1105,50);
                            table4.setBounds(160,170,1105,635);
                            
                        }
                        else if(select == 3)
                        {
                            sel.setBackground(Color.blue);
                            dis1(false,false);
                            dis2(false,false);
                            dis3(true,true);
                            cL7.setVisible(false);
                            cL8.setVisible(false);
                            cL9.setVisible(true);
                            table3.setBounds(160,170,1105,635);
                            table5.setBounds(160,120,1105,50);
                            table2.setBounds(160,170,1105,635);
                            table1.setBounds(160,120,1105,50);
                            table6.setBounds(200,120,1065,50);
                            table4.setBounds(200,170,1065,635);
                            
                        }
                    }
                    //abaut
                    if(e.getSource()==B5)
                    {
                        E_About_fram ab = new E_About_fram();
                    }
                    //dark
                    if(e.getSource()==B6)
                    {
 
                        table2.setBackground(Color.black);
                        table3.setBackground(Color.black);
                        table4.setBackground(Color.black);
                    }
                    //white
                    if(e.getSource()==B7)
                    {
                        table2.setBackground(Color.gray);
                        table3.setBackground(Color.gray);
                        table4.setBackground(Color.gray);
                    }
                   
                    //user
                    if(e.getSource()==B9)
                    {
                       // F_Change_Username u = new F_Change_Username(user,password);
                        us = true;
                        pa = false;
                        av = false;
                        changeuser(true);
                        changepass(false);
                        changeav(false);
                        Pass1p.setVisible(false);
                        Pass2p.setVisible(false);
                        Pass3p.setVisible(false);
                        T1p.setVisible(false);
                        T2p.setVisible(false);
                        T3p.setVisible(false);
                        L1a.setVisible(false);
                        L2a.setVisible(false);
                        L3a.setVisible(false);
                        L4a.setVisible(false);
                        L5a.setVisible(false);
                        L6a.setVisible(false);
                        L7a.setVisible(false);
                        L8a.setVisible(false);
                        L9a.setVisible(false);
                        L10a.setVisible(false);
                        L11a.setVisible(false);
                        L12a.setVisible(false);
                        L13a.setVisible(false);
                        L14a.setVisible(false);
                        L15a.setVisible(false);
                        L16a.setVisible(false);
                    }
                    if(e.getSource()==B1u) 
                    {

                        String LL2=T2u.getText().toString();
                        if(LL2.equals(user))
                        {
                             JOptionPane.showMessageDialog(null,"this is the same name");
                        }
                        else if(LL2.length()==0)
                        {    
                             JOptionPane.showMessageDialog(null,"empti name?");     
                        }
                        else if(LL2.length()>12)
                        {    
                             JOptionPane.showMessageDialog(null,"username very lenge\ntry again");     
                        }
                        else 
                        {   

                            admin.delete();
                            user = LL2;
                            photo[0]=user;
                            FileWriter in = new FileWriter(user+".txt",true);
                            for(int i=0;i<7;i++)
                            {
                                in.write(photo[i]+"\n");
                            }
                            in.close();

                            gdata.delete();
                            FileWriter g = new FileWriter(user+"G-maildata.txt");;
                            for(int i=0;i<line2;i++)
                            {
                                g.write(lis2[i]+"\n");
                            }
                            g.close();

                            fdata.delete();
                            FileWriter f = new FileWriter(user+"facebockdata.txt");;
                            for(int i=0;i<line3;i++)
                            {
                                f.write(lis3[i]+"\n");
                            }
                            f.close();

                            odata.delete();
                            FileWriter o = new FileWriter(user+"otherdata.txt");;
                            for(int i=0;i<line4;i++)
                            {
                                o.write(lis4[i]+"\n");
                            }
                            o.close();

                               L2.setText(user);
                            l=user.length();
                            len=60-((l/2)*10);
                            L2.setBounds(len,210,150,50);
                            L2.setForeground(Color.white);
                            L2.setFont(new Font("atilic",Font.BOLD,20));
                            T2u.setText("");
                     }
                }

                if(e.getSource()==B2u) 
                     {
                          T2u.setText("");
                     }
                    //password
                    if(e.getSource()==B10)
                    {
                        //F_Change_pass p = new F_Change_pass(user,password);
                        us = false;
                        pa = true;
                        av = false;
                        changeuser(false);
                        changepass(true);
                        changeav(false);
                        Pass1p.setVisible(true);
                        Pass2p.setVisible(true);
                        Pass3p.setVisible(true);
                        T1p.setVisible(true);
                        T2p.setVisible(true);
                        T3p.setVisible(true);
                        L1a.setVisible(false);
                        L2a.setVisible(false);
                        L3a.setVisible(false);
                        L4a.setVisible(false);
                        L5a.setVisible(false);
                        L6a.setVisible(false);
                        L7a.setVisible(false);
                        L8a.setVisible(false);
                        L9a.setVisible(false);
                        L10a.setVisible(false);
                        L11a.setVisible(false);
                        L12a.setVisible(false);
                        L13a.setVisible(false);
                        L14a.setVisible(false);
                        L15a.setVisible(false);
                        L16a.setVisible(false);
                    }
                    if(e.getSource()==B1p)
                    {
                

                    String LL1=T1p.getText().toString();
                    String LL2=T2p.getText().toString();
                    String LL3=T3p.getText().toString();
                    char[] PP1 = Pass1p.getPassword();
                    char[] PP2 = Pass2p.getPassword();
                    char[] PP3 = Pass3p.getPassword();
                    String TT2 = "";
                    for(int i=0;i<PP2.length;i++)
                    {
                        TT2 = TT2+""+PP2[i]; 
                    }
                   
                    System.out.print(LL1);
                    boolean ch=chek;
                    if(ch==true)
                    {
                        if(LL1.equals(password) )
                        {
                            if(LL2.equals(LL3))
                            {   
                                if(LL2.length()==0)
                                {
                                    JOptionPane.showMessageDialog(null,"new password impti\ncreat again");
                                }
                                else if(LL2.length()<8 )
                                {
                                    JOptionPane.showMessageDialog(null,"the new password must contain at least 8 characters \ncreat again");
                                }
                                else
                                {

                                    try 
                                    {

                                        Base64.Encoder encod = Base64.getEncoder();
                                        //coder pass
                                        String pas = encod.encodeToString(LL2.getBytes());
                                        photo[1]=pas;
                                        admin.delete();
                                        FileWriter in = new FileWriter(user+".txt",true);
                                        for(int i=0;i<7;i++)
                                        {
                                            in.write(photo[i]+"\n");
                                        }
                                        in.close(); 
                                        JOptionPane.showMessageDialog(null,"change succesfully");
                                        T1p.setText("");
                                        T2p.setText("");
                                        T3p.setText("");
                                    } 
                                    catch (Exception ex) 
                                    {
                                        JOptionPane.showMessageDialog(null,"Error");
                                    }



                                }
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null,"password incompatible\ncreat again");
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"old password incorrect");
                        }

                    }
                    if(ch==false)
                    {
                        if(LL1.equals(password) )
                        {   
                            if(PP2.equals(PP3))
                            {   

                                if(PP2.length==0)
                                {
                                    JOptionPane.showMessageDialog(null,"new password impti\ncreat again");
                                }
                                else if(PP2.length<8)
                                {
                                    JOptionPane.showMessageDialog(null,"the new password must contain at least 8 characters \ncreat again");
                                }
                                else
                                {
                                    File fis=new File(user+".txt");
                                    fis.delete();
                                    try 
                                    {
                                        Base64.Encoder encod = Base64.getEncoder();
                                        //coder pass
                                        String pas = encod.encodeToString(TT2.getBytes());
                                        photo[1]=pas;
                                        admin.delete();
                                        FileWriter in = new FileWriter(user+".txt",true);
                                        for(int i=0;i<7;i++)
                                        {
                                            in.write(photo[i]+"\n");
                                        }
                                        in.close();
                                        T1p.setText("");
                                        T2p.setText("");
                                        T3p.setText("");
                                        JOptionPane.showMessageDialog(null,"change succesfully");

                                    } 
                                    catch (Exception ex) 
                                    {
                                        JOptionPane.showMessageDialog(null,"Error");
                                    }


                                }
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"old password incorrect");
                        }

                    }
                 
                
            }
            //cancel
            if(e.getSource()==B2p)
            {
                T1p.setText("");
                T2p.setText("");
                T3p.setText("");
      
            }
            //forgett password
            if(e.getSource()==B3p)
            {
                C_Help_fram h = new C_Help_fram();
            }
                    //avatar
                    if(e.getSource()==B11)
                    {
                        //Data_pic j = new Data_pic(user,password,lis2);
                        us = false;
                        pa = false;
                        av = true;
                        changeuser(false);
                        changepass(false);
                        changeav(true);
                        Pass1p.setVisible(false);
                        Pass2p.setVisible(false);
                        Pass3p.setVisible(false);
                        T1p.setVisible(false);
                        T2p.setVisible(false);
                        T3p.setVisible(false);
                        
                        L1a.setVisible(true);
                        L2a.setVisible(true);
                        L3a.setVisible(true);
                        L4a.setVisible(true);
                        L5a.setVisible(true);
                        L6a.setVisible(true);
                        L7a.setVisible(true);
                        L8a.setVisible(true);
                        L9a.setVisible(true);
                        L10a.setVisible(true);
                        L11a.setVisible(true);
                        L12a.setVisible(true);
                        L13a.setVisible(true);
                        L14a.setVisible(true);
                        L15a.setVisible(true);
                        L16a.setVisible(true);
                    }
                if(e.getSource()==ba)
                {
                    admin.delete();
                    photo[6]=avv;
                    FileWriter in = new FileWriter(user+".txt",true);
                    for(int i=0;i<7;i++)
                    {
                        in.write(photo[i]+"\n");
                    }
                    in.close();
                    L5.setVisible(false);
                    photo();
                    
                }
                if(e.getSource()==a1a)
                {
                    avv="image\\creat new\\avatar\\avatars\\1.png";                   
                }
                if(e.getSource()==a2a)
                {
                    avv="image\\creat new\\avatar\\avatars\\2.png";   
                }
                if(e.getSource()==a3a)
                {
                    avv="image\\creat new\\avatar\\avatars\\3.png";   
                }
                if(e.getSource()==a4a)
                {
                    avv="image\\creat new\\avatar\\avatars\\4.png";   
                }
                if(e.getSource()==a5a)
                {
                   avv="image\\creat new\\avatar\\avatars\\5.png";   
                }
                if(e.getSource()==a6a)
                {
                    avv="image\\creat new\\avatar\\avatars\\6.png";   
                }
                if(e.getSource()==a7a)
                {
                    avv="image\\creat new\\avatar\\avatars\\7.png";   
                }
                if(e.getSource()==a8a)
                {
                    avv="image\\creat new\\avatar\\avatars\\8.png";   
                }
                if(e.getSource()==a9a)
                {
                    avv="image\\creat new\\avatar\\avatars\\9.png";   
                }
                if(e.getSource()==a10a)
                {
                    avv="image\\creat new\\avatar\\avatars\\10.png";   
                }
                if(e.getSource()==a11a)
                {
                    avv="image\\creat new\\avatar\\avatars\\11.png";   
                }
                if(e.getSource()==a12a)
                {
                    avv="image\\creat new\\avatar\\avatars\\12.png";   
                }
                if(e.getSource()==a13a)
                {
                    avv="image\\creat new\\avatar\\avatars\\13.png";   
                }
                if(e.getSource()==a14a)
                {
                    avv="image\\creat new\\avatar\\avatars\\14.png";   
                }
                if(e.getSource()==a15a)
                {
                    avv="image\\creat new\\avatar\\avatars\\15.png";   
                }
                if(e.getSource()==a16a)
                {
                    avv="image\\creat new\\avatar\\avatars\\16.png";   
                }
                    //
                    //add
                    if(e.getSource()==aB1) 
                    {
                        String s1,s2,s3,s4,s5,s6=(format("%tc",currentTimeMillis()));
                        s1=aT1.getText().toString();
                        s2=aT2.getText().toString();
                        s3=aT3.getText().toString();
                        s4=aT4.getText().toString();
                        s5=aT5.getText().toString();
                        if(s1.length()==0)
                        {
                            s1="null";
                        }
                        if(s2.length()==0)
                        {
                            s2="null";
                        }
                        if(s3.length()==0)
                        {
                            s3="null";
                        }
                        if(s4.length()==0)
                        {
                            s4="null";
                        }
                        if(s5.length()==0)
                        {
                            s5="null";
                        }
                        if(select==1)
                        {
                            FileWriter in = new FileWriter(user+"G-maildata.txt",true);
                            in.write(s1+"\n"+s2+"\n"+s3+"\n"+s4+"\n"+s5+"\n"+s6+"\n");
                            in.close();
                            table3.setVisible(false);
                            table5.setVisible(false);
                            table2.setVisible(false);
                            table1.setVisible(false);
                            table6.setVisible(false);
                            table4.setVisible(false);
                            google(true,true,160,1105);
                            dis1(false,false);
                            dis2(false,false);
                            dis3(false,false);
                            
                        }
                        else if(select==2)
                        {
                            FileWriter of = new FileWriter(user+"facebockdata.txt",true);
                            of.write(s1+"\n"+s2+"\n"+s3+"\n"+s4+"\n"+s5+"\n"+s6+"\n");
                            of.close();
                            table3.setVisible(false);
                            table5.setVisible(false);
                            table2.setVisible(false);
                            table1.setVisible(false);
                            table6.setVisible(false);
                            table4.setVisible(false);
                            facebock(true,true,160,1105);
                            dis1(false,false);
                            dis2(false,false);
                            dis3(false,false);
                            
                        }
                        else if(select==3)
                        {
                            FileWriter on = new FileWriter(user+"otherdata.txt",true);
                            on.write(s1+"\n"+s2+"\n"+s3+"\n"+s4+"\n"+s5+"\n"+s6+"\n");
                            on.close();
                            table3.setVisible(false);
                            table5.setVisible(false);
                            table2.setVisible(false);
                            table1.setVisible(false);
                            table6.setVisible(false);
                            table4.setVisible(false);
                            other(true,true,160,1105);
                            dis1(false,false);
                            dis2(false,false);
                            dis3(false,false);
                            
                        }
                        Pass1p.setVisible(false);
                        Pass2p.setVisible(false);
                        Pass3p.setVisible(false);
                        T1p.setVisible(false);
                        T2p.setVisible(false);
                        T3p.setVisible(false);
                        
                    }
                    //reset
                    if(e.getSource()==aB2) 
                    {
                    
                        if(select==1)
                        {
                            aT1.setText(table2.getValueAt(row2,0).toString());
                            aT2.setText(table2.getValueAt(row2,1).toString());
                            aT3.setText(table2.getValueAt(row2,2).toString());
                            aT4.setText(table2.getValueAt(row2,3).toString());
                            aT5.setText(table2.getValueAt(row2,4).toString());
                           
                        }
                        else if(select==2)
                        {
                            aT1.setText(table3.getValueAt(row3,0).toString());
                            aT2.setText(table3.getValueAt(row3,1).toString());
                            aT3.setText(table3.getValueAt(row3,2).toString());
                            aT4.setText(table3.getValueAt(row3,3).toString());
                            aT5.setText(table3.getValueAt(row3,4).toString());
                            
                        }
                        else if(select==3)
                        {
                            aT1.setText(table4.getValueAt(row4,0).toString());
                            aT2.setText(table4.getValueAt(row4,1).toString());
                            aT3.setText(table4.getValueAt(row4,2).toString());
                            aT4.setText(table4.getValueAt(row4,3).toString());
                            aT5.setText(table4.getValueAt(row4,4).toString());
                            
                        }
                    }
                    //save        
                    if(e.getSource()==aB3) 
                    {
                        if(select==1)
                        {
                            gdata.delete();
                            FileWriter in = new FileWriter(user+"G-maildata.txt",true);
                            int l=(row2+1)*6;
                            String s0,s1,s2,s3,s4,s5= (format("%tc",currentTimeMillis()));
                            s0=aT1.getText();
                            s1=aT2.getText();
                            s2=aT3.getText();
                            s3=aT4.getText();
                            s4=aT5.getText();
                                lis2[l]=s0;
                                lis2[l+1]=s1;
                                lis2[l+2]=s2;
                                lis2[l+3]=s3;
                                lis2[l+4]=s4;
                                lis2[l+5]=s5;
                            for(int i=0;i<line2;i++)
                            {
                                in.write(lis2[i]+"\n");
                            }
                            in.close();
                            table2.setValueAt(s0,row2,0);
                            table2.setValueAt(s1,row2,1);
                            table2.setValueAt(s2,row2,2);
                            table2.setValueAt(s3,row2,3);
                            table2.setValueAt(s4,row2,4);
                            table2.setValueAt(s5,row2,5);
                        }
                        else if(select==2)
                        {
                            fdata.delete();
                            FileWriter in = new FileWriter(user+"facebockdata.txt",true);
                            int l=(row3+1)*6;
                            String s0,s1,s2,s3,s4,s5= (format("%tc",currentTimeMillis()));
                            s0=aT1.getText();
                            s1=aT2.getText();
                            s2=aT3.getText();
                            s3=aT4.getText();
                            s4=aT5.getText();
                                lis3[l]=s0;
                                lis3[l+1]=s1;
                                lis3[l+2]=s2;
                                lis3[l+3]=s3;
                                lis3[l+4]=s4;
                                lis3[l+5]=s5;
                            for(int i=0;i<line3;i++)
                            {
                                in.write(lis3[i]+"\n");
                            }
                            in.close();
                            table3.setValueAt(s0,row3,0);
                            table3.setValueAt(s1,row3,1);
                            table3.setValueAt(s2,row3,2);
                            table3.setValueAt(s3,row3,3);
                            table3.setValueAt(s4,row3,4);
                            table3.setValueAt(s5,row3,5);
                        }
                        else if(select==3)
                        {
                            odata.delete();
                            FileWriter in = new FileWriter(user+"otherdata.txt",true);
                            int l=(row4)*6;
                            String s0,s1,s2,s3,s4,s5= (format("%tc",currentTimeMillis()));
                            s0=aT1.getText();
                            s1=aT2.getText();
                            s2=aT3.getText();
                            s3=aT4.getText();
                            s4=aT5.getText();
                                lis4[l]=s0;
                                lis4[l+1]=s1;
                                lis4[l+2]=s2;
                                lis4[l+3]=s3;
                                lis4[l+4]=s4;
                                lis4[l+5]=s5;
                            for(int i=0;i<line4;i++)
                            {
                                in.write(lis4[i]+"\n");
                            }
                            in.close();
                            table4.setValueAt(s0,row4,0);
                            table4.setValueAt(s1,row4,1);
                            table4.setValueAt(s2,row4,2);
                            table4.setValueAt(s3,row4,3);
                            table4.setValueAt(s4,row4,4);
                            table4.setValueAt(s5,row4,5);
                        }
                        Pass1p.setVisible(false);
                        Pass2p.setVisible(false);
                        Pass3p.setVisible(false);
                        T1p.setVisible(false);
                        T2p.setVisible(false);
                        T3p.setVisible(false);
                    }
                    //delet
                    if(e.getSource()==aB4)
                    { 
                        
                        if(select == 1)
                        {
                            int h1=0,h2=0,h3=0,h4=0,h5=0,h6=0,h7=0,h8=0,h9=0,h10=0,h11=0,h12=0,q1=c1*6,q2=c2*6,q3=c3*6,q4=c4*6,q5=c5*6,q9=c9*6,q6=c6*6,q7=c7*6,q8=c8*6,q10=c10*6,q11=c11*6,q12=c12*6;
                            gdata.delete();
                            FileWriter in = new FileWriter(user+"G-maildata.txt",true);
                            for(int i=0;i<=5;i++)
                            {
                                in.write(lis2[i]+"\n");
                            }
                           
                            for(int i=6;i<line2;i++)
                            {
                                if(i==q1)
                                {
                                    h1=6;
                                    i+=6;
                                }
                                if(i==q2)
                                {
                                    h2=6;
                                    i+=6;
                                }
                                if(i==q3)
                                {
                                    h3=6;
                                    i+=6;
                                }
                                if(i==q4)
                                {
                                    h4=6;
                                    i+=6;
                                }
                                if(i==q5)
                                {
                                    h5=6;
                                    i+=6;
                                }
                                if(i==q6)
                                {
                                    h6=6;
                                    i+=6;
                                }
                                if(i==q7)
                                {
                                    h7=6;
                                    i+=6;
                                }
                                if(i==q8)
                                {
                                    h8=6;
                                    i+=6;
                                }
                                if(i==q9)
                                {
                                    h9=6;
                                    i+=6;
                                }
                                if(i==q10)
                                {
                                    h10=6;
                                    i+=6;
                                }
                                if(i==q11)
                                {
                                    h11=6;
                                    i+=6;
                                }
                                if(i==q12)
                                {
                                    h12=6;
                                    i+=6;
                                }
                                
                                if(i!=line2)
                                {
                                    in.write(lis2[i]+"\n");
                                }
                                else
                                {
                                    in.close();
                                }
                                

                            }
                            in.close();
                            table2.setVisible(false);
                            table1.setVisible(false);
                            google(true,true,200,1065);
                            Pass1p.setVisible(false);
                            Pass2p.setVisible(false);
                            Pass3p.setVisible(false);
                            T1p.setVisible(false);
                            T2p.setVisible(false);
                            T3p.setVisible(false);
                            dis1(true,true);
                            dis2(false,false);
                            dis3(false,false);
                    C1.setSelected(false);
                    C2.setSelected(false);
                    C3.setSelected(false);
                    C4.setSelected(false);
                    C5.setSelected(false);
                    C6.setSelected(false);
                    C7.setSelected(false);
                    C8.setSelected(false);
                    C9.setSelected(false);
                    C10.setSelected(false);
                    C11.setSelected(false);
                    C12.setSelected(false);
                    abL1.setVisible(false);
                    abL2.setVisible(false);
                    abL3.setVisible(false);
                    abL4.setVisible(false);
                    abL5.setVisible(false);
                    abL6.setVisible(false);
                    abL7.setVisible(false);
                    abL8.setVisible(false);
                    abL9.setVisible(false);
                    abL10.setVisible(false);
                    abL11.setVisible(false);
                    abL12.setVisible(false);
                    bbL1.setVisible(false);
                    bbL2.setVisible(false);
                    bbL3.setVisible(false);
                    bbL4.setVisible(false);
                    bbL5.setVisible(false);
                    bbL6.setVisible(false);
                    bbL7.setVisible(false);
                    bbL8.setVisible(false);
                    bbL9.setVisible(false);
                    bbL10.setVisible(false);
                    bbL11.setVisible(false);
                    bbL12.setVisible(false);
                    cbL1.setVisible(false);
                    cbL2.setVisible(false);
                    cbL3.setVisible(false);
                    cbL4.setVisible(false);
                    cbL5.setVisible(false);
                    cbL6.setVisible(false);
                    cbL7.setVisible(false);
                    cbL8.setVisible(false);
                    cbL9.setVisible(false);
                    cbL10.setVisible(false);
                    cbL11.setVisible(false);
                    cbL12.setVisible(false);
                        }
                        else if(select == 2)
                        {
                            int h1=0,h2=0,h3=0,h4=0,h5=0,h6=0,h7=0,h8=0,h9=0,h10=0,h11=0,h12=0,q1=c01*6,q2=c20*6,q3=c30*6,q4=c40*6,q5=c50*6,q9=c90*6,q6=c60*6,q7=c70*6,q8=c80*6,q10=c100*6,q11=c110*6,q12=c120*6;
                            fdata.delete();
                            FileWriter o = new FileWriter(user+"facebockdata.txt",true);
                            for(int i=0;i<=5;i++)
                            {
                                o.write(lis3[i]+"\n");
                            }
                            
                            for(int i=6;i<line3;i++)
                            {
                                if(i==q1)
                                {
                                    h1=6;
                                    i+=6;
                                }
                                if(i==q2)
                                {
                                    h2=6;
                                    i+=6;
                                }
                                if(i==q3)
                                {
                                    h3=6;
                                    i+=6;
                                }
                                if(i==q4)
                                {
                                    h4=6;
                                    i+=6;
                                }
                                if(i==q5)
                                {
                                    h5=6;
                                    i+=6;
                                }
                                if(i==q6)
                                {
                                    h6=6;
                                    i+=6;
                                }
                                if(i==q7)
                                {
                                    h7=6;
                                    i+=6;
                                }
                                if(i==q8)
                                {
                                    h8=6;
                                    i+=6;
                                }
                                if(i==q9)
                                {
                                    h9=6;
                                    i+=6;
                                }
                                if(i==q10)
                                {
                                    h10=6;
                                    i+=6;
                                }
                                if(i==q11)
                                {
                                    h11=6;
                                    i+=6;
                                }
                                if(i==q12)
                                {
                                    h12=6;
                                    i+=6;
                                }
                                
                                if(i!=line3)
                                {
                                    o.write(lis3[i]+"\n");
                                }
                                else
                                {
                                    o.close();
                                }
                                

                            }
                            o.close();
                            table3.setVisible(false);
                            table5.setVisible(false);
                            facebock(true,true,200,1065);
                            Pass1p.setVisible(false);
                            Pass2p.setVisible(false);
                            Pass3p.setVisible(false);
                            T1p.setVisible(false);
                            T2p.setVisible(false);
                            T3p.setVisible(false);
                    dis1(false,false);
                    dis2(true,true);
                    dis3(false,false);
                    
                    abL1.setVisible(false);
                    abL2.setVisible(false);
                    abL3.setVisible(false);
                    abL4.setVisible(false);
                    abL5.setVisible(false);
                    abL6.setVisible(false);
                    abL7.setVisible(false);
                    abL8.setVisible(false);
                    abL9.setVisible(false);
                    abL10.setVisible(false);
                    abL11.setVisible(false);
                    abL12.setVisible(false);
                    bbL1.setVisible(false);
                    bbL2.setVisible(false);
                    bbL3.setVisible(false);
                    bbL4.setVisible(false);
                    bbL5.setVisible(false);
                    bbL6.setVisible(false);
                    bbL7.setVisible(false);
                    bbL8.setVisible(false);
                    bbL9.setVisible(false);
                    bbL10.setVisible(false);
                    bbL11.setVisible(false);
                    bbL12.setVisible(false);
                    cbL1.setVisible(false);
                    cbL2.setVisible(false);
                    cbL3.setVisible(false);
                    cbL4.setVisible(false);
                    cbL5.setVisible(false);
                    cbL6.setVisible(false);
                    cbL7.setVisible(false);
                    cbL8.setVisible(false);
                    cbL9.setVisible(false);
                    cbL10.setVisible(false);
                    cbL11.setVisible(false);
                    cbL12.setVisible(false);
                            
                        }
                        else if(select == 3)
                        {
                            int h100=0,h200=0,h300=0,h400=0,h500=0,h600=0,h700=0,h800=0,h900=0,h1000=0,h1100=0,h1200=0;
                            int q0=c001*6,q6=c200*6,q12=c300*6,q18=c400*6,q24=c500*6,q30=c900*6,q36=c600*6,q42=c700*6,q48=c800*6,q54=c1000*6,q60=c1100*6,q66=c1200*6;
                            odata.delete();
                            
                            FileWriter n = new FileWriter(user+"otherdata.txt",true);
                            System.out.println(line4);
                            if(line4==6)
                            {
                                n.close();
                            }
                            else
                            {
                            if(q0==0)
                            {
                                for(int i=0;i<=5;i++)
                                {
                                    n.write(lis4[i]+"\n");
                                }
                            }    
                           
                            for(int i=6;i<line4;i++)
                            {
                                if(i==q6)
                                {
                                    h200=6;
                                    i+=6;
                                }
                                if(i==q12)
                                {
                                    h300=6;
                                    i+=6;
                                }
                                if(i==q18)
                                {
                                    h400=6;
                                    i+=6;
                                }
                                if(i==q24)
                                {
                                    h500=6;
                                    i+=6;
                                }
                                if(i==q30)
                                {
                                    h600=6;
                                    i+=6;
                                }
                                if(i==q36)
                                {
                                    h700=6;
                                    i+=6;
                                }
                                if(i==q42)
                                {
                                    h800=6;
                                    i+=6;
                                }
                                if(i==q48)
                                {
                                    h900=6;
                                    i+=6;
                                }
                                if(i==q54)
                                {
                                    h1000=6;
                                    i+=6;
                                }
                                if(i==q60)
                                {
                                    h1100=6;
                                    i+=6;
                                }
                                if(i==q66)
                                {
                                    h1200=6;
                                    i+=6;
                                }
                                
                                if(i!=line4)
                                {
                                    n.write(lis4[i]+"\n");
                                }
                                else
                                {
                                    n.close();
                                }
                                

                            }
                            n.close();
                            table4.setVisible(false);
                            table6.setVisible(false);
                            other(true,true,200,1065);
                            
                                dis1(false,false);
                                dis2(false,false);
                                dis3(true,true);
                   
                                
                    abL1.setVisible(false);
                    abL2.setVisible(false);
                    abL3.setVisible(false);
                    abL4.setVisible(false);
                    abL5.setVisible(false);
                    abL6.setVisible(false);
                    abL7.setVisible(false);
                    abL8.setVisible(false);
                    abL9.setVisible(false);
                    abL10.setVisible(false);
                    abL11.setVisible(false);
                    abL12.setVisible(false);
                    bbL1.setVisible(false);
                    bbL2.setVisible(false);
                    bbL3.setVisible(false);
                    bbL4.setVisible(false);
                    bbL5.setVisible(false);
                    bbL6.setVisible(false);
                    bbL7.setVisible(false);
                    bbL8.setVisible(false);
                    bbL9.setVisible(false);
                    bbL10.setVisible(false);
                    bbL11.setVisible(false);
                    bbL12.setVisible(false);
                    cbL1.setVisible(false);
                    cbL2.setVisible(false);
                    cbL3.setVisible(false);
                    cbL4.setVisible(false);
                    cbL5.setVisible(false);
                    cbL6.setVisible(false);
                    cbL7.setVisible(false);
                    cbL8.setVisible(false);
                    cbL9.setVisible(false);
                    cbL10.setVisible(false);
                    cbL11.setVisible(false);
                    cbL12.setVisible(false);
                            }
                        
                        
                    }
                            Pass1p.setVisible(false);
                            Pass2p.setVisible(false);
                            Pass3p.setVisible(false);
                            T1p.setVisible(false);
                            T2p.setVisible(false);
                            T3p.setVisible(false);
                        JOptionPane.showMessageDialog(null,"delet succesfully");
                        
                }
        }

         
        catch (Exception ex) 
        {
            Logger.getLogger(Data_panel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
                    
        }
        
    }
   
}
