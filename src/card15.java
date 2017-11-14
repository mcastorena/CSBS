/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card15 extends card
{
  public card15()
  {
    this.name = "Physics 151";
    this.locationName = "ECS 308";
    this.reward = "5 Quality Points";
    setImage("/images/cardm15.png");
  }
  
  public boolean play(player p)
  {
    if ((p.roomNumber == 17) || (p.roomNumber == 14))
    {
      if (p.Craft >= 3)
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