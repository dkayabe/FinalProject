import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JFrame;
public class Image extends JPanel {

    ImageIcon image = new ImageIcon(this.getClass()
                .getResource("images/InfernoRifleBestie.png"));
    int x = 10;
    int y = 10;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        image.paintIcon(this, g, x, y);
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(1000, 1000);
        frame.setTitle("Inferno Rifle Bestie");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Image img  = new Image();
        frame.add(img);
        frame.setVisible(true);
    }
}