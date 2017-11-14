/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card35 extends card
{
  public card35()
  {
    this.name = "Learning Linux";
    this.locationName = "Computer Lab";
    this.reward = "3 Quality Points and a Chip of your choice";
    setImage("/images/cardm35.png");
  }
  
  public boolean play(player p)
  {
    if (p.roomNumber == 11)
    {
      if ((p.Craft >= 2) && (p.Integrity >= 3))
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
    p.setQP(-1);
  }
}