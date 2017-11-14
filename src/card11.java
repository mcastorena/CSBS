/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card11 extends card
{
  public card11()
  {
    this.name = "Buddy Up";
    this.locationName = "EAT Room or George Allen Field";
    this.reward = "1 Craft Chip or 1 Learning Chip";
    setImage("/images/cardm11.png");
  }
  
  public boolean play(player p)
  {
    Describe();
    if ((p.roomNumber == 0) || (p.roomNumber == 18))
    {
      if (p.humanPlayer)
      {
        chooseChip c = new chooseChip(true, true, false);
        if (c.selectedAttribute == "LRN") {
          p.incrementLearning();
        } else {
          p.incrementCraft();
        }
      }
      else
      {
        p.incrementCraft();
      }
      return true;
    }
    return false;
  }
}
