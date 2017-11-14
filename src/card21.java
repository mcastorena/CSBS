/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card21 extends card
{
  public card21()
  {
    this.name = "Pass Soccer Class";
    this.locationName = "George Allen Field";
    this.reward = "5 Quality Points";
    setImage("images/cardm21.png");
  }
  
  public boolean play(player p)
  {
    if (p.roomNumber == 0)
    {
      if (p.Craft >= 5)
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
    p.setQP(-3);
  }
}