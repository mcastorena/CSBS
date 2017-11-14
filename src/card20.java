/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card20 extends card
{
  public card20()
  {
    this.name = "Make the Dean's List";
    this.locationName = "North Hall or South Hall";
    this.reward = "5 Quality Points";
    setImage("/images/cardm20.png");
  }
  
  public boolean play(player p)
  {
    if ((p.roomNumber == 12) || (p.roomNumber == 15))
    {
      if (p.Learning >= 6)
      {
        p.setQP(5);
        return true;
      }
      fail(p);
      return false;
    }
    return false;
  }
  
  private void fail(player p)
  {
    p.setRoom(2);
  }
}
