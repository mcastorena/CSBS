/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card33 extends card
{
  public card33()
  {
    this.name = "Oral Communication";
    this.locationName = "Any building not ECS";
    this.reward = "4 Quality Points and a Chip of your choice";
    setImage("/images/cardm33.png");
  }
  
  public boolean play(player p)
  { 
    if (((p.roomNumber >= 1) && (p.roomNumber <= 3)) || (p.roomNumber == 5) || ((p.roomNumber >= 7) && (p.roomNumber <= 9)))
    {
      if (p.Integrity >= 4)
      {
        p.setQP(4);
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
          p.incrementCraft();
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
    if (p.humanPlayer)
    {
//      CardDialog cd = new CardDialog();
//      cd.setVisible(true);
    }
  }
}