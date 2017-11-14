
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class card9 extends card
{
  public card9()
  {
    this.name = "Parking Violation";
    this.locationName = "Forbidden Parking";
    this.reward = "1 Learning Chip and discard 1 Game Card Card for 1 Learning Chip";
    setImage("/images/cardm09.png");
  }
  
  public boolean play(player p)
  {
    if (p.roomNumber == 6)
    {
      p.incrementLearning();
      if (p.humanPlayer)
      {
        int decide = JOptionPane.showConfirmDialog(null, "Would you like to trade 1 Game Card Card for 1 Learning Chip?", "Pick One", 0);
//        if (decide == 0)
//        {
//          CardDialog cd = new CardDialog();
//          cd.setVisible(true);
//          p.incKnowledge();
//        }
      }
      return true;
    }
    return false;
  }
}