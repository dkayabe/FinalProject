import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
public class lukeskywalker extends JComponent
{
  private BufferedImage image;
  private int x;
  private int y;
  private int origX;
  private int origY;
  public lukeskywalker(int posx, int posy){
      x = posx;
      y = posy;
      origX = posx;
      origY = posy;
      try{
          image = ImageIO.read(new File("Images\\Lukeskywalker_cartoon.png"));
        } catch(IOException e){
            System.out.println(e);
        }
    
  }
  
  public void moveToEnemy(int enemyX,int enemyY){
      if (x < (enemyX+10)){
          x+=7;
          repaint();
      }
      if (y < enemyY){
          y+=7;
          repaint();
      }
    
    }
  
  public void moveBack(){
      if (x >= origX) {
          x-=2;
          repaint();
      }
      if (y >= origY){
          y-=2;
          repaint();
      }
      
  }
  public void paintComponent(Graphics g){
      super.paintComponent(g);
      g.drawImage(image,x,y,this);
    }
}
