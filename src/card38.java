/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card38 extends card
{
  public card38()
  {
    this.name = "Student Parking";
    this.locationName = "Student Parking";
    this.reward = "1 Craft Chip and Teleport to Lactation Lounge";
    setImage("/images/cardm38.png");
  }
  
  public boolean play(player p)
  {
    if (p.roomNumber == 2)
    {
      p.incrementCraft();
      p.setRoom(20);
    }
    return false;
  }

}