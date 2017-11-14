/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card25 extends card
{
  public card25()
  {
    this.name = "Program Crashes";
    this.locationName = "Lactation Lounge";
    this.reward = "5 Quality Points and a chip of your choice";
    setImage("/images/cardm25.png");
  }
  
  public boolean play(player p)
  {
    if (p.roomNumber == 20)
    {
      if (p.Learning >= 2)
      {
        p.setQP(5);
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
    if (p.humanPlayer)
    {
//      CardDialog cd = new CardDialog();
//      cd.setVisible(true);
    }
  }
}
