/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card36 extends card
{
  public card36()
  {
    this.name = "Make a Friend";
    this.locationName = "North or South Hall";
    this.reward = "3 Quality Points and a Chip of your choice";
    setImage("images/cardm36.png");
  }
  
  public boolean play(player p)
  {
    if ((p.roomNumber == 12) || (p.roomNumber == 15))
    {
      if (p.Integrity >= 2)
      {
        p.setQP(3);
        if (p.humanPlayer)
        {
          chooseChip c = new chooseChip(true, true, true);
          if (c.selectedAttribute == "LRN") {
            p.incrementLearning();
          } else if (c.selectedAttribute == "INT") {
            p.incrementIntegrity();
          } else {
            p.incrementCraft();
          }
          return true;
        }
        else
        {
          p.incrementLearning();
        }
        return true;
      }
      fail(p);
      return false;
    }
    return false;
  }
  
  private void fail(player p)
  {
//      CardDialog cd = new CardDialog();
//      cd.setVisible(true);  
  }
}