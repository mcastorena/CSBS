/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card32 extends card
{
  public card32()
  {
    this.name = "The Outpost";
    this.locationName = "Any space outside ECS except Fobidden Parking";
    this.reward = "1 Chip of your choice";
    setImage("images/cardm32.png");
  }
  
  public boolean play(player p)
  {
    if (((p.roomNumber >= 0) && (p.roomNumber <= 5)) || ((p.roomNumber >= 7) && (p.roomNumber <= 10))) {
      if (p.humanPlayer){
          chooseChip c = new chooseChip(true, true, true);
          if (c.selectedAttribute == "LRN") {
            p.incrementLearning();
          } else if (c.selectedAttribute == "INT") {
            p.incrementIntegrity();
          } else {
            p.incrementCraft();
          }
          return true;
        }
        
      }
      return false;
  }}
    
  
