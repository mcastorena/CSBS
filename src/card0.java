/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card0 extends card
{
  public card0()
  {
    this.name = "CECS 100";
    this.reward = "1 Learning Chip";
    this.locationName = "ECS 302 or 308";
    setImage("/images/cardm00.png");
  }
  
  public boolean play(player p)
  {
    printName();
    if ((p.roomNumber == 14) || (p.roomNumber == 17))
    {
      p.incrementLearning();
      return true;
    }
    return false;
  }
}
    
