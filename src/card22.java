/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card22 extends card
{
  public card22()
  {
    this.name = "Fall in the Pond";
    this.locationName = "Japanese Garden";
    this.reward = "1 Integrity Chip and 1 Craft Chip";
    setImage("/images/cardm22.png");
  }
  
  public boolean play(player p)
  {
    if (p.roomNumber == 1)
    {
      if (p.Learning >= 3)
      {
        p.incrementCraft();
        p.incrementIntegrity();
        return true;
      }
      fail(p);
      return false;
    }
    return false;
  }
  
  private void fail(player p)
  {
    p.setRoom(20);
  }
}