/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card10 extends card
{
  public card10()
  {
    this.name = "CECS 105 ";
    this.locationName = "ECS 308 or ECS 302";
    this.reward = "1 Learning Chip";
    setImage("/images/cardm10.png");
  }
  
  public boolean play(player p)
  {
    Describe();
    if ((p.roomNumber == 14) || (p.roomNumber == 17))
    {
      p.incrementLearning();
      return true;
    }
    return false;
  }
}
