
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcast
 */
public class GUI extends javax.swing.JFrame {
   static gameMap myMap = new gameMap();
   static model myModel = new model();
   int cardNum = 0;
   int moves = 3;
   int currentPlayer = 0;
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        this.setTitle("CECS BS in CS Game First Iteration");
        ScrollPane.getViewport().add(myMap, WIDTH);
        myMap.myModel = this.myModel;
        setRoomList();
        setStats();
        setCardImg();
        disableButtons();
        drawCardButton.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        humanPlayerField = new javax.swing.JTextField();
        gameStatsField = new javax.swing.JTextField();
        cardImagePanel = new javax.swing.JLabel();
        playCardButton = new javax.swing.JButton();
        drawCardButton = new javax.swing.JButton();
        ScrollPane = new javax.swing.JScrollPane();
        moveButton = new javax.swing.JButton();
        roomListScrollPane = new javax.swing.JScrollPane();
        roomList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        humanPlayerField.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        humanPlayerField.setText("locationField");

        gameStatsField.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        gameStatsField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        cardImagePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cardImagePanelMouseClicked(evt);
            }
        });

        playCardButton.setText("Play Card");
        playCardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playCardButtonActionPerformed(evt);
            }
        });

        drawCardButton.setText("Draw Card");
        drawCardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawCardButtonActionPerformed(evt);
            }
        });

        moveButton.setText("Move");
        moveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveButtonActionPerformed(evt);
            }
        });

        roomListScrollPane.setViewportView(roomList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollPane)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(drawCardButton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(playCardButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(moveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(roomListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cardImagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gameStatsField)
                            .addComponent(humanPlayerField, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(gameStatsField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(humanPlayerField, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(drawCardButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(playCardButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(moveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roomListScrollPane))
                    .addComponent(cardImagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void moveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveButtonActionPerformed
        if (moves > 0){
        int getRoom = myMap.myModel.players.get(0).roomNumber;
        int selectedRoom = getSelectedRoom();
        if (selectedRoom == -1){
            JOptionPane.showMessageDialog(null, "Please select a room");
            return;
        }else if(selectedRoom != -1){
        for(int i = 0; i <3;i++){
        myMap.myModel.players.get(i).roomNumber = myMap.myModel.rooms.get(getRoom).adjacentRooms.get(getSelectedRoom()).intValue();
        }
        setRoomList();
        myMap.paintComponent(myMap.getGraphics());
        moves -= 1;
        if (moves == 0){moveButton.setEnabled(false);}
    
        }
        }
    }//GEN-LAST:event_moveButtonActionPerformed

    private void cardImagePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardImagePanelMouseClicked
        int cardsInHand = myModel.players.get(0).hand.size()-1;
        int currentCard = cardNum;
        
        if((currentCard+1) <= cardsInHand){
            cardNum += 1;
            setCardImg();   
        }else if(currentCard+1 > cardsInHand){
            cardNum = 0;
            setCardImg();
        }
    }//GEN-LAST:event_cardImagePanelMouseClicked

    private void drawCardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawCardButtonActionPerformed
        myModel.players.get(0).hand.add(myModel.deck.dealOneCard());
        drawCardButton.setEnabled(false);
        moves = 3;
        moveButton.setEnabled(true);
        playCardButton.setEnabled(true);
    }//GEN-LAST:event_drawCardButtonActionPerformed

    private void playCardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playCardButtonActionPerformed
        myModel.players.get(0).hand.get(cardNum).play(myModel.players.get(0));
        disableButtons();
        moves = 3;
    }//GEN-LAST:event_playCardButtonActionPerformed
    public void setCardImg(){
        cardImagePanel.setIcon(myModel.players.get(0).hand.get(cardNum).getImage());
    }
    
    public int getSelectedRoom(){
        return roomList.getSelectedIndex();
    }
    
    
    
    public void disableButtons(){
        moveButton.setEnabled(false);
        playCardButton.setEnabled(false);
        drawCardButton.setEnabled(false);
    }
    
    public void setRoomList(){
        
        player tempPlayer = myMap.myModel.players.get(0);
    
    int room = tempPlayer.getRoom();
    ArrayList<Integer> roomList = (myMap.myModel.rooms.get(room)).adjacentRooms;
    System.out.println(myMap.myModel.rooms.get(room).name);
    DefaultListModel adjacentRooms = new DefaultListModel();
    System.out.println(roomList.size());
    for (int i = 0; i < roomList.size(); i++) {
      adjacentRooms.addElement(myMap.myModel.rooms.get(roomList.get(i).intValue()).name);
      System.out.println(myMap.myModel.rooms.get(roomList.get(i).intValue()).name);
    }
    this.roomList.setModel(adjacentRooms);
    }
    
    public void setStats(){
        String stats = "    Learning    Craft   Integrity   Quality Points " + System.lineSeparator();
        for(int i = 0; i < 3 ; i++){
        stats += myModel.players.get(i).currentStats();
        }
        System.out.print(stats);
        gameStatsField.setText(stats);   
    }
    
    public void setHumanPlayerField(){
        String name = myMap.myModel.players.get(0).name;
        
    }
    
//    public void setLocationField(){
//       String name = myMap.myModel.players.get(0).name;
//       int myRoom = myMap.myModel.players.get(0).roomNumber;
//       String location = myMap.myModel.rooms.get(myRoom).name;
//       humanPlayerField.setText("You are "+name+" you are in room number "+myRoom+": "+location);
//    }
//    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GUI myGUI = new GUI();
                myGUI.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JLabel cardImagePanel;
    private javax.swing.JButton drawCardButton;
    private javax.swing.JTextField gameStatsField;
    private javax.swing.JTextField humanPlayerField;
    private javax.swing.JButton moveButton;
    private javax.swing.JButton playCardButton;
    private javax.swing.JList<String> roomList;
    private javax.swing.JScrollPane roomListScrollPane;
    // End of variables declaration//GEN-END:variables
}
