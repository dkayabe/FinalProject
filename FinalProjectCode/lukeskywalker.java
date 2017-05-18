import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.geom.AffineTransform;
public class lukeskywalker extends JComponent
{
  private BufferedImage image;
  private BufferedImage lightsaber;
  private int x;
  private int y;
  private int origX;
  private int origY;
  private int saber_x;
  private int saber_y;
  int start=0;
  int trigger=0;
  int action1=0;
  public lukeskywalker(int posx, int posy){
      x = posx;
      y = posy;
          
      origX = posx;
      origY = posy;
      try{
          image = ImageIO.read(new File("Images\\Lukeskywalker_cartoon.png"));
          lightsaber = ImageIO.read(new File("Images\\lightsaber.png"));
        } catch(IOException e){
            System.out.println(e);
        }
    
  }
  
  public void moveToEnemy(int enemyX,int enemyY){
      if (x > (enemyX-10)){
          x-=7;
          repaint();
      }
      if (y > enemyY){
          y-=7;
          repaint();
      }
    
    }
  
  public void moveToEnemy(int enemyY){
      
      if (y >= enemyY+25){
          y-= 5;
          repaint();
      }
    }
    
  public void updateLoc(){
      saber_x = x;
      saber_y = y;
  }
  
  public void saber(){
      if (trigger == 0){
      this.updateLoc();
      this.trigger++;
    }
      this.start=1;
      if (saber_x >= -500){
          saber_x -= 7;
          repaint();
      }
    
  }
  public void moveBack(){
      if (x <= origX) {
          x+=4;
          repaint();
      }
      if (x >= origX) {
          x-=4;
          repaint();
      }
      if (y >= origY){
          y-=4;
          repaint();
      }
      if (y <= origY){
          y+=4;
          repaint();
      }
      
  }
  
  public void lightsaber_throw(int enemyY){
      if(action1 ==0){
          this.moveToEnemy(enemyY);
          if (y == enemyY+25){
              action1 = 1;
              System.out.println("act=1");
          }
      }
      else if(action1 ==1){
        this.saber();
        if(saber_x<=-300){
            action1 = 2;
        }
      }
      else if(action1 ==2){
          this.moveBack();
      }
        
  }
  public void paintComponent(Graphics g){
      super.paintComponent(g);
      g.drawImage(image,x,y,this);
      if (start==1){
      g.drawImage(lightsaber,saber_x,saber_y,this);
    }
    }
}
