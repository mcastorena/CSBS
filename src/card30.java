/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card30 extends card
{
  public card30()
  {
    this.name = "Elective Class";
    this.locationName = "Library";
    this.reward = "1 Learning Chip and 1 Game Card";
    setImage("images/cardm30.png");
  }
  
  public boolean play(player p)
  {
    if (p.roomNumber == 7)
    {
      if (p.Learning >= 2)
      {
        p.incrementLearning();
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
    p.setQP(-2);
  }
}
