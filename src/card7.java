/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card7 extends card
{
  public card7()
  {
    this.name = "Finding the Lab";
    this.locationName = "Elevators";
    this.reward = "1 Integrity Chip";
    setImage("images/cardm07.png");
  }
  
  public boolean play(player p)
  {
    Describe();
    if (p.roomNumber == 16)
    {
      p.incrementIntegrity();
      return true;
    }
    return false;
  }
}
