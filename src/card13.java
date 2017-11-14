/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card13 extends card
{
  public card13()
  {
    this.name = "The Big Game";
    this.locationName = "Pyramid";
    this.reward = "1 Craft Chip and Teleport to the Lactation Lounge";
    setImage("/images/cardm13.png");
  }
  
  public boolean play(player p)
  {
    printName();
    
    if (p.roomNumber == 3)
    {
      p.incrementCraft();
      p.setRoom(20);
      return true;
    }
    return false;
  }
}