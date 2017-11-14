/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card14 extends card
{
  
  public card14()
  {
    this.name = "Math 123";
    this.locationName = "ECS 302 or 308";
    this.reward = "5 Quality Points";
    setImage("/images/cardm14.png");
  }
  
  public boolean play(player p)
  {
    if ((p.roomNumber == 14) || (p.roomNumber == 17))
    {
      if (p.getLearning() >= 5)
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
    if (p.humanPlayer)
    {
//      CardDialog cd = new CardDialog();
//      cd.setVisible(true);
    }
  }
}