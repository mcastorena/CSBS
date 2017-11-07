/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snerf
 */
public class gameHandler {
    windowHandle vis;
    String mapImageDir;
    String currentImageDir;
    int nameTagSep;
    
    player pL1;
    player pL2;
    player pL3;
    
    public gameHandler(){
	//TODO account for diffrent file systems
	mapImageDir = "images/CSULBMap5_1200x1437.png";
	currentImageDir ="images/cardm00.png";
	nameTagSep = 25;
	
	pL1 = new player(4,2,0,"Miguel",1);
	pL2 = new player(3,1,3,"Ivan",1);
	pL3 = new player(3,7,2,"Kevin",1);
	
	vis = new windowHandle(pL1.getName(),pL2.getName(),pL3.getName(),mapImageDir,currentImageDir);
	vis.move0(600,1030);// this is the location of the first area
	vis.move1(600,1030-nameTagSep);
	vis.move2(600,1030+nameTagSep);
	
	pL1.setHuman();//player1 becomes a human
	
	//TODO make the map node thingy
	
    }
    
}
