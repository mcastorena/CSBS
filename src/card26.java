/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card26 extends card
{
  public card26()
  {
    this.name = "Press the Right Floor";
    this.locationName = "Elevators";
    this.reward = "2 Craft Chips";
    setImage("/images/cardm26.png");
  }
  
  public boolean play(player p)
  {
    if (p.roomNumber == 16)
    {
      if (p.Learning >= 4)
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
    p.setQP(-2);
  }
}
