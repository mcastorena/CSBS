/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card39 extends card
{
  public card39()
  {
    this.name = "Goodbye Professor";
    this.locationName = "Room of Retirement";
    this.reward = "10 Quality Points";
    setImage("images/cardm39.png");
  }
  
  public boolean play(player p)
  {
    if (p.roomNumber == 13)
    {
      if ((p.Learning >= 6) && (p.Integrity >= 6) && (p.Craft >= 6))
      {
        p.setQP(10);
        
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
  
}}