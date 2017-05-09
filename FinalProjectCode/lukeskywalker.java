import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
public class lukeskywalker extends JComponent
{
  private BufferedImage image;
  private int x =0;
  private int y=0;
  public lukeskywalker(int posx, int posy){
      int x = posx;
      int y = posy;
      
      try{
          image = ImageIO.read(new File("Images\\Lukeskywalker_cartoon.jpg"));
        } catch(IOException e){
            System.out.println(e);
        }
    
  }
  
  public void moveRight(){
      x += 2;
      repaint();
    
    }
  
  public void paintComponent(Graphics g){
      super.paintComponent(g);
      g.drawImage(image,x,y,this);
    }
}
