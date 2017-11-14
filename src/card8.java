/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card8 extends card
{
  public card8()
  {
    this.name = "Enjoying the Peace";
    this.locationName = "Japanese Gardens";
    this.reward = "1 Integrity Chip or 1 Learning Chip";
    setImage("/images/cardm08.png");
  }
  
  public boolean play(player p)
  {
    if (p.roomNumber == 1)
    {
      if (p.humanPlayer)
      {
        chooseChip c = new chooseChip(true, false, true);
        if (c.selectedAttribute == "LRN") {
          p.incrementLearning();
        } else {
          p.incrementIntegrity();
        }
      }
      else
      {
        p.incrementLearning(); //AI increments learning
      }
      return true;
    }
    return false;
  }
}
