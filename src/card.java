/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcastro
 */
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;

public abstract class card
{
  String name;
  String reward;
  String locationName;
  String fail;
  ArrayList<Integer> locations = new ArrayList();
  boolean activeCard;
  Icon img;
  int abilityLearning;
  int abilityCraft;
  int abilityIntegrity;
  
  public card()
  {
    this.name = (this.reward = this.locationName = this.fail = "");
    
    this.img = null;
    this.abilityLearning = (this.abilityCraft = this.abilityIntegrity = 0);
  }
  
  public abstract boolean play(player p);
  
  public void printName()
  {
    System.out.println("  Card:" + this.name);
  }
  
  public void printLocation()
  {
    System.out.println("  Location:" + this.locationName);
  }
  
  public void printReward()
  {
    System.out.println("  Reward:" + this.reward);
  }
  
  public void setImage(String i)
  {
      this.img = new javax.swing.ImageIcon(getClass().getResource(i));
  }
  
  public Icon getImage()
  {
    return this.img;
  }
  
  public boolean getActive()
  {
    return this.activeCard;
  }
  
  public void setActive(boolean active)
  {
    this.activeCard = active;
  }
  
  public void Describe()
  {
    System.out.println("***** Player cards *****");
    printName();
    printLocation();
    printReward();
  }
}

