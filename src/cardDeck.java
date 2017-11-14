/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */

import java.util.ArrayList;
import java.util.Collections;

public class cardDeck 
{
  ArrayList<card> deck = new ArrayList();
  ArrayList<card> usedDeck = new ArrayList();
  card[] sortedDeck = new card[40];
  int topcard = 0;
  ArrayList<card> discardDeck = new ArrayList();
  
  public cardDeck(){
      createDeck();
      shuffleDeck();
  }

  public void createDeck()
  {
    this.sortedDeck[0] = new card0();
    Collections.addAll(this.sortedDeck[0].locations, new Integer[] { Integer.valueOf(14), Integer.valueOf(17) });
    this.sortedDeck[1] = new card1();
    Collections.addAll(this.sortedDeck[1].locations, new Integer[] { Integer.valueOf(7) });
    this.sortedDeck[2] = new card2();
    Collections.addAll(this.sortedDeck[2].locations, new Integer[] { Integer.valueOf(9) });
    this.sortedDeck[3] = new card3();
    Collections.addAll(this.sortedDeck[3].locations, new Integer[] { Integer.valueOf(7) });
    this.sortedDeck[4] = new card4();
    Collections.addAll(this.sortedDeck[4].locations, new Integer[] { Integer.valueOf(14) });
    this.sortedDeck[5] = new card5();
    Collections.addAll(this.sortedDeck[5].locations, new Integer[] { Integer.valueOf(17) });
    this.sortedDeck[6] = new card6();
    Collections.addAll(this.sortedDeck[6].locations, new Integer[] { Integer.valueOf(5) });
    this.sortedDeck[7] = new card7();
    Collections.addAll(this.sortedDeck[7].locations, new Integer[] { Integer.valueOf(16) });
    this.sortedDeck[8] = new card8();
    Collections.addAll(this.sortedDeck[8].locations, new Integer[] { Integer.valueOf(1) });
    this.sortedDeck[9] = new card9();
    Collections.addAll(this.sortedDeck[9].locations, new Integer[] { Integer.valueOf(6) });
    this.sortedDeck[10] = new card10();
    Collections.addAll(this.sortedDeck[10].locations, new Integer[] { Integer.valueOf(14), Integer.valueOf(17) });
    this.sortedDeck[11] = new card11();
    Collections.addAll(this.sortedDeck[11].locations, new Integer[] { Integer.valueOf(0), Integer.valueOf(18) });
    this.sortedDeck[12] = new card12();
    Collections.addAll(this.sortedDeck[12].locations, new Integer[] { Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(7), Integer.valueOf(8), Integer.valueOf(9), Integer.valueOf(10) });
    this.sortedDeck[13] = new card13();
    Collections.addAll(this.sortedDeck[13].locations, new Integer[] { Integer.valueOf(3) });
    this.sortedDeck[14] = new card14();
    Collections.addAll(this.sortedDeck[14].locations, new Integer[] { Integer.valueOf(14) });
    this.sortedDeck[15] = new card15();
    Collections.addAll(this.sortedDeck[15].locations, new Integer[] { Integer.valueOf(14) });
    this.sortedDeck[16] = new card16();
    Collections.addAll(this.sortedDeck[16].locations, new Integer[] { Integer.valueOf(0) });
    this.sortedDeck[17] = new card17();
    Collections.addAll(this.sortedDeck[17].locations, new Integer[] { Integer.valueOf(20) });
    this.sortedDeck[18] = new card18();
    Collections.addAll(this.sortedDeck[18].locations, new Integer[] { Integer.valueOf(19) });
    this.sortedDeck[19] = new card19();
    Collections.addAll(this.sortedDeck[19].locations, new Integer[] { Integer.valueOf(0) });
    this.sortedDeck[20] = new card20();
    Collections.addAll(this.sortedDeck[20].locations, new Integer[] { Integer.valueOf(12), Integer.valueOf(15) });
    this.sortedDeck[21] = new card21();
    Collections.addAll(this.sortedDeck[21].locations, new Integer[] { Integer.valueOf(0) });
    this.sortedDeck[22] = new card22();
    Collections.addAll(this.sortedDeck[22].locations, new Integer[] { Integer.valueOf(1) });
    this.sortedDeck[23] = new card23();
    Collections.addAll(this.sortedDeck[23].locations, new Integer[] { Integer.valueOf(11) });
    this.sortedDeck[24] = new card24();
    Collections.addAll(this.sortedDeck[24].locations, new Integer[] { Integer.valueOf(12), Integer.valueOf(15) });
    this.sortedDeck[25] = new card25();
    Collections.addAll(this.sortedDeck[25].locations, new Integer[] { Integer.valueOf(20) });
    this.sortedDeck[26] = new card26();
    Collections.addAll(this.sortedDeck[26].locations, new Integer[] { Integer.valueOf(16) });
    this.sortedDeck[27] = new card27();
    Collections.addAll(this.sortedDeck[27].locations, new Integer[] { Integer.valueOf(18) });
    this.sortedDeck[28] = new card28();
    Collections.addAll(this.sortedDeck[28].locations, new Integer[] { Integer.valueOf(19) });
    this.sortedDeck[29] = new card29();
    Collections.addAll(this.sortedDeck[29].locations, new Integer[] { Integer.valueOf(0) });
    this.sortedDeck[30] = new card30();
    Collections.addAll(this.sortedDeck[30].locations, new Integer[] { Integer.valueOf(7) });
    this.sortedDeck[31] = new card31();
    Collections.addAll(this.sortedDeck[31].locations, new Integer[] { Integer.valueOf(9), Integer.valueOf(10), Integer.valueOf(11), Integer.valueOf(12), Integer.valueOf(14), Integer.valueOf(15), Integer.valueOf(16), Integer.valueOf(17), Integer.valueOf(18) });
    this.sortedDeck[32] = new card32();
    Collections.addAll(this.sortedDeck[32].locations, new Integer[] { Integer.valueOf(10) });
    this.sortedDeck[33] = new card33();
    Collections.addAll(this.sortedDeck[33].locations, new Integer[] { Integer.valueOf(3), Integer.valueOf(5), Integer.valueOf(7), Integer.valueOf(9) });
    this.sortedDeck[34] = new card34();
    Collections.addAll(this.sortedDeck[34].locations, new Integer[] { Integer.valueOf(3), Integer.valueOf(5), Integer.valueOf(7), Integer.valueOf(9) });
    this.sortedDeck[35] = new card35();
    Collections.addAll(this.sortedDeck[35].locations, new Integer[] { Integer.valueOf(11) });
    this.sortedDeck[36] = new card36();
    Collections.addAll(this.sortedDeck[36].locations, new Integer[] { Integer.valueOf(12), Integer.valueOf(15) });
    this.sortedDeck[37] = new card37();
    Collections.addAll(this.sortedDeck[37].locations, new Integer[] { Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8), Integer.valueOf(9), Integer.valueOf(10) });
    this.sortedDeck[38] = new card38();
    Collections.addAll(this.sortedDeck[38].locations, new Integer[] { Integer.valueOf(2) });
    this.sortedDeck[39] = new card39();
    Collections.addAll(this.sortedDeck[39].locations, new Integer[] { Integer.valueOf(13) });
  }
  
 
  
  public void discard(card c)
  {
    this.discardDeck.add(c);
  }
  
  public card dealOneCard()
  {
    if (this.deck.isEmpty())
    {
      this.deck.addAll(this.discardDeck);
      this.discardDeck.removeAll(this.discardDeck);
      System.out.println("Shuffing deck ......");
    }
    return (card)this.deck.remove(0);
  }
  
    public void shuffleDeck()
  {
    int cards = 40;
    int r = (int)(Math.random() * 40);
    while (cards > 0)
    {
      r = (int)(Math.random() * 40);
      while ((this.sortedDeck[r] == null) && (cards > 0)) {
        r = (int)(Math.random() * 40);
      }
      cards--;
      
      this.deck.add(this.sortedDeck[r]);
      this.sortedDeck[r] = null;
    }
  }
  
  
  
}
