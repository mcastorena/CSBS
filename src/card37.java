/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card37 extends card
{
  public card37()
  {
    this.name = "Enjoying Nature";
    this.locationName = "Any space outside ECS";
    this.reward = "1 Craft Chip and Teleport to Lactation Lounge";
    setImage("images/cardm37.png");
  }
  
  public boolean play(player p)
  {
    if ((p.roomNumber >= 0) && (p.roomNumber <= 10))
    {
      p.incrementCraft();
      p.setRoom(20);
      return true;
    }
    return false;
  }
}