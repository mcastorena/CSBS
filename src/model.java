
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class model {
    ArrayList<player> players = new ArrayList();
    ArrayList<room> rooms = new ArrayList();
    cardDeck deck = new cardDeck();
    
    public model(){
        createPlayers();
        createRooms();
        dealHand(players.get(0));
        dealHand(players.get(1));
        dealHand(players.get(2));
    }
    
    
    
    public void createPlayers(){
        player player1 = new player(6,6,6,"Miguel");
        player player2 = new player(1,2,3,"Kevin");
        player player3 = new player(4,1,0,"Ivan");
        player1.humanPlayer = true;
        this.players.add(player1);
        this.players.add(player2);
        this.players.add(player3);
    }
    
    public void createRooms(){
        room myRoom = new room("George Allen Field",  0, 50, 50);
    
    Collections.addAll(myRoom.adjacentRooms, new Integer[] { Integer.valueOf(1), Integer.valueOf(5), Integer.valueOf(3), Integer.valueOf(4) });
    this.rooms.add(myRoom);
    
    myRoom = new room("Japanese Garden",  1, 314, 50);
    
    Collections.addAll(myRoom.adjacentRooms, new Integer[] { Integer.valueOf(0), Integer.valueOf(2), Integer.valueOf(3) });
    this.rooms.add(myRoom);
    
    myRoom = new room("Student Parking",  2, 737, 50);
    Collections.addAll(myRoom.adjacentRooms, new Integer[] { Integer.valueOf(1), Integer.valueOf(3), Integer.valueOf(5), Integer.valueOf(6) });
    this.rooms.add(myRoom);
    
    myRoom = new room("Pyramid",  3, 300, 200);
    Collections.addAll(myRoom.adjacentRooms, new Integer[] { Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(5) });
    this.rooms.add(myRoom);
    
    myRoom = new room("West Walkway",  4, 25, 470);
    Collections.addAll(myRoom.adjacentRooms, new Integer[] { Integer.valueOf(0), Integer.valueOf(5), Integer.valueOf(12), Integer.valueOf(7) });
    this.rooms.add(myRoom);
    
    myRoom = new room("Rec Center",  5, 320, 400);
    Collections.addAll(myRoom.adjacentRooms, new Integer[] { Integer.valueOf(0), Integer.valueOf(3), Integer.valueOf(2), Integer.valueOf(4), Integer.valueOf(6) });
    this.rooms.add(myRoom);
    
    myRoom = new room("Forbidden  Parking",  6, 750, 415);
    Collections.addAll(myRoom.adjacentRooms, new Integer[] { Integer.valueOf(2), Integer.valueOf(5), Integer.valueOf(10) });
    this.rooms.add(myRoom);
    
    myRoom = new room("Library",  7, 20, 1240);
    Collections.addAll(myRoom.adjacentRooms, new Integer[] { Integer.valueOf(4), Integer.valueOf(8) });
    this.rooms.add(myRoom);
    
    myRoom = new room("LA 5",  8, 350, 1240);
    Collections.addAll(myRoom.adjacentRooms, new Integer[] { Integer.valueOf(7), Integer.valueOf(9), Integer.valueOf(16) });
    this.rooms.add(myRoom);
    
    myRoom = new room("Bratwurst Hall",  9, 815, 1240);
    Collections.addAll(myRoom.adjacentRooms, new Integer[] { Integer.valueOf(10), Integer.valueOf(8) });
    this.rooms.add(myRoom);
    
    myRoom = new room("East Walkway",  10, 1050, 700);
    Collections.addAll(myRoom.adjacentRooms, new Integer[] { Integer.valueOf(6), Integer.valueOf(9), Integer.valueOf(15) });
    this.rooms.add(myRoom);
    
    myRoom = new room("Computer Lab",  11, 130, 630);
    Collections.addAll(myRoom.adjacentRooms, new Integer[] { Integer.valueOf(12) });
    this.rooms.add(myRoom);
    
    myRoom = new room("North Hall",  12, 130, 825);
    Collections.addAll(myRoom.adjacentRooms, new Integer[] { Integer.valueOf(4), Integer.valueOf(11), Integer.valueOf(13), Integer.valueOf(14), Integer.valueOf(15), Integer.valueOf(16) });
    this.rooms.add(myRoom);
    
    myRoom = new room("Room of Retirement",  13, 130, 960);
    Collections.addAll(myRoom.adjacentRooms, new Integer[] { Integer.valueOf(12) });
    this.rooms.add(myRoom);
    
    myRoom = new room("ECS 302",  14, 440, 630);
    Collections.addAll(myRoom.adjacentRooms, new Integer[] { Integer.valueOf(12), Integer.valueOf(15) });
    this.rooms.add(myRoom);
    
    myRoom = new room("South Hall",  15, 610, 825);
    Collections.addAll(myRoom.adjacentRooms, new Integer[] { Integer.valueOf(10), Integer.valueOf(12), Integer.valueOf(14), Integer.valueOf(17), Integer.valueOf(18), Integer.valueOf(19), Integer.valueOf(20) });
    this.rooms.add(myRoom);
    
    myRoom = new room("Elevators",  16, 430, 970);
    Collections.addAll(myRoom.adjacentRooms, new Integer[] { Integer.valueOf(8), Integer.valueOf(12) });
    this.rooms.add(myRoom);
    
    myRoom = new room("ECS 308",  17, 590, 970);
    
    Collections.addAll(myRoom.adjacentRooms, new Integer[] { Integer.valueOf(15) });
    this.rooms.add(myRoom);
    
    myRoom = new room("EAT Club",  18, 740, 640);
    Collections.addAll(myRoom.adjacentRooms, new Integer[] { Integer.valueOf(15) });
    this.rooms.add(myRoom);
    
    myRoom = new room("CECS Conference Room",  19, 900, 640);
    Collections.addAll(myRoom.adjacentRooms, new Integer[] { Integer.valueOf(15) });
    this.rooms.add(myRoom);
    
    myRoom = new room("Lactation Lounge",  20, 870, 970);
    Collections.addAll(myRoom.adjacentRooms, new Integer[] { Integer.valueOf(15) });
    this.rooms.add(myRoom);
    }
    
    public void dealHand(player p){
        for (int i = 0; i < 5; i++) {
      p.receiveCard(this.deck.dealOneCard());
    }
}
}
