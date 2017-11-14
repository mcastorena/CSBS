/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card6 extends card
{
  public card6()
  {
    this.name = "Exercising Mind and Body";
    this.locationName = "Student Recreation";
    this.reward = "1 Integrity Chip";
    setImage("images/cardm06.png");
  }
  
  public boolean play(player p)
  {
    printName();
    if (p.roomNumber == 5)
    {
      p.incrementIntegrity();
      return true;
    }
    return false;
  }
}
