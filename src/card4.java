/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card4 extends card
{
  public card4()
  {
    this.name = "Professor Murgolo's CECS 174";
    this.locationName = "ECS 302";
    this.reward = "1 Learning Chip";
    setImage("images/cardm04.png");
  }
  
  public boolean play(player p)
  {
    printName();
    if (p.roomNumber == 14)
    {
      p.incrementLearning();
      return true;
    }
    return false;
  }
}
