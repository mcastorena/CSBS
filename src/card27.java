/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card27 extends card
{
  public card27()
  {
    this.name = "Loud Buzzing";
    this.locationName = "EAT Room";
    this.reward = "1 Chip of your choice";
    setImage("/images/cardm27.png");
  }
  
  public boolean play(player p)
  {
    if (p.roomNumber == 18)
    {
      if (p.Craft >= 3)
      {
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
    p.setQP(-2);
  }
}