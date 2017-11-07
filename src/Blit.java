/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
/**
 *
 * @author Kevin Simon (aka: Snerfoil), Miguel
 */
/**the cool thing is that this makes the gui handle the onscreen names as I want it to
 * but for some reason it keeps snapping the view to the top left corner
 * this is probably because it looks over to the next update.
 */ 
public class Blit extends JLabel{
    private int maxUnitIncrement = 1;
    private int x0=0,y0=0;
    private int x1=0,y1=0;
    private int x2=0,y2=0;
    private String z0="";
    private String z1="";
    private String z2="";
    private Graphics2D g2;
    
    public Blit(String a,String b,String c,String d){
	this.setIcon(new javax.swing.ImageIcon(getClass().getResource(d)));
	z0=a;z1=b;z2=c;
    }
    
    public void paintComponent(Graphics g){
	super.paintComponent(g);
	g2 = (Graphics2D) g;
	g2.setFont(new Font("Serif", Font.BOLD, 24));
	g2.setColor(Color.red);
	g2.drawString(z0,x0,y0);
	g2.drawString(z1,x1,y1);
	g2.drawString(z2,x2,y2);
    }
    public void move0(int a,int b){x0=a;y0=b;repaint();}
    public void move1(int a,int b){x1=a;y1=b;repaint();}
    public void move2(int a,int b){x2=a;y2=b;repaint();}

}
