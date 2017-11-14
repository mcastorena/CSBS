/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card19 extends card
{
  public card19()
  {
    this.name = "Score a Goal!";
    this.locationName = "George Allen Field";
    this.reward = "5 Quality Points and 1 Integrity Chip";
    setImage("images/cardm19.png");
  }
  
  public boolean play(player p)
  {
    if (p.roomNumber == 0)
    {
      if (p.Craft >= 3)
      {
        p.setQP(5);
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
    p.setRoom(2);
  }
}