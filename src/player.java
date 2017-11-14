/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class player {
  String name;
  int Craft;
  int Learning;
  int Integrity;
  int QualityPoints = 0;
  boolean humanPlayer = false;
  int xCoordinate;
  int yCoordinate;
  int roomNumber;
  
  public player(int learning, int craft, int integrity, String name){
    this.Craft = craft;
    this.Learning = learning;
    this.Integrity = integrity;
    this.name = name;
    this.roomNumber = 17;
 
  }
  public void playerMove(){
      this.xCoordinate += 75;
      this.yCoordinate += 25;
  }
  public float playerX(){
      return xCoordinate;
  }
  public float playerY(){
      return yCoordinate;
  }
  
  public String currentStats()
  {
    return this.name + "    " + this.Learning + "         " + this.Craft + "      " + this.Integrity + "          " + this.QualityPoints + "\n";
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public int getRoom()
  {
    return this.roomNumber;
  }
  
  public void setHuman(){
      this.humanPlayer = true;
  }
  
  public void setRoom(int room)
  {
    
    this.roomNumber = room;
  }
  
  public int getLearning()
  {
    return this.Learning;
  }
  
  
  public int getIntegrity()
  {
    return this.Integrity;
  }

  public int getCraft()
  {
    return this.Craft;
  }

  public int getQualityPoints()
  {
    return this.QualityPoints;
  }
  
  public void incrementLearning(){
      this.Learning += 1;
  }
  
  public void incrementCraft(){
      this.Craft += 1;
  }
  
  public void incrementIntegrity(){
      this.Integrity += 1;
  }

}
