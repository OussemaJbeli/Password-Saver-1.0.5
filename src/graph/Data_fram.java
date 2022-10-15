
package graph;

import java.awt.Toolkit;
import java.io.FileNotFoundException;
import javax.swing.JFrame;


public class Data_fram extends JFrame
{
    String user,password;
    public Data_fram(String u,String p) throws FileNotFoundException
    {
        setIconImage();
        this.user=u;
        this.password=p;
        Data_panel Dp = new Data_panel(user,password);
        Dp.bb();
        //about fram
        setSize(1555, 875);
        setLocation(-10,-5);
        setTitle("Password_Recorder ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);    
        
        this.add(Dp);
         
        
    }  

    private void setIconImage() 
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("PasswordRecorder_logo.png")));
    }
    
        

}
