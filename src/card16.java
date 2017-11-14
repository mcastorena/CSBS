/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card16 extends card
{
  public card16()
  {
    this.name = "KIN 253: Learning the Rules of Soccer";
    this.locationName = "George Allen Field";
    this.reward = "2 Craft Chips";
    setImage("images/cardm16.png");
  }
  
  public boolean play(player p)
  {
    if (p.roomNumber == 0)
    {
      if (p.Integrity >= 4)
      {
        p.incrementCraft();
        p.incrementCraft();
        return true;
      }
      fail(p);
      return false;
    }
    return false;
  }
  
  private void fail(player p)
  {
    p.setRoom(13);
  }
}
