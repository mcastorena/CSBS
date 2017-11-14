/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card18 extends card
{
  public card18()
  {
    this.name = "Choosing a Major";
    this.locationName = "CECS Conference";
    this.reward = "5 Quality Points";
    setImage("/images/cardm18.png");
  }
  
  public boolean play(player p)
  {
    if (p.roomNumber == 19)
    {
      if (p.Integrity >= 3)
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