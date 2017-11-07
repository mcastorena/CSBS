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
  int room;
  int Craft;
  int Learning;
  int Integrity;
  int QualityPoints = 0;
  boolean humanPlayer = false;
  //int xCoordinate; // depricated
  //int yCoordinate;
  
  public player(int learning, int craft, int integrity, String name, int room){
    this.Craft = craft;
    this.Learning = learning;
    this.Integrity = integrity;
    this.name = name;
    this.room = room;
    //this.xCoordinate = X; // depriciated
    //this.yCoordinate= Y;
    
    
  }
//  public void playerMove(){ // depriciated
//      this.xCoordinate += 75;
//      this.yCoordinate += 25;
//  }
//  public float playerX(){
//      return xCoordinate;
//  }
//  public float playerY(){
//      return yCoordinate;
//  }
  
  public String currentStats()// this will probs be depriciated
  {
    return this.name + "    " + this.Learning + "         " + this.Craft + "      " + this.Integrity + "          " + this.QualityPoints + "\n";
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public int getRoom()
  {
    return this.room;
  }
  
  public void setHuman(){
      this.humanPlayer = true;
  }
  
  public void setRoom(int room)
  {
    
    this.room = room;
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

}
