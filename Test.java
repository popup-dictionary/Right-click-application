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




public class Test {
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
    Button b=new Button("Find Definition");    
    b.setBounds(100,100,200,30); 
    
    
  
 
    
    
    
    
    
    
    
    
     
     f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    f.setBackground(Color.orange);
    
  


    
    
    
    
    
    b.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){
            tf.setText("Find Definition");  
    }  
    
    });  
    f.add(b);f.add(tf);  
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
      
 
    
    
    

 
