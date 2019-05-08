package javaapplication1;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;  
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.*;  
import java.awt.event.*;  
import javax.accessibility.Accessible;
import javax.swing.JLabel;




public class Test extends Component implements Accessible{
    
  static Image image = Toolkit.getDefaultToolkit().getImage("pud.png");

  static TrayIcon trayIcon = new TrayIcon(image, "Pop Up Dictionary");



   
  
  
  
 public static void main(String[] a) throws Exception {
    if (SystemTray.isSupported()) {
      SystemTray tray = SystemTray.getSystemTray();
      
      
    

      trayIcon.setImageAutoSize(true);
     trayIcon.addActionListener(new ActionListener() {
          private JLabel label1;
        
         
       public void actionPerformed(ActionEvent e) {
          System.out.println("In here");
          trayIcon.displayMessage("Pop Up Dictionary", "Please enter a word", TrayIcon.MessageType.INFO);
         
          JFrame f=new JFrame("Pop Up Dictionary");  
          
    final TextField tf=new TextField();  
    tf.setBounds(100,50, 150,20);  
    Button b1=new Button("Find Definition");    
    b1.setBounds(100,100,200,30); 
    
    
  

 
    Label l1, l2;  
    l1=new Label("Word Definition");  
    l1.setBounds(50,150, 100,30); 
    l2=new Label("Translate:");  
    l2.setBounds(50,200, 60,30);  
    f.add(l1); f.add(l2);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);  

  
    Choice c=new Choice();  
        c.setBounds(120,200, 75,75);  
        c.add("French");  
        c.add("Spanish");  
        c.add("Russian");  
        c.add("Chinese");  
        c.add("Italian");
        c.add("Japanese"); 
        c.add("German"); 
        c.add("Portuguese"); 
        c.add("English"); 
        c.add("Urdu"); 
        c.add("Arabic"); 
        c.add("Dutch"); 
        c.add("Turkish"); 
        c.add("Czech"); 
        c.add("Swedish"); 
        f.add(c);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
     
    Button b2=new Button("Translate");  
    b2.setBounds(200,200,80,30);  
    f.add(b2);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
   
             
           
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
   
     
     f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    f.setBackground(Color.orange);
    
  


 
    
 

    
    
    
    
    b1.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){
      
  
            tf.setText("Find Definition");  
    }  
    }); 
    
    
    b2.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){
      
  
             
    }  
    
    
    
    
    
    }); 
    
     
    f.add(b1);f.add(tf);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);  
    f.setLocationRelativeTo(null);
}  

          

        
   
      
     
          
        

        
      });
    
       try {
        tray.add(trayIcon);
     } catch (AWTException e) {
       System.err.println("TrayIcon could not be added.");
     }
    

  //public abstract void actionPerformed(ActionEvent e);  
      

       
   
    }
 }
}
    
    


