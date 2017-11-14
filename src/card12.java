/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card12 extends card
{
  public card12()
  {
    this.name = "Late for Class";
    this.locationName = "Any space except Forbidden Parking";
    this.reward = "1 Craft Chip and Teleport to Lactation Lounge";
    setImage("/images/cardm12.png");
  }
  
  public boolean play(player p)
  {
    printName();
    
    int room = p.roomNumber;
    if (((room >= 0) && (room <= 5)) || ((room >= 7) && (room <= 10)))
    {
      p.incrementCraft();
      p.setRoom(20);
      return true;
    }
    return false;
  }
}
