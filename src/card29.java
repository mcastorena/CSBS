/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card29 extends card
{
  public card29()
  {
    this.name = "Soccer Goalie";
    this.locationName = "George Allen Field";
    this.reward = "5 Quality Points and 1 Game Card";
    setImage("images/cardm29.png");
  }
  
  public boolean play(player p)
  {
    if (p.roomNumber == 0)
    {
      if ((p.Craft >= 3) && (p.Learning >= 3))
      {
        p.setQP(5);
//        p.deal1Card(model.deck.dealOneCard());
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
