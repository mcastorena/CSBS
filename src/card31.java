/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card31 extends card
{
  public card31()
  {
    this.name = "Professor Hoffman";
    this.locationName = "Any room in ECS except Lactation Lounge";
    this.reward = "5 Quality Points and 2 Game Cards";
    setImage("images/cardm31.png");
  }
  
  public boolean play(player p)
  {if ((p.roomNumber >= 11) && (p.roomNumber <= 19))
    {
      if (p.Learning >= 3)
      {
        p.setQP(5);
//        p.deal1Card(model.deck.dealOneCard());
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
    p.setQP(-5);
    p.setRoom(20);
  }
}