/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card34 extends card
{
  public card34()
  {
    this.name = "CHEM 111";
    this.locationName = "Any building not ECS";
    this.reward = "5 Quality Points";
    setImage("images/cardm34.png");
  }
  
  public boolean play(player p)
  {
    if (((p.roomNumber >= 1) && (p.roomNumber <= 3)) || (p.roomNumber == 5) || ((p.roomNumber >= 7) && (p.roomNumber <= 9)))
    {
      if (p.Craft >= 6)
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