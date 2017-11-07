
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class gameMap extends JLabel{
    public gameMap() {
        this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CSULBMap5_1200x1437.png"))); // NOI18N

    }
    
    model myModel = new model();
    
  
    

    
    public void paintComponent(Graphics g)
  {    super.paintComponent(g);

    Graphics2D g2d = (Graphics2D)g;
    g2d.setColor(Color.RED);
    g2d.setFont(new Font("Monospaced", 1, 40));
    g2d.drawString(myModel.players.get(0).name, myModel.rooms.get((myModel.players.get(0).roomNumber)).xCoordinate, myModel.rooms.get((myModel.players.get(0).roomNumber)).yCoordinate);
    g2d.drawString(myModel.players.get(1).name, myModel.rooms.get((myModel.players.get(1).roomNumber)).xCoordinate, myModel.rooms.get((myModel.players.get(1).roomNumber)).yCoordinate+50);
    g2d.drawString(myModel.players.get(2).name, myModel.rooms.get((myModel.players.get(2).roomNumber)).xCoordinate, myModel.rooms.get((myModel.players.get(2).roomNumber)).yCoordinate+100);
    
    
  }
    
}
