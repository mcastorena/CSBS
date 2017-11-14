/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card24 extends card
{
  public card24()
  {
    this.name = "Meet the Dean";
    this.locationName = "North or South Hall";
    this.reward = "5 Quality Points and 1 Game Card";
    setImage("images/cardm24.png");
  }
  
  public boolean play(player p)
  {
    if ((p.roomNumber == 12) || (p.roomNumber == 15))
    {
      if ((p.Learning >= 3) && (p.Integrity >= 3) && (p.Craft >= 3))
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
    if (p.humanPlayer)
    {
//      CardDialog cd = new CardDialog();
//      cd.setVisible(true);
    }
  }
}
