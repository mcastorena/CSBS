/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card23 extends card
{
  public card23()
  {
    this.name = "A New Laptop";
    this.locationName = "Computer Lab";
    this.reward = "3 Quality Points and a chip of your choice";
    setImage("images/cardm23.png");
  }
  
  public boolean play(player p)
  {
    if (p.roomNumber == 11)
    {
      if (p.Integrity >= 4)
      {
        if (p.humanPlayer)
        {
          p.setQP(3);
          chooseChip c = new chooseChip(true, true, true);
          if (c.selectedAttribute == "LRN") {
            p.incrementLearning();
          } else if (c.selectedAttribute == "INT") {
            p.incrementIntegrity();
          } else {
            p.incrementCraft();
          }
        }
        else
        {
          p.setQP(3);
          p.incrementIntegrity();
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