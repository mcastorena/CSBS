/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card2 extends card
{
  public card2()
  {
    this.name = "Lunch at Bratwurst Hall";
    this.locationName = "Bratwurst Hall";
    this.reward = "1 Craft Token";
    setImage("images/cardm02.png");
  }
  
  public boolean play(player p)
  {
    printName();
    if (p.roomNumber == 9)
    {
      p.incrementCraft();
      return true;
    }
    return false;
  }
}