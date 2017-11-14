/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card5 extends card
{
  public card5()
  {
    this.name = "CECS 100";
    this.locationName = "ECS 308";
    this.reward = "1 Craft Chip";
    setImage("/images/cardm05.png");
  }
  
  public boolean play(player p)
  {
    printName();
    if (p.roomNumber == 17)
    {
      p.incrementCraft();
      return true;
    }
    return false;
  }
}