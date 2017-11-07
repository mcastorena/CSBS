
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class room {
    String name;
    int roomNum;
    int xCoordinate;
    int yCoordinate;
    ArrayList<Integer> adjacentRooms = new ArrayList();
    
    public room(String name,int roomNumber, int x, int y){
        this.name = name;
        this.xCoordinate = x;
        this.yCoordinate = y;   
        this.roomNum = roomNumber;
    }
    
    public void setAdjacentRooms(int[] roomList, int n)
  {
    for (int i = 0; i < n; i++) {
      this.adjacentRooms.add(Integer.valueOf(roomList[i]));
    }
  }
    
}
