/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card3 extends card
{
  public card3()
  {
    this.name = "Researching Compilers";
    this.locationName = "Library";
    this.reward = "1 Learning Chip";
    setImage("/images/cardm03.png");
  }
  
  public boolean play(player p)
  {
    printName();
    if (p.roomNumber == 7)
    {
      p.incrementLearning();
      return true;
    }
    return false;
  }
}