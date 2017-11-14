/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card28 extends card
{
  public card28()
  {
    this.name = "Professor Englert";
    this.locationName = "CECS Conference";
    this.reward = "1 Chip of your choice";
    setImage("images/cardm28.png");
  }
  
  public boolean play(player p)
  {
    if (p.roomNumber == 19)
    {
      if (p.Integrity >= 3)
      {
        if (p.humanPlayer)
        {
          chooseChip c = new chooseChip(true, true, true);
          c.setVisible(true);
          if (c.selectedAttribute == "LRN") {
            p.incrementLearning();
          } else if (c.selectedAttribute == "INT") {
            p.incrementIntegrity();
          } else {
            p.incrementCraft();
          }
          return true;
        }
        p.incrementCraft();
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