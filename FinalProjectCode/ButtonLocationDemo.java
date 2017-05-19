import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ButtonLocationDemo extends JFrame implements ActionListener{

 private JButton b1;
 private JButton b2;
 private JButton b3;
 private TextField text = new TextField(20);
 int numClicks = 0;
 JPanel p;
 lukeskywalker h1;
 
 public ButtonLocationDemo(){
      p = new JPanel();
      b1 = new JButton("Lightsaber Attack");
      b2 = new JButton("Lightsaber Throw");
      b3 = new JButton("Special");
      h1 = new lukeskywalker(0,0);
      
      p.setLayout(null);
      b1.setBounds(225,200,150,50);
      b2.setBounds(375,200,150,50);
      b3.setBounds(525,200,150,50);
      h1.setBounds(0,300,500,500);
      p.add(b1);
      p.add(b2);
      p.add(b3);
      p.add(h1);
      text.setBounds(250,900,100,25);
      
      
      //getContentPane().add(text);
      getContentPane().add(p);
      //setLayout(null);
      setDefaultCloseOperation(3);
      setSize(1000,1000);
      setVisible(true);
      
      
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);

     }
     
 public void actionPerformed(ActionEvent e){
    numClicks++;
    text.setText("Button Clicked " + numClicks + " times");
    if (e.getSource() == b1){
        System.out.println(e.getSource());
        p.add(h1);
        p.repaint();
    }
        
    
    if (e.getSource() == b2){
        p.remove(h1);
        p.repaint();
    }
    
    if (e.getSource() == b3){
        p.remove(b1);
        p.repaint();
    }
    
 }
 public static void main(String...args){
       new ButtonLocationDemo();
       }
}


