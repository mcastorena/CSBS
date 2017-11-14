/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card1 extends card
{
  public card1()
  {
    this.name = "Math 122";
    this.locationName = "Library";
    this.reward = "1 Knowledge Chip or 1 Honor Chip";
    setImage("/images/cardm01.png");
  }
  
  public boolean play(player p)
  {
    printName();
    if (p.roomNumber == 7)
    {
      if (p.humanPlayer)
      {
        chooseChip c = new chooseChip(true, false, true);
        if (c.selectedAttribute == "LRN") {
          p.incrementLearning();
        } else {
          p.incrementIntegrity();
        }
        return true;
      }
      p.incrementLearning(); //AI automatically increments learning not integrity
      return true;
    }
    return true;
  }
}

