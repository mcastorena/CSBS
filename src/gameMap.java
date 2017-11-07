
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
    player player1 = new player(1,1,1,"MIGUEL", 500, 1200);
    player player2 = new player(1,1,1,"kev", 500, 1250);
    player player3 = new player(1,1,1,"ivan", 500, 1300);
    }
    
    player player1 = new player(1,1,1,"MIGUEL", 500, 1200);
    player player2 = new player(1,1,1,"kev", 500, 1250);
    player player3 = new player(1,1,1,"ivan", 500, 1300);
    
    public void movePlayers(){
        player1.playerMove();
        player2.playerMove();
        player3.playerMove();
    }
    public void handleMove(){
        movePlayers();
        paintComponent(this.getGraphics());
    }

    
    public void paintComponent(Graphics g)
  {    super.paintComponent(g);

    Graphics2D g2d = (Graphics2D)g;
    g2d.setColor(Color.RED);
    g2d.setFont(new Font("Monospaced", 1, 40));
    System.out.println(player2.playerY());
    g2d.drawString(player1.getName(), player1.playerX(), player1.playerY());
    g2d.drawString(player2.getName(), player2.playerX(), player2.playerY());
    g2d.drawString(player3.getName(), player3.playerX(), player3.playerY());
    
    
  }
    
}
