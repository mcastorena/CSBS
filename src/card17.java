/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card17 extends card
{
  public card17()
  {
    this.name = "Learning Netbeans";
    this.locationName = "Lactation Lounge";
    this.reward = "5 Quality Points";
    setImage("images/cardm17.png");
  }
  
  public boolean play(player p)
  {
    if (p.roomNumber == 20)
    {
      if (p.Learning >= 3)
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